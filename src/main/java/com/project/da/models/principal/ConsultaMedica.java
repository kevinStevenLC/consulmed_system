package com.project.da.models.principal;

import java.util.List;

import com.project.da.models.detalles.ExamenDetallesAdicionales;
import com.project.da.models.detalles.ExamenDetallesFisicos;

//@table
public class ConsultaMedica {

	int id;
	String numeroConsulta;
	FichaMedica fichaMedica; // accedes: SignosVital, Antecedentes, Paciente

	List<ExamenDetallesFisicos> examenDetallesFisicosList;
	List<ExamenDetallesAdicionales> examenDetallesAdicionalesList;
	/*
	 * ExamenFisico examenFisico;
	 * ExamenAdicional examenAdicional;
	 */

	// |id | numero_consulta | id_fichaMedica | idExamenFisicoDetalles(null) ||
	// idExamenAdicionalesDetalles(null) |

	public ConsultaMedica(String numeroConsulta, FichaMedica fichaMedica) {
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

	public List<ExamenDetallesFisicos> getExamenDetallesFisicosList() {
		return this.examenDetallesFisicosList;
	}

	public void setExamenDetallesFisicosList(List<ExamenDetallesFisicos> examenDetallesFisicosList) {
		this.examenDetallesFisicosList = examenDetallesFisicosList;
	}

	public List<ExamenDetallesAdicionales> getExamenDetallesAdicionalesList() {
		return this.examenDetallesAdicionalesList;
	}

	public void setExamenDetallesAdicionalesList(List<ExamenDetallesAdicionales> examenDetallesAdicionalesList) {
		this.examenDetallesAdicionalesList = examenDetallesAdicionalesList;
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
