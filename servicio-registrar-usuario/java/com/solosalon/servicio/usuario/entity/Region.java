package com.solosalon.servicio.usuario.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Region implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(unique = true,nullable = false)
	private int id;
	
	@Column(length = 60,unique = true,nullable = false)
	private String region;
	
	@Column(nullable = false,unique = true)
	private String abreviatura;
	
	@Column(nullable = false)
	private String capital;

	@OneToMany(mappedBy = "provincia", fetch = FetchType.LAZY)
	@JsonIgnore
	private List<Provincia> listadoProvincias;
	
	public Region() {
		listadoProvincias = new ArrayList<Provincia>();
	}

	public int getId() {
		return id;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getAbreviatura() {
		return abreviatura;
	}

	public void setAbreviatura(String abreviatura) {
		this.abreviatura = abreviatura;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public List<Provincia> getListadoProvincias() {
		return listadoProvincias;
	}

	public void setListadoProvincias(List<Provincia> listadoProvincias) {
		this.listadoProvincias = listadoProvincias;
	}
	
	
}
