package com.project.da.services;

import java.util.List;

import com.project.da.interfaces.ConsultaMedicaRepository;

import com.project.da.models.ConsultaMedica;

public class ConsultaMedicaService {

	private final ConsultaMedicaRepository consultaMedicaRepository;

	public ConsultaMedicaService(ConsultaMedicaRepository consultaMedicaRepository) {
		this.consultaMedicaRepository = consultaMedicaRepository;
	}

	public List<ConsultaMedica> obtenerTodosConsultaMedicas() {
		return this.consultaMedicaRepository.findAll();
	}

	public ConsultaMedica obtenerConsultaMedicaById(int id) {
		return this.consultaMedicaRepository.findById(id);
	}

	public boolean guardarConsultaMedica(ConsultaMedica antecedentes) {
		return this.consultaMedicaRepository.save(antecedentes);
	}

}
