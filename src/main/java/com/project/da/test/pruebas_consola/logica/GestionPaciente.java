package com.project.da.test.pruebas_consola.logica;

import java.sql.SQLException;
import java.util.List;

import com.project.da.models.principal.Paciente;
import com.project.da.repositories.PacienteRepositoryImpl;
import com.project.da.services.PacienteService;

public class GestionPaciente {

	PacienteService pacienteService;

	public GestionPaciente() {
		this.pacienteService = new PacienteService(new PacienteRepositoryImpl());
	}

	public int guardarPaciente(Paciente paciente) {
		int id = 0;
		try {
			id = this.pacienteService.guardarPaciente(paciente);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return id;
	}

	public Paciente obtenerPacientePorId(int id) {
		Paciente paciente = null;
		paciente = this.pacienteService.obtenerPacienteById(id);
		if (paciente != null) {
			return paciente;
		} else {
			System.out.println("No se encontro el paciente con el ID.");
			return null;
		}
	}

	public List<Paciente> obtenerTodosLosPacientes() {
		return this.pacienteService.obtenerTodosPaciente();
	}

}
