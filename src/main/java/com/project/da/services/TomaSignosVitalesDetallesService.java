package com.project.da.services;

import java.sql.SQLException;
import java.util.List;

import com.project.da.interfaces.BaseRepository;
import com.project.da.models.detalles.TomaSignosVitalesDetalles;

public class TomaSignosVitalesDetallesService {

	private final BaseRepository<TomaSignosVitalesDetalles> tomasignosVitalesDRepository;

	public TomaSignosVitalesDetallesService(BaseRepository<TomaSignosVitalesDetalles> tomasignosVitalesDRepository) {
		this.tomasignosVitalesDRepository = tomasignosVitalesDRepository;
	}

	public List<TomaSignosVitalesDetalles> obtenerTodosTomaSignosVitalesD() {
		return this.tomasignosVitalesDRepository.findAll();
	}

	public TomaSignosVitalesDetalles obtenerTomaSignosVitalesDById(int id) {
		return this.tomasignosVitalesDRepository.findById(id);
	}

	public boolean guardarTomaSignosVitalesD(TomaSignosVitalesDetalles tomaSignosVitalesDetalles) throws SQLException {
		return this.tomasignosVitalesDRepository.save(tomaSignosVitalesDetalles);
	}

}
