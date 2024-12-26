package com.project.da.test.pruebas_data;

import java.sql.Date;
import java.sql.SQLException;
import java.util.Arrays;

import com.project.da.models.detalles.ExamenDetallesAdicionales;
import com.project.da.models.detalles.ExamenDetallesFisicos;
import com.project.da.models.detalles.TomaSignosVitalesDetalles;
import com.project.da.models.independiente.Antecedentes;
import com.project.da.models.independiente.Enfermero;
import com.project.da.models.independiente.ExamenAdicional;
import com.project.da.models.independiente.ExamenFisico;
import com.project.da.models.independiente.SignoVital;
import com.project.da.models.principal.ConsultaMedica;
import com.project.da.models.principal.FichaMedica;
import com.project.da.models.principal.Paciente;
import com.project.da.models.principal.TomaSignosVitales;
import com.project.da.repositories.ConsultaMedicaRepositoryImpl;
import com.project.da.repositories.ExamenDetallesAdicionalesRepositoryImpl;
import com.project.da.repositories.ExamenDetallesFisicosRepositoryImpl;
import com.project.da.repositories.FichaMedicaRepositoryImpl;
import com.project.da.repositories.TomaSignosVitalesDetallesRepositoryImpl;
import com.project.da.repositories.TomaSignosVitalesRepositoryImpl;
import com.project.da.services.ConsultaMedicaService;
import com.project.da.services.ExamenDetallesAdicionalesService;
import com.project.da.services.ExamenDetallesFisicosService;
import com.project.da.services.FichaMedicaService;
import com.project.da.services.TomaSignosVitalesDetallesService;
import com.project.da.services.TomaSignosVitalesService;

public class PruebaPrincipal {
	/*
	 * Flujo
	 * Registrar ficha medica
	 * registro de un paciente
	 * antecedentes
	 * 
	 * !funcion: consulta medica
	 * 
	 * ?previo
	 * hacer una toma de signos vitales
	 * 
	 * ?para la consulta medica
	 * crear una consulta
	 * examinar la ficha medica
	 * examinar toma de signos vitales
	 * hacer examen fisico
	 * hacer examen adicional
	 * cerrar consulta
	 */

	public static void main(String[] args) throws SQLException {
		FichaMedicaRepositoryImpl fichaMedicaRepositoryImpl = new FichaMedicaRepositoryImpl();
		FichaMedicaService fichaMedicaService = new FichaMedicaService(fichaMedicaRepositoryImpl);

		TomaSignosVitalesRepositoryImpl tomaSignosVitalesRepositoryImpl = new TomaSignosVitalesRepositoryImpl();
		TomaSignosVitalesService tomaSignosVitalesService = new TomaSignosVitalesService(tomaSignosVitalesRepositoryImpl);

		TomaSignosVitalesDetallesRepositoryImpl tomaSignosVitalesDetallesRepositoryImpl = new TomaSignosVitalesDetallesRepositoryImpl();
		TomaSignosVitalesDetallesService tomaSignosVitalesDetallesService = new TomaSignosVitalesDetallesService(
				tomaSignosVitalesDetallesRepositoryImpl);

		ExamenDetallesAdicionalesRepositoryImpl examenDetallesAdicionalesRepositoryImpl = new ExamenDetallesAdicionalesRepositoryImpl();
		ExamenDetallesAdicionalesService examenDetallesAdicionalesService = new ExamenDetallesAdicionalesService(
				examenDetallesAdicionalesRepositoryImpl);

		ExamenDetallesFisicosRepositoryImpl examenDetallesFisicosRepositoryImpl = new ExamenDetallesFisicosRepositoryImpl();
		ExamenDetallesFisicosService examenDetallesFisicosService = new ExamenDetallesFisicosService(
				examenDetallesFisicosRepositoryImpl);

		ConsultaMedicaRepositoryImpl consultaMedicaRepositoryImpl = new ConsultaMedicaRepositoryImpl();
		ConsultaMedicaService consultaMedicaService = new ConsultaMedicaService(consultaMedicaRepositoryImpl);

		ConsultaMedica cm = new ConsultaMedica("001", new FichaMedica(null, null, null));
		cm.setId(1);
		cm.getFichaMedica().setId(5);

		ExamenFisico examFisico = new ExamenFisico(4, "Examen por sistemas", "Cabeza y cuello",
				"Ganglios inflamados, dolor, rigidez");
		ExamenAdicional examAdicional = new ExamenAdicional(4, "Laboratorio", "Análisis de sangre general");

		ExamenDetallesAdicionales examenDetallesAdicionales = new ExamenDetallesAdicionales("adicional", examAdicional,
				cm);
		examenDetallesAdicionales.setId(1);
		ExamenDetallesFisicos examenDetallesFisicos = new ExamenDetallesFisicos("fisico", examFisico, cm);
		examenDetallesFisicos.setId(1);

		cm.setExamenDetallesFisicosList(Arrays.asList(examenDetallesFisicos));
		cm.setExamenDetallesAdicionalesList(Arrays.asList(examenDetallesAdicionales));

		// consultaMedicaService.guardarConsultaMedica(cm);

		// guardar los detalles de los examenens
		examenDetallesFisicosService.guardarExamenDetallesFisicos(examenDetallesFisicos);
		examenDetallesAdicionalesService.guardarExamenDetallesAdicionales(examenDetallesAdicionales);
		// examenes

	}

}
