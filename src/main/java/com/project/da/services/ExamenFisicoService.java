package com.project.da.services;

import java.util.List;

import com.project.da.interfaces.BaseRepository;
import com.project.da.models.independiente.ExamenFisico;

public class ExamenFisicoService {

	private final BaseRepository<ExamenFisico> examenFisicoRepository;

	public ExamenFisicoService(BaseRepository<ExamenFisico> examenFisicoRepository) {
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
