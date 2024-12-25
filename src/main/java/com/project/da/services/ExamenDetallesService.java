package com.project.da.services;

import java.sql.SQLException;
import java.util.List;

import com.project.da.interfaces.BaseRepository;
import com.project.da.models.detalles.ExamenDetalles;

public class ExamenDetallesService {

	private final BaseRepository<ExamenDetalles> examenDetalles;

	public ExamenDetallesService(BaseRepository<ExamenDetalles> examenDetalles) {
		this.examenDetalles = examenDetalles;
	}

	public List<ExamenDetalles> obtenerTodosExamenDetalles() {
		return this.examenDetalles.findAll();
	}

	public ExamenDetalles obtenerExamenDetallesById(int id) {
		return this.examenDetalles.findById(id);
	}

	public boolean guardarExamenDetalles(ExamenDetalles examenDetalles) throws SQLException {
		return this.examenDetalles.save(examenDetalles);
	}

}
