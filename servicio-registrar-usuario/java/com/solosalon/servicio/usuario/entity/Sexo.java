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
public class Sexo implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(nullable = false,unique = true)
	private Integer id;
	
	@Column(nullable = false)
	private String descripcion;

	@OneToMany(mappedBy = "sexo",fetch = FetchType.LAZY)
	@JsonIgnore
	private List<Persona> personas;
	
	public Sexo() {
		personas = new ArrayList<Persona>();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<Persona> getPersona() {
		return personas;
	}

	public void setPersona(List<Persona> persona) {
		this.personas = persona;
	}
	

}
