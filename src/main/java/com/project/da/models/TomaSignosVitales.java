package com.project.da.models;

import java.util.List;

public class TomaSignosVitales {

	int id;
	Enfermero enfermeroEncargado;
	String direccionLugar;

	// fichamedica/datos del paciente/
	FichaMedica fichaMedica;
	List<SignosVitales> signosVitalesList; // signos vitales evaluados

	public TomaSignosVitales(int id, Enfermero enfermeroEncargado, String direccionLugar,
			FichaMedica fichaMedica, List<SignosVitales> signosVitalesList) {
		this.id = id;
		this.enfermeroEncargado = enfermeroEncargado;
		this.direccionLugar = direccionLugar;
		this.fichaMedica = fichaMedica;
		this.signosVitalesList = signosVitalesList;
	}

}
