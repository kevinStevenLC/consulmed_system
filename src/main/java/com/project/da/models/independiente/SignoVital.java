package com.project.da.models.independiente;

public class SignoVital {

	int id;
	String descripcion;

	// |id |descripcion|
	public SignoVital(int id, String descripcion) {
		this.id = id;
		this.descripcion = descripcion;

	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
