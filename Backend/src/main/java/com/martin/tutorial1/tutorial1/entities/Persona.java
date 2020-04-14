package com.martin.tutorial1.tutorial1.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "personas")
public class Persona extends EntidadBase {

	String nombre;
	String apellido;

	public Persona() {
	}

	public Persona(Long id, String nombre, String apellido) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

}
