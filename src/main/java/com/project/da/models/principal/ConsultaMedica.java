package com.project.da.models.principal;

import com.project.da.models.independiente.ExamenAdicional;
import com.project.da.models.independiente.ExamenFisico;

//@table
public class ConsultaMedica {

	String id;
	String numeroConsulta;
	FichaMedica fichaMedica; // accedes: SignosVital, Antecedentes, Paciente

	ExamenFisico examenFisico;
	ExamenAdicional examenAdicional;

	// |id | numero_consulta | id_fichaMedica | idExamenFisico(null) |
	// idExamenAdicional(null) |

	public ConsultaMedica(String id, String numeroConsulta, FichaMedica fichaMedica) {
		this.id = id;
		this.numeroConsulta = numeroConsulta;
		this.fichaMedica = fichaMedica;
	}

}
