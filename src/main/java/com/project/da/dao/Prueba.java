package com.project.da.dao;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import com.project.da.models.detalles.ExamenDetalles;
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

public class Prueba {

	public static void main(String[] args) throws InterruptedException {
		// apertura ficha al darle a crear ficha medica
		FichaMedica fichaMedica = new FichaMedica(1, null, new Date(), null);

		SimpleDateFormat fechaFormateada = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		// paciente
		Paciente paciente = new Paciente(1, "kevin", "lema", "o++", "99020", "kevin@gmail.com", "M");

		// Antecedentes
		Antecedentes antecedentes = new Antecedentes(1, "Personales", "Alergia al polvo");

		fichaMedica.setPaciente(paciente);
		fichaMedica.setAntecedentes(antecedentes);

		String textFormat = String.format(
				"=====FICHA MEDICA=====%nID: %d%nFecha: %s%n-Paciente%nNombre: %s%nApellido: %s%nEmail: %s%n-Antecedentes%nTipo: %s%nDescripcion: %s%n==================",
				fichaMedica.getId(), fechaFormateada.format(fichaMedica.getFechaApertura()), paciente.getNombres(),
				paciente.getApellidos(), paciente.getEmail(), antecedentes.getTipo(), antecedentes.getDescripcion());

		System.out.println(textFormat);

		Thread.sleep(2000);

		// ! Consulta Medica

		// Toma de signos vitales

		// Previo a la consulta

		// Enfermero
		Enfermero enfermeroEncargado = new Enfermero(1, "juan gabriel");

		// creando Toma signos vitales [vacio1]
		TomaSignosVitales tomaSignosVitales = new TomaSignosVitales(1, enfermeroEncargado, "flor de bastion bloque 22",
				paciente, new ArrayList<TomaSignosVitalesDetalles>()); // []

		// Tomados
		SignoVital sgVital1 = new SignoVital(2, "Presión Arterial");
		SignoVital sgVital2 = new SignoVital(3, "Frecuencia Cardíaca");
		SignoVital sgVital3 = new SignoVital(4, "Temperatura");

		TomaSignosVitalesDetalles sgVital1Detalles = new TomaSignosVitalesDetalles(1, sgVital1, 100.10,
				"se va a morir XD 1");
		TomaSignosVitalesDetalles sgVital2Detalles = new TomaSignosVitalesDetalles(2, sgVital2, 200.0,
				"se va a morir XD 2");
		TomaSignosVitalesDetalles sgVital3Detalles = new TomaSignosVitalesDetalles(3, sgVital3, 140.0, "bajo este man");

		tomaSignosVitales.getTomaSignosVitalesDetalles().add(sgVital1Detalles);
		tomaSignosVitales.getTomaSignosVitalesDetalles().add(sgVital2Detalles);
		tomaSignosVitales.getTomaSignosVitalesDetalles().add(sgVital3Detalles);

		// Al hacer una consulta medica
		ConsultaMedica consultaMedica = new ConsultaMedica(1, "001", fichaMedica);

		// agregar examen fisico y adicional
		ExamenFisico examFisico = new ExamenFisico(1, "Examen por sistemas", "Cabeza y cuello",
				"Ganglios inflamados, dolor, rigidez");
		ExamenAdicional examAdicional = new ExamenAdicional(1, "Laboratorio", "Análisis de sangre general");

		ExamenDetalles examenDetalles = new ExamenDetalles(1, examAdicional, examFisico);

		// agregar a la consulta medica
		consultaMedica.setExamenDetalles(examenDetalles);

		// abrimos la ficha medica y agregamos la consulta medica
		fichaMedica.setConsultasPrevias((new ArrayList<ConsultaMedica>()));
		fichaMedica.getConsultasPrevias().add(consultaMedica);

		System.out.printf(
				"=====CONSULTA MEDICA=====%nToma de signos vitales%nprevio a la consulta%n-Detalles%nID: %d%nEnfermero: %s%nDireccion: %s%nPaciente: %s%n",
				tomaSignosVitales.getId(), tomaSignosVitales.getEnfermeroEncargado().getNombresCompletos(),
				tomaSignosVitales.getDireccionLugar(), tomaSignosVitales.getPaciente().getNombres());
		System.out.println("Detalles Toma de signos vitales: ");

		for (TomaSignosVitalesDetalles tmd : tomaSignosVitales.getTomaSignosVitalesDetalles()) {
			System.out.printf(
					"------------------------------%nID: %d - Valor: %.2f%n - Descripcion: %s%n - Observaciones: %s%n------------------------------%n",
					tmd.getId(), tmd.getValor(),
					tmd.getSignoVital().getDescripcion(), tmd.getObservaciones());
		}

		System.out.println("Revision de los signos vitales...");
		Thread.sleep(2000);
		System.out.printf(
				"Examenes Fisicos%nPadecimiento: %s - Descripcion: %s - Grupo: %s%nExamen Adicional%nGrupo: %s - Descripcion: %s",
				consultaMedica.getExamenDetalles().getExamenFisico().getPadecimiento(),
				consultaMedica.getExamenDetalles().getExamenFisico().getDescripcion(),
				consultaMedica.getExamenDetalles().getExamenFisico().getGrupo(),
				consultaMedica.getExamenDetalles().getExamenAdicional().getGrupo(),
				consultaMedica.getExamenDetalles().getExamenAdicional().getDescripcion());

	}

}
