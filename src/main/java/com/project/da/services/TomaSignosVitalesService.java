package com.project.da.services;

import java.util.List;

import com.project.da.interfaces.BaseRepository;
import com.project.da.models.principal.TomaSignosVitales;

public class TomaSignosVitalesService {

	private final BaseRepository<TomaSignosVitales> tomaSignosVitalesRepository;

	public TomaSignosVitalesService(BaseRepository<TomaSignosVitales> tomaSignosVitalesRepository) {
		this.tomaSignosVitalesRepository = tomaSignosVitalesRepository;
	}

	public List<TomaSignosVitales> obtenerTodosTomaSignosVitales() {
		return this.tomaSignosVitalesRepository.findAll();
	}

	public TomaSignosVitales obtenerTomaSignosVitalesById(int id) {
		return this.tomaSignosVitalesRepository.findById(id);
	}

	public boolean guardarTomaSignosVitales(TomaSignosVitales tomaSignosVitales) {
		return this.tomaSignosVitalesRepository.save(tomaSignosVitales);
	}

}
