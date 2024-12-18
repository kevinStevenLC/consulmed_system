package com.project.da.interfaces;

import java.util.List;

import com.project.da.models.Antecedentes;

public interface AntecedentesRepository {

	List<Antecedentes> findAll();

	Antecedentes findById(int id);

	boolean save(Antecedentes antecedentes);

}
