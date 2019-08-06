package com.solosalon.servicio.usuario.service;

import java.util.List;

import com.solosalon.servicio.usuario.entity.Persona;

public interface IPersonaService {

	public Persona guardaPersona(Persona persona);
	
	public List<Persona> listarPersonas();
	
	public Persona buscarPersona(Integer id);
	
	public Persona modificarPersona(Persona persona);
	
	public void eliminarPersona(Persona persona);
}
