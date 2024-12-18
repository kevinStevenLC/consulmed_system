package com.project.da.models;

//@table
public class Antecedentes {

	int id;
	String tipo;
	String descripcion;

	public Antecedentes(int id, String tipo, String descripcion) {
		this.id = id;
		this.tipo = tipo;
		this.descripcion = descripcion;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
