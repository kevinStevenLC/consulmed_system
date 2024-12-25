package com.project.da.interfaces;

import java.sql.SQLException;
import java.util.List;

public interface BaseRepository<T> {

	List<T> findAll();

	T findById(int id);

	boolean save(T entidad) throws SQLException;

	boolean delete(int id);
}
