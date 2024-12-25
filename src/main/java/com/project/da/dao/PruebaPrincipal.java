package com.project.da.dao;

import java.sql.Date;
import java.sql.SQLException;

import com.project.da.models.detalles.TomaSignosVitalesDetalles;
import com.project.da.models.independiente.Antecedentes;
import com.project.da.models.independiente.Enfermero;
import com.project.da.models.independiente.SignoVital;
import com.project.da.models.principal.FichaMedica;
import com.project.da.models.principal.Paciente;
import com.project.da.models.principal.TomaSignosVitales;
import com.project.da.repositories.FichaMedicaRepositoryImpl;
import com.project.da.repositories.TomaSignosVitalesDetallesRepositoryImpl;
import com.project.da.repositories.TomaSignosVitalesRepositoryImpl;
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

		Paciente pc = new Paciente(2, "kevin actualizado", "steven", "o+", "0990204404",
				"kevin@gmail.com", "Masculino");

		Antecedentes a = new Antecedentes(8, "personales", "xdddddddd");

		FichaMedica fm = new FichaMedica(pc, new Date(System.currentTimeMillis()),
				a);
		// fichaMedicaService.actualizarFichaMedica(fm);

		/*
		 * Enfermero e = new Enfermero(1, "");
		 * Paciente pc = new Paciente(2, "kevin", "steven", "o+", "0990204404",
		 * "kevin@gmail.com", "Masculino");
		 * TomaSignosVitales tm = new TomaSignosVitales(e, "flor de bastion XD", pc);
		 * tomaSignosVitalesService.guardarTomaSignosVitales(tm);
		 */

		TomaSignosVitales tomaSignosVitales = new TomaSignosVitales(new Enfermero(3, null),
				"xddd",
				new Paciente(1, null, null, null, null, null, null));
		tomaSignosVitales.setId(1);
		// TomaSignosVitalesDetalles tmdt = new TomaSignosVitalesDetalles(new
		// SignoVital(4, ""), 22.00, "nadaaa", tmdd);

		fm.setId(5);
		fm.setTomaSignosVitales(tomaSignosVitales);
		// tomaSignosVitalesDetallesService.guardarTomaSignosVitalesD(tmd);

		fichaMedicaService.actualizarFichaMedica(fm);

	}

}
