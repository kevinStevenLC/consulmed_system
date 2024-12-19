package com.project.da.models.independiente;

//@table
public class ExamenAdicional {
	int id;
	String grupo;
	String descripcion;

	public ExamenAdicional(int id, String grupo, String descripcion) {
		this.id = id;
		this.grupo = grupo;
		this.descripcion = descripcion;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGrupo() {
		return this.grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
