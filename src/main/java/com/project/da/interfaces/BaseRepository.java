package com.project.da.interfaces;

import java.util.List;

public interface BaseRepository<T> {

	List<T> findAll();

	T findById(int id);

	boolean save(T entidad);
}
