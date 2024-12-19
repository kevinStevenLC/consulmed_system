package com.project.da.models.independiente;

//@table
public class Enfermero {

	int id;
	String nombresCompletos;

	public Enfermero(int id, String nombresCompletos) {
		this.id = id;
		this.nombresCompletos = nombresCompletos;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombresCompletos() {
		return this.nombresCompletos;
	}

	public void setNombresCompletos(String nombresCompletos) {
		this.nombresCompletos = nombresCompletos;
	}

}
