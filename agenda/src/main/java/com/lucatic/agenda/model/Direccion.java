package com.lucatic.agenda.model;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;


/**
 * @author grupo2
 * 
 * @version 2.0
 * 
 * @date 16/05/2019
 * 
 * @Description modelo de la tabla direccion 
 * 
 * The persistent class for the direccion database table.
 * 
 */
@Entity
@NamedQuery(name="Direccion.findAll", query="SELECT d FROM Direccion d")
public class Direccion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int iddireccion;

	private String codpostal;

	private String direccion;

	private String localidad;

	//bi-directional many-to-one association to Persona
	@ManyToOne
	@JsonIgnore
	@JoinColumn(name="idpersona")
	private Persona persona;

	//bi-directional many-to-one association to Provincia
	@ManyToOne
	@JsonIgnore
	@JoinColumn(name="idprovincia")
	private Provincia provincia;

	public Direccion() {
	}

	public int getIddireccion() {
		return this.iddireccion;
	}

	public void setIddireccion(int iddireccion) {
		this.iddireccion = iddireccion;
	}

	public String getCodpostal() {
		return this.codpostal;
	}

	public void setCodpostal(String codpostal) {
		this.codpostal = codpostal;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getLocalidad() {
		return this.localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public Persona getPersona() {
		return this.persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public Provincia getProvincia() {
		return this.provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}

	@Override
	public String toString() {
		return "Direccion [iddireccion=" + iddireccion + ", codpostal=" + codpostal + ", direccion=" + direccion
				+ ", localidad=" + localidad;
	}

}