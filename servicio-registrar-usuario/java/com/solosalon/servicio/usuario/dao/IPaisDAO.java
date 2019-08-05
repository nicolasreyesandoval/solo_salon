package com.solosalon.servicio.usuario.dao;

import org.springframework.data.repository.CrudRepository;

import com.solosalon.servicio.usuario.entity.Pais;

public interface IPaisDAO extends CrudRepository<Pais, Integer> {

}
