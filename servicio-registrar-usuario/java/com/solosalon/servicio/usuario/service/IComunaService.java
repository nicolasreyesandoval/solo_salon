package com.solosalon.servicio.usuario.service;

import java.util.List;

import com.solosalon.servicio.usuario.entity.Comuna;
import com.solosalon.servicio.usuario.entity.Provincia;
import com.solosalon.servicio.usuario.entity.Region;

public interface IComunaService {

	public List<Comuna> buscarTodasLasComunas();
	
	public Comuna buscarComuna(Integer id);
	
	public Region buscarRegionPorComuna(Integer id);
	
	public Provincia buscarProvinciaPorComuna(Integer id);

}
