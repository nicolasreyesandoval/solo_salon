package com.solosalon.servicio.usuario.dao;

import java.util.List;

import com.solosalon.servicio.usuario.entity.Comuna;
import com.solosalon.servicio.usuario.entity.Provincia;
import com.solosalon.servicio.usuario.entity.Region;

public interface IComunaDAO{
	
	public List<Comuna> buscarTodasLasComunas();
	
	public Comuna buscarComuna(Integer id);
	
	public Region buscarRegionPorComuna(Integer id);
	
	public Provincia buscarProvinciaPorComuna(Integer id);
	
}
