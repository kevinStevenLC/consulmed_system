package com.project.da.repositories;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.project.da.dao.DbConexion;
import com.project.da.interfaces.BaseRepository;
import com.project.da.models.detalles.TomaSignosVitalesDetalles;

public class TomaSignosVitalesDetallesRepositoryImpl implements BaseRepository<TomaSignosVitalesDetalles> {

	@Override
	public List<TomaSignosVitalesDetalles> findAll() {
		throw new UnsupportedOperationException("Unimplemented method 'findAll'");
	}

	@Override
	public TomaSignosVitalesDetalles findById(int id) {
		throw new UnsupportedOperationException("Unimplemented method 'findById'");
	}

	// Para crear un objeto de de signo vital con sus detalles, puedes tener maximo
	// 5.
	@Override
	public boolean save(TomaSignosVitalesDetalles entidad) {
		String query = "INSERT INTO tomasignosvitalesdetalles (idTomaSignosVitales, valor, observaciones, idSignoVital) VALUES (?, ?, ?, ?)";
		try {
			PreparedStatement preparedStatement = DbConexion.getConection_db().prepareStatement(query);
			preparedStatement.setInt(1, entidad.getTomaSignosVitales().getId());
			preparedStatement.setDouble(2, entidad.getValor());
			preparedStatement.setString(3, entidad.getObservaciones());
			preparedStatement.setInt(4, entidad.getSignoVital().getId());

			int rowInserted = preparedStatement.executeUpdate();
			if (rowInserted > 0) {
				System.out.println("Toma de signos vitales detalles (element) agregado: " + rowInserted);
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
	public boolean update(TomaSignosVitalesDetalles entidad) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'update'");
	}

}
