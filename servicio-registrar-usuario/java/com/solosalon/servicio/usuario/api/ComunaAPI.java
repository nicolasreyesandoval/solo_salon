package com.solosalon.servicio.usuario.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.solosalon.servicio.usuario.entity.Comuna;
import com.solosalon.servicio.usuario.entity.Provincia;
import com.solosalon.servicio.usuario.service.IComunaService;

@RestController
@RequestMapping(path = "/comunas")
public class ComunaAPI {

	@Autowired
	private IComunaService comunaService;
	
	@GetMapping("/todas")
	private List<Comuna> obtenerComunas(){
		return comunaService.buscarTodasLasComunas();
	}
	
	@GetMapping("/comuna/{id}")
	private Comuna obtenerComuna(@PathVariable Integer id) {
		return comunaService.buscarComuna(id);
	}
	
	@GetMapping("/provincia/{id}")
	private Provincia obtenerProvinciaPorComuna(@PathVariable Integer id) {
		return comunaService.buscarProvinciaPorComuna(id);
	}
}
