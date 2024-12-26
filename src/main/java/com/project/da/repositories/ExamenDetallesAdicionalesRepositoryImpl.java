package com.project.da.repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.project.da.dao.DbConexion;
import com.project.da.interfaces.BaseRepository;
import com.project.da.models.detalles.ExamenDetallesAdicionales;

public class ExamenDetallesAdicionalesRepositoryImpl implements BaseRepository<ExamenDetallesAdicionales> {

	@Override
	public List<ExamenDetallesAdicionales> findAll() {
		throw new UnsupportedOperationException("Unimplemented method 'findAll'");
	}

	@Override
	public ExamenDetallesAdicionales findById(int id) {
		throw new UnsupportedOperationException("Unimplemented method 'findById'");
	}

	@Override
	public boolean save(ExamenDetallesAdicionales entidad) {
		String query = "INSERT INTO examenDetallesAdicional (idExamenAdicional, idConsultaMedica) VALUES (?, ?)";
		try (Connection connection = DbConexion.getConection_db();
				PreparedStatement preparedStatement = connection.prepareStatement(query)) {

			preparedStatement.setInt(1, entidad.getExamenAdicional().getId());
			preparedStatement.setInt(2, entidad.getConsultaMedica().getId());

			int rowInserted = preparedStatement.executeUpdate();
			if (rowInserted > 0) {
				System.out.println("Detalles de examen adicional registrado.");
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
	public boolean update(ExamenDetallesAdicionales entidad) {
		throw new UnsupportedOperationException("Unimplemented method 'update'");
	}

}
