package com.project.da.services;

import java.sql.SQLException;
import java.util.List;

import com.project.da.interfaces.BaseRepository;
import com.project.da.models.detalles.ExamenDetallesFisicos;

public class ExamenDetallesFisicosService {

	private final BaseRepository<ExamenDetallesFisicos> examenDetallesFisicosRepository;

	public ExamenDetallesFisicosService(BaseRepository<ExamenDetallesFisicos> examenDetallesFisicos) {
		this.examenDetallesFisicosRepository = examenDetallesFisicos;
	}

	public List<ExamenDetallesFisicos> obtenerTodosExamenDetallesFisicos() {
		return this.examenDetallesFisicosRepository.findAll();
	}

	public ExamenDetallesFisicos obtenerExamenDetallesFisicosById(int id) {
		return this.examenDetallesFisicosRepository.findById(id);
	}

	public boolean guardarExamenDetallesFisicos(ExamenDetallesFisicos examenDetallesFisicos)
			throws SQLException {
		return this.examenDetallesFisicosRepository.save(examenDetallesFisicos);
	}

}
