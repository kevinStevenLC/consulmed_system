package com.project.da.models.principal;

import java.util.List;

import com.project.da.models.detalles.TomaSignosVitalesDetalles;
import com.project.da.models.independiente.Enfermero;

public class TomaSignosVitales {

	int id;
	Enfermero enfermeroEncargado;
	String direccionLugar;
	// fichamedica/datos del paciente/
	Paciente paciente;
	List<TomaSignosVitalesDetalles> tomaSignosVitalesDetalles; // signos vitales evaluados

	// |id | id_enfermero | direccion | id_paciente | |
	public TomaSignosVitales(int id, Enfermero enfermeroEncargado, String direccionLugar,
			Paciente paciente, List<TomaSignosVitalesDetalles> tomaSignosVitalesDetalles) {
		this.id = id;
		this.enfermeroEncargado = enfermeroEncargado;
		this.direccionLugar = direccionLugar;
		this.paciente = paciente;
		this.tomaSignosVitalesDetalles = tomaSignosVitalesDetalles;
	}

}
