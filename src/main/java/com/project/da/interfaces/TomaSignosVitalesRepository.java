package com.project.da.interfaces;

import java.sql.SQLException;
import java.util.List;

import com.project.da.models.principal.TomaSignosVitales;

public interface TomaSignosVitalesRepository {
	List<TomaSignosVitales> findAll();

	TomaSignosVitales findById(int id);

	int save(TomaSignosVitales fichaMedica) throws SQLException;

	boolean update(TomaSignosVitales fichaMedica);

	boolean delete(int id);

}
