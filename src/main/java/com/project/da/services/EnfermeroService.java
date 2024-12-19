package com.project.da.services;

import java.util.List;

import com.project.da.interfaces.BaseRepository;
import com.project.da.models.independiente.Enfermero;

public class EnfermeroService {

	private final BaseRepository<Enfermero> enfermeroRepository;

	public EnfermeroService(BaseRepository<Enfermero> enfermeroRepository) {
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
