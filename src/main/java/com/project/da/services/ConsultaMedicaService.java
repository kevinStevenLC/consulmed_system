package com.project.da.services;

import java.sql.SQLException;
import java.util.List;

import com.project.da.interfaces.BaseRepository;
import com.project.da.models.principal.ConsultaMedica;

public class ConsultaMedicaService {

	private final BaseRepository<ConsultaMedica> consultaMedicaRepository;

	public ConsultaMedicaService(BaseRepository<ConsultaMedica> consultaMedicaRepository) {
		this.consultaMedicaRepository = consultaMedicaRepository;
	}

	public List<ConsultaMedica> obtenerTodosConsultaMedicas() {
		return this.consultaMedicaRepository.findAll();
	}

	public ConsultaMedica obtenerConsultaMedicaById(int id) {
		return this.consultaMedicaRepository.findById(id);
	}

	public boolean guardarConsultaMedica(ConsultaMedica antecedentes) throws SQLException {
		return this.consultaMedicaRepository.save(antecedentes);

	}

	public boolean eliminarConsultaMedica(int id) {
		return this.consultaMedicaRepository.delete(id);
	}

}
