package com.project.da.repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.project.da.database.DbConexion;
import com.project.da.interfaces.FichaMedicaRepository;
import com.project.da.models.principal.FichaMedica;

public class FichaMedicaRepositoryImpl implements FichaMedicaRepository {

	// Logica de metodos en database

	@Override
	public List<FichaMedica> findAll() {
		throw new UnsupportedOperationException("Unimplemented method 'findAll'");
	}

	@Override
	public FichaMedica findById(int id) {
		throw new UnsupportedOperationException("Unimplemented method 'findById'");
	}

	@Override // crear
	public boolean save(FichaMedica fichaMedica) throws SQLException {
		String query = "INSERT INTO fichamedica (fechaApertura, idPaciente, idAntecedentes) VALUES (?, ?, ?)";
		try {
			PreparedStatement preparedStatement = DbConexion.getConection_db().prepareStatement(query);
			preparedStatement.setDate(1, fichaMedica.getFechaApertura());
			preparedStatement.setInt(2, fichaMedica.getPaciente().getId());
			preparedStatement.setInt(3, fichaMedica.getAntecedentes().getId());

			int rowInserted = preparedStatement.executeUpdate();
			if (rowInserted > 0) {
				System.out.println("Ficha registrada.");
				return true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean update(FichaMedica fichaMedica) {

		String query = "UPDATE fichamedica SET  idTomaSignosVitales = ? WHERE id = ?";
		try (Connection connection = DbConexion.getConection_db();
				PreparedStatement preparedStatement = connection.prepareStatement(query)) {

			preparedStatement.setInt(1, fichaMedica.getTomaSignosVitales().getId());

			preparedStatement.setInt(2, fichaMedica.getId());

			System.out.println("Ejecutando consulta: " + preparedStatement); // Imprime la consulta para depurar
			int rowsUpdated = preparedStatement.executeUpdate();

			if (rowsUpdated > 0) {
				System.out.println("Filas afectadas: " + rowsUpdated);
			} else {
				System.err.println("No se actualizaron filas. Verifica los datos y la consulta.");
			}

			DbConexion.getConection_db().close();

		} catch (SQLException e) {
			// Maneja la excepción de forma más específica, por ejemplo:
			if (e.getErrorCode() == 1062) { // Código de error para duplicados (ejemplo para MySQL)
				System.err.println("Error: Ya existe un registro con ese ID.");
			} else {
				e.printStackTrace();

			}
		}
		return false;

	}

	@Override
	public boolean delete(int id) {
		throw new UnsupportedOperationException("Unimplemented method 'delete'");
	}

}
