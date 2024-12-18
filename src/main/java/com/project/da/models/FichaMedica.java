package com.project.da.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//@table
public class FichaMedica {

	// La tabla se veria asi
	// id| idPaciente | fecha | idTomaSignosVitales | idAntecedentes | |

	int id;
	Paciente paciente;
	TomaSignosVitales tomaSignosVitales;
	Antecedentes antecedentes;
	List<ConsultaMedica> consultasPrevias;

	Date fechaApertura;

	public FichaMedica(Paciente paciente, TomaSignosVitales tomaSignosVitales, Antecedentes antecedentes,
			List<ConsultaMedica> consultasPrevias, Date fechaApertura) {
		this.paciente = paciente;
		this.tomaSignosVitales = null; // empieza null
		this.antecedentes = antecedentes;
		this.consultasPrevias = new ArrayList<ConsultaMedica>();// empieza vacio
		this.fechaApertura = fechaApertura;
	}

	public Paciente getPaciente() {
		return this.paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public TomaSignosVitales getTomaSignosVitales() {
		return this.tomaSignosVitales;
	}

	public void setTomaSignosVitales(TomaSignosVitales tomaSignosVitales) {
		this.tomaSignosVitales = tomaSignosVitales;
	}

	public List<ConsultaMedica> getConsultasPrevias() {
		return this.consultasPrevias;
	}

	public void setConsultasPrevias(List<ConsultaMedica> consultasPrevias) {
		this.consultasPrevias = consultasPrevias;
	}

	public Date getFechaApertura() {
		return this.fechaApertura;
	}

	public void setFechaApertura(Date fechaApertura) {
		this.fechaApertura = fechaApertura;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Antecedentes getAntecedentes() {
		return this.antecedentes;
	}

	public void setAntecedentes(Antecedentes antecedentes) {
		this.antecedentes = antecedentes;
	}

}
