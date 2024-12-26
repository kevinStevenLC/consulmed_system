package com.project.da.models.detalles;

import com.project.da.models.independiente.ExamenFisico;
import com.project.da.models.principal.ConsultaMedica;

public class ExamenDetallesFisicos {

	int id;
	String grupo;
	ExamenFisico examenFisico;
	ConsultaMedica consultaMedica;

	public ExamenDetallesFisicos(String grupo, ExamenFisico examenFisico, ConsultaMedica consultaMedica) {
		this.grupo = grupo;
		this.examenFisico = examenFisico;
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

	public ExamenFisico getExamenFisico() {
		return this.examenFisico;
	}

	public void setExamenFisico(ExamenFisico examenFisico) {
		this.examenFisico = examenFisico;
	}

	public ConsultaMedica getConsultaMedica() {
		return this.consultaMedica;
	}

	public void setConsultaMedica(ConsultaMedica consultaMedica) {
		this.consultaMedica = consultaMedica;
	}

}
