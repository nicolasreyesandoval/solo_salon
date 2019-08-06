package com.solosalon.servicio.usuario.dao;

import org.springframework.data.repository.CrudRepository;

import com.solosalon.servicio.usuario.entity.Persona;

public interface IPersonaDAO extends CrudRepository<Persona, Integer> {

}
