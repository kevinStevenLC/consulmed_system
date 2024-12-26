package com.project.da.repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.project.da.database.DbConexion;
import com.project.da.interfaces.BaseRepository;
import com.project.da.models.principal.ConsultaMedica;

public class ConsultaMedicaRepositoryImpl implements BaseRepository<ConsultaMedica> {

	@Override
	public List<ConsultaMedica> findAll() {

		throw new UnsupportedOperationException("Unimplemented method 'findAll'");
	}

	@Override
	public ConsultaMedica findById(int id) {

		throw new UnsupportedOperationException("Unimplemented method 'findById'");
	}

	@Override
	public boolean save(ConsultaMedica consultaMedica) {

		String query = "INSERT INTO consultamedica (numeroConsulta, idFichaMedica) VALUES (?, ?)";
		try (Connection conn = DbConexion.getConection_db();
				PreparedStatement preparedStatement = conn.prepareStatement(query)) {
			preparedStatement.setString(1, consultaMedica.getNumeroConsulta());
			preparedStatement.setInt(2, consultaMedica.getFichaMedica().getId());

			int rowsAdded = preparedStatement.executeUpdate();
			if (rowsAdded > 0) {
				System.out.println("Filas afectadas: " + rowsAdded);
			} else {
				System.err.println("No se actualizaron filas. Verifica los datos y la consulta.");
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
	public boolean update(ConsultaMedica entidad) { // solo se modificara el id de los detalles de los examenens.

		return false;
	}

}
