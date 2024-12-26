package com.project.da.models.detalles;

import com.project.da.models.independiente.ExamenAdicional;
import com.project.da.models.principal.ConsultaMedica;

public class ExamenDetallesAdicionales {

	int id;
	String grupo;
	ExamenAdicional examenAdicional;
	ConsultaMedica consultaMedica;

	public ExamenDetallesAdicionales(String grupo, ExamenAdicional examenAdicional,
			ConsultaMedica consultaMedica) {
		this.grupo = grupo;
		this.examenAdicional = examenAdicional;
		this.consultaMedica = consultaMedica;
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

	public ExamenAdicional getExamenAdicional() {
		return this.examenAdicional;
	}

	public void setExamenAdicional(ExamenAdicional examenAdicional) {
		this.examenAdicional = examenAdicional;
	}

	public ConsultaMedica getConsultaMedica() {
		return this.consultaMedica;
	}

	public void setConsultaMedica(ConsultaMedica consultaMedica) {
		this.consultaMedica = consultaMedica;
	}

}
