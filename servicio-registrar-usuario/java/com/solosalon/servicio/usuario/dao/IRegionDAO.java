package com.solosalon.servicio.usuario.dao;

import org.springframework.data.repository.CrudRepository;
import com.solosalon.servicio.usuario.entity.Region;

public interface IRegionDAO extends CrudRepository<Region, Integer> {
	

}
