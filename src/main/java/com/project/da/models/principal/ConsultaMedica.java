package com.project.da.models.principal;

import com.project.da.models.detalles.ExamenDetalles;

//@table
public class ConsultaMedica {

	int id;
	String numeroConsulta;
	FichaMedica fichaMedica; // accedes: SignosVital, Antecedentes, Paciente

	ExamenDetalles examenDetalles;
	/*
	 * ExamenFisico examenFisico;
	 * ExamenAdicional examenAdicional;
	 */

	// |id | numero_consulta | id_fichaMedica | idExamenFisico(null) |
	// idExamenAdicional(null) |

	public ConsultaMedica(int id, String numeroConsulta, FichaMedica fichaMedica) {
		this.id = id;
		this.numeroConsulta = numeroConsulta;
		this.fichaMedica = fichaMedica;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNumeroConsulta() {
		return this.numeroConsulta;
	}

	public void setNumeroConsulta(String numeroConsulta) {
		this.numeroConsulta = numeroConsulta;
	}

	public FichaMedica getFichaMedica() {
		return this.fichaMedica;
	}

	public void setFichaMedica(FichaMedica fichaMedica) {
		this.fichaMedica = fichaMedica;
	}

	public ExamenDetalles getExamenDetalles() {
		return this.examenDetalles;
	}

	public void setExamenDetalles(ExamenDetalles examenDetalles) {
		this.examenDetalles = examenDetalles;
	}

	/*
	 * public ExamenFisico getExamenFisico() {
	 * return this.examenFisico;
	 * }
	 * 
	 * public void setExamenFisico(ExamenFisico examenFisico) {
	 * this.examenFisico = examenFisico;
	 * }
	 * 
	 * public ExamenAdicional getExamenAdicional() {
	 * return this.examenAdicional;
	 * }
	 * 
	 * public void setExamenAdicional(ExamenAdicional examenAdicional) {
	 * this.examenAdicional = examenAdicional;
	 * }
	 */
}
