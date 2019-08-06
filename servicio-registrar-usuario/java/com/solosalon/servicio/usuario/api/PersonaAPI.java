package com.solosalon.servicio.usuario.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.solosalon.servicio.usuario.entity.Persona;
import com.solosalon.servicio.usuario.service.IPersonaService;

@Controller
@RequestMapping(path = "/personas")
public class PersonaAPI {

	@Autowired
	private IPersonaService personaService;
	
	@PostMapping("/crear")
	private Persona crearPersona(@RequestBody Persona persona) {
		Persona agregada = personaService.guardaPersona(persona);
		System.out.println("Agregada: "+agregada.toString());
		return agregada;
	}
	
	@GetMapping("/persona/{id}")
	private Persona buscarPersona(@PathVariable Integer id) {
		Persona persona =personaService.buscarPersona(id);
		System.out.println("Persona: "+persona.toString());
		return persona;
	}
}
