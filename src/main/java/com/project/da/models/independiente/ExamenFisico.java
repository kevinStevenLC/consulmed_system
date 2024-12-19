package com.project.da.models.independiente;

public class ExamenFisico {
	int id;
	String grupo;
	String padecimiento;
	String descripcion;

	public ExamenFisico(int id, String grupo, String padecimiento, String descripcion) {
		this.id = id;
		this.grupo = grupo;
		this.padecimiento = padecimiento;
		this.descripcion = descripcion;
	}

	public String getGrupo() {
		return this.grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPadecimiento() {
		return this.padecimiento;
	}

	public void setPadecimiento(String padecimiento) {
		this.padecimiento = padecimiento;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
