package com.solosalon.servicio.usuario.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.solosalon.servicio.usuario.entity.Comuna;
import com.solosalon.servicio.usuario.entity.Provincia;
import com.solosalon.servicio.usuario.entity.Region;

@Repository
public class ComunaDAOImpl implements IComunaDAO {

	@PersistenceContext
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	@Override
	@Transactional(readOnly = true)
	public List<Comuna> buscarTodasLasComunas() {
		return em.createQuery("from Comuna").getResultList();
	}

	@Override
	@Transactional(readOnly = true)
	public Comuna buscarComuna(Integer id) {
		return em.find(Comuna.class, id);
	}

	@Override
	@Transactional(readOnly = true)
	public Region buscarRegionPorComuna(Integer id) {
		Region region = buscarComuna(id).getProvincia().getRegion();
		return region;
	}

	@Override
	@Transactional(readOnly = true)
	public Provincia buscarProvinciaPorComuna(Integer id) {
		Provincia provincia = buscarComuna(id).getProvincia();
		return provincia;
	}
}
