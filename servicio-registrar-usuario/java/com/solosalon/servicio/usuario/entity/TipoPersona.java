package com.solosalon.servicio.usuario.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "tipo_persona")
public class TipoPersona implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(nullable = false,unique = true)
	private Integer id;
	
	@Column(name = "tipo_persona", nullable = false,length = 30)
	private String tipoPersona;

	@OneToMany(mappedBy = "tipoPersona",fetch = FetchType.LAZY)
	@JsonIgnore
	private List<Persona> personas;
	
	public TipoPersona() {
		this.personas = new ArrayList<Persona>();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTipoPersona() {
		return tipoPersona;
	}

	public void setTipoPersona(String tipoPersona) {
		this.tipoPersona = tipoPersona;
	}

	public List<Persona> getPersonas() {
		return personas;
	}

	public void setPersonas(List<Persona> personas) {
		this.personas = personas;
	}
	
}
