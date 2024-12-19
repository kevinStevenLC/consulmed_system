package com.project.da.services;

import java.util.List;

import com.project.da.interfaces.EnfermeroRepository;
import com.project.da.models.independiente.Enfermero;

public class EnfermeroService {

	private final EnfermeroRepository enfermeroRepository;

	public EnfermeroService(EnfermeroRepository enfermeroRepository) {
		this.enfermeroRepository = enfermeroRepository;
	}

	public List<Enfermero> obtenerTodosEnfermeros() {
		return this.enfermeroRepository.findAll();
	}

	public Enfermero obtenerEnfermeroById(int id) {
		return this.enfermeroRepository.findById(id);
	}

	public boolean guardarEnfermero(Enfermero enfermero) {
		return this.enfermeroRepository.save(enfermero);
	}

}
