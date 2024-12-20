package com.project.da.interfaces;

import java.util.List;

import com.project.da.models.Enfermero;

public interface EnfermeroRepository {

	List<Enfermero> findAll();

	Enfermero findById(int id);

	boolean save(Enfermero antecedentes);

}
