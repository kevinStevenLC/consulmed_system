package com.project.da.models.principal;

import com.project.da.models.independiente.ExamenAdicional;
import com.project.da.models.independiente.ExamenFisico;

//@table
public class ConsultaMedica {

	int id;
	String numeroConsulta;
	FichaMedica fichaMedica; // accedes: SignosVital, Antecedentes, Paciente

	ExamenFisico examenFisico;
	ExamenAdicional examenAdicional;

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

	public ExamenFisico getExamenFisico() {
		return this.examenFisico;
	}

	public void setExamenFisico(ExamenFisico examenFisico) {
		this.examenFisico = examenFisico;
	}

	public ExamenAdicional getExamenAdicional() {
		return this.examenAdicional;
	}

	public void setExamenAdicional(ExamenAdicional examenAdicional) {
		this.examenAdicional = examenAdicional;
	}

}
