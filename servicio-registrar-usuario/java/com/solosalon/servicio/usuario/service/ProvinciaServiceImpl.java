package com.solosalon.servicio.usuario.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.solosalon.servicio.usuario.dao.IProvinciaDAO;
import com.solosalon.servicio.usuario.entity.Provincia;
import com.solosalon.servicio.usuario.entity.Region;

@Service
public class ProvinciaServiceImpl implements IProvinciaService{

	@Autowired
	private IProvinciaDAO provinciaDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Provincia> getAllProvincias() {
		return (List<Provincia>)provinciaDao.findAll();
	}

	@Override
	public Provincia getProvincia(int idProvincia) {
		return provinciaDao.findById(idProvincia).orElse(null);
	}

	@Override
	public void updateProvincia(Provincia provincia) {
		provinciaDao.save(provincia);
		
	}

	@Override
	public void deleteProvincia(Provincia provincia) {
		provinciaDao.delete(provincia);
		
	}

	@Override
	@Transactional(readOnly = true)
	public Region getRegionPorProvincia(int idProvincia) {
		return getProvincia(idProvincia).getRegion();
	}
	
}
