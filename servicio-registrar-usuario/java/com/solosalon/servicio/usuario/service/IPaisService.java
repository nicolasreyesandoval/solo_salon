package com.solosalon.servicio.usuario.service;

import java.util.List;

import com.solosalon.servicio.usuario.entity.Pais;


public interface IPaisService {

	public List<Pais> findAll();
	
	public void save(Pais pais);
	
	public Pais findById(int id);
	
	public void delete(Pais pais);
}
