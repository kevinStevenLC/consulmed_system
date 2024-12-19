package com.project.da.services;

import java.util.List;

import com.project.da.interfaces.ExamenFisicoRepository;
import com.project.da.models.independiente.ExamenFisico;

public class ExamenFisicoService {

	private final ExamenFisicoRepository examenFisicoRepository;

	public ExamenFisicoService(ExamenFisicoRepository examenFisicoRepository) {
		this.examenFisicoRepository = examenFisicoRepository;
	}

	public List<ExamenFisico> obtenerTodosExamenFisico() {
		return this.examenFisicoRepository.findAll();
	}

	public ExamenFisico obtenerExamenFisicoById(int id) {
		return this.examenFisicoRepository.findById(id);
	}

	public boolean guardarExamenFisico(ExamenFisico examenFisico) {
		return this.examenFisicoRepository.save(examenFisico);
	}

}
