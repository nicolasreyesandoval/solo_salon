package com.solosalon.servicio.usuario.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.solosalon.servicio.usuario.dao.IComunaDAO;
import com.solosalon.servicio.usuario.entity.Comuna;
import com.solosalon.servicio.usuario.entity.Provincia;
import com.solosalon.servicio.usuario.entity.Region;

@Service
public class ComunaServiceImpl implements IComunaService {

	@Autowired
	private IComunaDAO comunaDao;
	
	@Override
	public List<Comuna> buscarTodasLasComunas() {
		return comunaDao.buscarTodasLasComunas();
	}

	@Override
	public Comuna buscarComuna(Integer id) {
		return comunaDao.buscarComuna(id);
	}

	@Override
	public Region buscarRegionPorComuna(Integer id) {
		return comunaDao.buscarRegionPorComuna(id);
	}

	@Override
	public Provincia buscarProvinciaPorComuna(Integer id) {
		return comunaDao.buscarProvinciaPorComuna(id);
	}

}
