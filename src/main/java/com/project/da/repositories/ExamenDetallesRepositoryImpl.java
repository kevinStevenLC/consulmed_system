package com.project.da.repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import com.project.da.dao.DbConexion;
import com.project.da.interfaces.BaseRepository;
import com.project.da.models.detalles.ExamenDetalles;

public class ExamenDetallesRepositoryImpl implements BaseRepository<ExamenDetalles> {

	@Override
	public List<ExamenDetalles> findAll() {
		throw new UnsupportedOperationException("Unimplemented method 'findAll'");
	}

	@Override
	public ExamenDetalles findById(int id) {
		throw new UnsupportedOperationException("Unimplemented method 'findById'");
	}

	@Override
	public boolean save(ExamenDetalles entidad) {
		String query = "INSERT INTO examendetalles (idExamenFisico, idExamenAdicional) VALUES (?, ?)";
		try (Connection conn = DbConexion.getConection_db();
				PreparedStatement preparedStatement = conn.prepareStatement(query)) {

		} catch (Exception e) {
		}
		return false;
	}

	@Override
	public boolean delete(int id) {
		throw new UnsupportedOperationException("Unimplemented method 'delete'");
	}

}
