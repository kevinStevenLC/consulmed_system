package com.project.da.services;

import java.util.List;

import com.project.da.interfaces.BaseRepository;
import com.project.da.models.independiente.ExamenAdicional;

public class ExamenAdicionalService {

	private final BaseRepository<ExamenAdicional> examenAdicionalRepository;

	public ExamenAdicionalService(BaseRepository<ExamenAdicional> examenAdicionalRepository) {
		this.examenAdicionalRepository = examenAdicionalRepository;
	}

	public List<ExamenAdicional> obtenerTodosExamenAdicional() {
		return this.examenAdicionalRepository.findAll();
	}

	public ExamenAdicional obtenerExamenAdicionalById(int id) {
		return this.examenAdicionalRepository.findById(id);
	}

	public boolean guardarExamenAdicional(ExamenAdicional examenAdicional) {
		return this.examenAdicionalRepository.save(examenAdicional);
	}

}
