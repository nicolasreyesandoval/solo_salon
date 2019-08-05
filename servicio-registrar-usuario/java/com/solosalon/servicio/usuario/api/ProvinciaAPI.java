package com.solosalon.servicio.usuario.api;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.solosalon.servicio.usuario.entity.Provincia;
import com.solosalon.servicio.usuario.service.IProvinciaService;

@RestController /*Anotacion que indica que es una API rest*/
@RequestMapping("/provincias") /*Aca generamos la URL*/
public class ProvinciaAPI {

	@Autowired
	private IProvinciaService provinciaService;
	
	@GetMapping("/todas")
	private List<Provincia> obtenerTodasLasProvincias(){
		return provinciaService.getAllProvincias();
	}
	
	@GetMapping("/provincia/{id}")
	private String buscarRegionPorProvincia(@PathVariable int id) {
		return provinciaService.getRegionPorProvincia(id).getCapital();
	}
}

//org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'provinciaAPI': Unsatisfied dependency expressed through field 'provinciaService'; nested exception is org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'provinciaServiceImpl': Unsatisfied dependency expressed through field 'provinciaDao'; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'IProvinciaDAO': Invocation of init method failed; nested exception is java.lang.IllegalArgumentException: Failed to create query for method public abstract java.util.List com.solosalon.servicio.usuario.dao.IProvinciaDAO.getProvinciasRegion(int)! No property getProvinciasRegion found for type Provincia!
//org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'requestMappingHandlerAdapter' defined in class path resource [org/springframework/boot/autoconfigure/web/servlet/WebMvcAutoConfiguration$EnableWebMvcConfiguration.class]: Bean instantiation via factory method failed; nested exception is org.springframework.beans.BeanInstantiationException: Failed to instantiate [org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter]: Factory method 'requestMappingHandlerAdapter' threw exception; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'mvcConversionService' defined in class path resource [org/springframework/boot/autoconfigure/web/servlet/WebMvcAutoConfiguration$EnableWebMvcConfiguration.class]: Bean instantiation via factory method failed; nested exception is org.springframework.beans.BeanInstantiationException: Failed to instantiate [org.springframework.format.support.FormattingConversionService]: Factory method 'mvcConversionService' threw exception; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'IComuna': Invocation of init method failed; nested exception is java.lang.IllegalArgumentException: Failed to create query for method public abstract com.solosalon.servicio.usuario.entity.Comuna com.solosalon.servicio.usuario.dao.IComuna.getComunaProvincia(int)! No property getComunaProvincia found for type Comuna!