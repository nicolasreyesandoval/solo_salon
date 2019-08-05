package com.solosalon.servicio.usuario.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.solosalon.servicio.usuario.dao.IPaisDAO;
import com.solosalon.servicio.usuario.entity.Pais;

@Service
public class PaisServiceImpl implements IPaisService {
	
	@Autowired
	private IPaisDAO paisDao;

	@Override
	@Transactional(readOnly = true)
	public List<Pais> findAll() {
		return (List<Pais>)paisDao.findAll();
	}

	@Override
	public void save(Pais pais) {
		paisDao.save(pais);
	}

	@Override
	@Transactional(readOnly = true)
	public Pais findById(int id) {
		return paisDao.findById(id).orElse(null);
	}

	@Override
	public void delete(Pais pais) {
		paisDao.delete(pais);
		
	}
	

}
