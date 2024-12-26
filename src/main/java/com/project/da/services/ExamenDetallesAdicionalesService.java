package com.project.da.services;

import java.sql.SQLException;
import java.util.List;

import com.project.da.interfaces.BaseRepository;
import com.project.da.models.detalles.ExamenDetallesAdicionales;

public class ExamenDetallesAdicionalesService {

	private final BaseRepository<ExamenDetallesAdicionales> examenDetallesAdicionalRepository;

	public ExamenDetallesAdicionalesService(BaseRepository<ExamenDetallesAdicionales> examenDetallesAdicionales) {
		this.examenDetallesAdicionalRepository = examenDetallesAdicionales;
	}

	public List<ExamenDetallesAdicionales> obtenerTodosExamenDetallesAdicionales() {
		return this.examenDetallesAdicionalRepository.findAll();
	}

	public ExamenDetallesAdicionales obtenerExamenDetallesAdicionalesById(int id) {
		return this.examenDetallesAdicionalRepository.findById(id);
	}

	public boolean guardarExamenDetallesAdicionales(ExamenDetallesAdicionales examenDetallesAdicionales)
			throws SQLException {
		return this.examenDetallesAdicionalRepository.save(examenDetallesAdicionales);
	}

}
