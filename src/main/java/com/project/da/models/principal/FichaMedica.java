package com.project.da.models.principal;

import java.sql.Date;
import java.util.List;

import com.project.da.models.independiente.Antecedentes;

//@table
public class FichaMedica {

	// La tabla se veria asi
	// id| idPaciente | fecha | idTomaSignosVitales | idAntecedentes | |

	int id;
	Paciente paciente;
	TomaSignosVitales tomaSignosVitales;// puede ser null
	Antecedentes antecedentes;
	List<ConsultaMedica> consultasPrevias;// puede ser null

	Date fechaApertura;

	public FichaMedica(Paciente paciente, Date fechaApertura, Antecedentes antecedentes) {
		this.paciente = paciente;
		this.fechaApertura = fechaApertura;
		this.antecedentes = antecedentes;
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

	@Override
	public String toString() {
		return "{" +
				" id='" + getId() + "'" +
				", paciente='" + getPaciente() + "'" +
				", tomaSignosVitales='" + getTomaSignosVitales() + "'" +
				", antecedentes='" + getAntecedentes() + "'" +
				", consultasPrevias='" + getConsultasPrevias() + "'" +
				", fechaApertura='" + getFechaApertura() + "'" +
				"}";
	}

}
