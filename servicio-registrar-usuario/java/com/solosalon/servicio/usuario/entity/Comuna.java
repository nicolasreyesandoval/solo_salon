package com.solosalon.servicio.usuario.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Comuna implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(unique = true, nullable = false)
	private int id;
	
	@Column(nullable = false)
	private String comuna;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_provincia",insertable = false, updatable = false)
	@JsonIgnore /*Se utiliza cuando las clases se llaman unidreccionalmente, ya que se queda en un loop, y de esta forma, se logra romper*/
	private Provincia provincia;
	
	public Comuna() {
	
	}

	public Comuna(String comuna, Provincia provincia) {
		this.provincia = provincia;
		this.comuna = comuna;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getComuna() {
		return comuna;
	}

	public void setComuna(String comuna) {
		this.comuna = comuna;
	}

	public Provincia getProvincia() {
		return provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}
	
}
