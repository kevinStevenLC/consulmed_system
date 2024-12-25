package com.project.da.models.principal;

import java.util.ArrayList;
import java.util.List;

import com.project.da.models.detalles.TomaSignosVitalesDetalles;
import com.project.da.models.independiente.Enfermero;

public class TomaSignosVitales {

	int id;
	Enfermero enfermeroEncargado;
	String direccionLugar;
	// fichamedica/datos del paciente/
	Paciente paciente;
	List<TomaSignosVitalesDetalles> tomaSignosVitalesDetalles; // signos vitales evaluados //

	// |id | id_enfermero | direccion | id_paciente | |
	public TomaSignosVitales(Enfermero enfermeroEncargado, String direccionLugar,
			Paciente paciente) {
		this.enfermeroEncargado = enfermeroEncargado;
		this.direccionLugar = direccionLugar;
		this.paciente = paciente;
		this.tomaSignosVitalesDetalles = new ArrayList<>();
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Enfermero getEnfermeroEncargado() {
		return this.enfermeroEncargado;
	}

	public void setEnfermeroEncargado(Enfermero enfermeroEncargado) {
		this.enfermeroEncargado = enfermeroEncargado;
	}

	public String getDireccionLugar() {
		return this.direccionLugar;
	}

	public void setDireccionLugar(String direccionLugar) {
		this.direccionLugar = direccionLugar;
	}

	public Paciente getPaciente() {
		return this.paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public List<TomaSignosVitalesDetalles> getTomaSignosVitalesDetalles() {
		return this.tomaSignosVitalesDetalles;
	}

	public void setTomaSignosVitalesDetalles(List<TomaSignosVitalesDetalles> tomaSignosVitalesDetalles) {
		this.tomaSignosVitalesDetalles = tomaSignosVitalesDetalles;
	}

}
