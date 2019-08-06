package com.solosalon.servicio.usuario.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Persona implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(nullable = false, unique = true)
	private Integer id;
	
	@Column(length = 120, nullable = false)
	private String nombre;
	
	@Column(length = 50, nullable = false)
	private String apellidoPaterno;
	
	@Column(length = 50, nullable = false)
	private String apellidoMaterno;
	
	@Column(name = "f_nacimiento", nullable = true)
	private Date fechaNacimiento;
	
	@Column(length = 11, nullable = false, unique = true)
	private String run;
	
	@Column(name = "email", nullable = false)
	private String correoElectronico;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_direccion",insertable = false, updatable = false)
	private Direccion direccion;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_tipo_persona",insertable = false, updatable = false)
	private TipoPersona tipoPersona;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_sexo",insertable = false, updatable = false)
	private Sexo sexo;
	
	
	
	public Persona() {
		super();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public TipoPersona getTipoPersona() {
		return tipoPersona;
	}

	public void setTipoPersona(TipoPersona tipoPersona) {
		this.tipoPersona = tipoPersona;
	}

	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", apellidoPaterno=" + apellidoPaterno
				+ ", apellidoMaterno=" + apellidoMaterno + ", fechaNacimiento=" + fechaNacimiento + ", run=" + run
				+ ", correoElectronico=" + correoElectronico + ", direccion=" + direccion.getDireccion() + ", tipoPersona="
				+ tipoPersona.getTipoPersona() + ", sexo=" + sexo.getDescripcion() + "]";
	}
	
	
}
