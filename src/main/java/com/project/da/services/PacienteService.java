package com.project.da.services;

import java.util.List;

import com.project.da.interfaces.BaseRepository;
import com.project.da.models.principal.Paciente;

public class PacienteService {

	private final BaseRepository<Paciente> pacienteRepository;

	public PacienteService(BaseRepository<Paciente> pacienteRepository) {
		this.pacienteRepository = pacienteRepository;
	}

	public List<Paciente> obtenerTodosPaciente() {
		return this.pacienteRepository.findAll();
	}

	public Paciente obtenerPacienteById(int id) {
		return this.pacienteRepository.findById(id);
	}

	public boolean guardarPaciente(Paciente paciente) {
		return this.pacienteRepository.save(paciente);
	}

}
