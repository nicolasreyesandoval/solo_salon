package com.solosalon.servicio.usuario.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pais implements Serializable {

	private static final long serialVersionUID = -8988999236561699969L;

	@Id
	@Column(unique = true, nullable = false)
	private int id;
	
	@Column(name = "nombre_pais",nullable = false)
	private String nombrePais;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombrePais() {
		return nombrePais;
	}

	public void setNombrePais(String nombrePais) {
		this.nombrePais = nombrePais;
	}
	
	

}
