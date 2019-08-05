package com.solosalon.servicio.usuario.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.solosalon.servicio.usuario.entity.Pais;
import com.solosalon.servicio.usuario.service.IPaisService;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController /*Anotacion que indica que es una API rest*/
@RequestMapping("/api") /*Aca generamos la URL*/
public class PaisAPI {

	@Autowired
	private IPaisService paisService;
	
	@GetMapping("/paises")
	public List<Pais> index() {
		return this.paisService.findAll();
	}
}
