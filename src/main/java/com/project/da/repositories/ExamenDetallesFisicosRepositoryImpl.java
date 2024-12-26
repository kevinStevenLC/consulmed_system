package com.project.da.repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.project.da.database.DbConexion;
import com.project.da.interfaces.BaseRepository;
import com.project.da.models.detalles.ExamenDetallesFisicos;

public class ExamenDetallesFisicosRepositoryImpl implements BaseRepository<ExamenDetallesFisicos> {

	@Override
	public List<ExamenDetallesFisicos> findAll() {
		throw new UnsupportedOperationException("Unimplemented method 'findAll'");
	}

	@Override
	public ExamenDetallesFisicos findById(int id) {
		throw new UnsupportedOperationException("Unimplemented method 'findById'");
	}

	@Override
	public boolean save(ExamenDetallesFisicos entidad) {
		String query = "INSERT INTO examenDetallesFisico (idExamenFisico, idConsultaMedica) VALUES (?, ?)";
		try (Connection connection = DbConexion.getConection_db();
				PreparedStatement preparedStatement = connection.prepareStatement(query)) {

			preparedStatement.setInt(1, entidad.getExamenFisico().getId());
			preparedStatement.setInt(2, entidad.getConsultaMedica().getId());

			int rowInserted = preparedStatement.executeUpdate();
			if (rowInserted > 0) {
				System.out.println("Detalles de examen fisico registrado.");
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public boolean delete(int id) {
		throw new UnsupportedOperationException("Unimplemented method 'delete'");
	}

	@Override
	public boolean update(ExamenDetallesFisicos entidad) {
		throw new UnsupportedOperationException("Unimplemented method 'update'");
	}

}
