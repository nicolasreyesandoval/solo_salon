package com.solosalon.servicio.usuario.dao;


import org.springframework.data.repository.CrudRepository;

import com.solosalon.servicio.usuario.entity.Provincia;

public interface IProvinciaDAO extends CrudRepository<Provincia, Integer> {
	
	
}
