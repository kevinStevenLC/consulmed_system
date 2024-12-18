package com.project.da.models;

//@table
public class ConsultaMedica {

	String id;
	String numeroConsulta;
	FichaMedica fichaMedica;
	TomaSignosVitales tomaSignosVitales; // contiene todos los datos, ficha, paciente, etc.
	ExamenFisico examenFisico;
	ExamenAdicional examenAdicional;

}
