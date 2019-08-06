package com.solosalon.servicio.usuario.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.solosalon.servicio.usuario.dao.IPersonaDAO;
import com.solosalon.servicio.usuario.entity.Persona;

@Service
public class PersonaServiceImpl implements IPersonaService {

	@Autowired
	private IPersonaDAO personaDao;
	
	@Override
	public Persona guardaPersona(Persona persona) {
		return personaDao.save(persona);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Persona> listarPersonas() {
		return (List<Persona>)personaDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Persona buscarPersona(Integer id) {
		return personaDao.findById(id).orElse(null);
	}

	@Override
	public Persona modificarPersona(Persona persona) {
		return personaDao.save(persona);
	}

	@Override
	public void eliminarPersona(Persona persona) {
		personaDao.delete(persona);
	}

}
