package com.solosalon.servicio.usuario.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Provincia implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id",unique = true)
	private int id;
	
	@Column(nullable = false)
	private String provincia;
	
	//Para poder hacer las relaciones con las otras tablas, la lectura es 
	//Many (Clase donde estamos) toOne (Clase que creamos como atributo)
	//Adicionalmente, debe ir el JoinColumn, haciendo referencia al campo en la base de datos, que es la llave foranea
	//ademas, se deben incluir los atributos insertable y updatable
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_region",insertable = false, updatable = false)
	private Region region;
	
	@OneToMany(mappedBy = "comuna", fetch = FetchType.EAGER)
	@JsonIgnore
	private List<Comuna> comunas;
	
	public Provincia() {
		comunas = new ArrayList<Comuna>();
	}

	public Provincia(int id, String provincia, int idRegion) {
		super();
		this.id = id;
		this.provincia = provincia;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

	public List<Comuna> getComunas() {
		return comunas;
	}

	public void setComunas(List<Comuna> comunas) {
		this.comunas = comunas;
	}
	
}
