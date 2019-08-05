package com.solosalon.servicio.usuario.service;

import java.util.List;

import com.solosalon.servicio.usuario.entity.Provincia;
import com.solosalon.servicio.usuario.entity.Region;

public interface IProvinciaService{
	
	public List<Provincia> getAllProvincias();

	public Provincia getProvincia(int idProvincia);
	
//	public List<Provincia> getProvinciasPorRegion(int idRegion);
	
	public Region getRegionPorProvincia(int idRegion);
	
	public void updateProvincia(Provincia provincia);
	
	public void deleteProvincia(Provincia provincia);
}
