package com.project.da.services;

import java.util.List;

import com.project.da.interfaces.BaseRepository;
import com.project.da.models.independiente.Antecedentes;

public class AntecedentesService {

	private final BaseRepository<Antecedentes> antecedentesRepository;

	public AntecedentesService(BaseRepository<Antecedentes> antecedentesRepository) {
		this.antecedentesRepository = antecedentesRepository;
	}

	public List<Antecedentes> obtenerTodosAntecedentes() {
		return this.antecedentesRepository.findAll();
	}

	public Antecedentes obtenerAntecedentesById(int id) {
		return this.antecedentesRepository.findById(id);
	}

	public boolean guardarAntecedentes(Antecedentes antecedentes) {
		return this.antecedentesRepository.save(antecedentes);
	}

}
