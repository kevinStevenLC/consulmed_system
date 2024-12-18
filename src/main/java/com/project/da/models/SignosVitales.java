package com.project.da.models;

public class SignosVitales {

	int id;
	String tipo;
	String descripcion;
	double valor;
	String observaciones;

	public SignosVitales(int id, String tipo, String descripcion, double valor, String observaciones) {
		this.id = id;
		this.tipo = tipo;
		this.descripcion = descripcion;
		this.valor = valor;
		this.observaciones = observaciones;
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

	public double getValor() {
		return this.valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getObservaciones() {
		return this.observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

}
