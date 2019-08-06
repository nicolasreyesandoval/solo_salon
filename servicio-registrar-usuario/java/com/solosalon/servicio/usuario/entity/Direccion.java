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
public class Direccion implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(nullable = false, unique = true)
	private Integer id;
	
	@Column(length = 255, nullable = false)
	private String direccion;
	
	@Column(length = 50, nullable = true)
	private String departamento;
	
	@Column(name = "codigo_postal", length = 11, nullable = false)
	private Integer codigoPostal;
	
	@OneToMany(mappedBy = "direccion", fetch = FetchType.LAZY)
	@JsonIgnore
	private List<Persona> personas;

	public Direccion() {
		super();
		this.personas = new ArrayList<Persona>();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public Integer getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(Integer codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public List<Persona> getPersonas() {
		return personas;
	}

	public void setPersonas(List<Persona> personas) {
		this.personas = personas;
	}
	
}
