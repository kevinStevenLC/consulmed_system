package com.project.da.services;

import java.sql.SQLException;
import java.util.List;

import com.project.da.interfaces.TomaSignosVitalesRepository;
import com.project.da.models.independiente.Enfermero;
import com.project.da.models.principal.Paciente;
import com.project.da.models.principal.TomaSignosVitales;
import com.project.da.repositories.PacienteRepositoryImpl;
import com.project.da.utils.independiente.IndependienteObtenerTodos;

public class TomaSignosVitalesService {

	private final TomaSignosVitalesRepository tomaSignosVitalesRepository;
	private final PacienteService pacienteService;
	private final IndependienteObtenerTodos ipot;

	public TomaSignosVitalesService(TomaSignosVitalesRepository tomaSignosVitalesRepository) {
		this.tomaSignosVitalesRepository = tomaSignosVitalesRepository;
		this.pacienteService = new PacienteService(new PacienteRepositoryImpl());
		this.ipot = new IndependienteObtenerTodos();
	}

	public List<TomaSignosVitales> obtenerTodosTomaSignosVitales() {
		return this.tomaSignosVitalesRepository.findAll();
	}

	public TomaSignosVitales obtenerTomaSignosVitalesById(int id) {
		return this.tomaSignosVitalesRepository.findById(id);
	}

	public int guardarTomaSignosVitales(TomaSignosVitales tomaSignosVitales) throws SQLException {
		return this.tomaSignosVitalesRepository.save(tomaSignosVitales);
	}

	public TomaSignosVitales obtennerTomaSignosVitalesPorID(int id) throws SQLException {
		TomaSignosVitales tomaSignosVitales = null;

		TomaSignosVitales tms = obtenerTomaSignosVitalesById(id);
		Paciente paciente = pacienteService.obtenerPacienteById(tms.getPaciente().getId());
		Enfermero enfermero = ipot.obtenerEnfermeroPorId(tms.getEnfermeroEncargado().getId());

		// setear la toma de signos vitales
		tms.setEnfermeroEncargado(enfermero);
		tms.setPaciente(paciente);

		tomaSignosVitales = tms;

		return tomaSignosVitales;
	}

}
