package com.project.da.interfaces;

import java.util.List;

import com.project.da.models.independiente.ExamenAdicional;

public interface ExamenAdicionalRepository {

	List<ExamenAdicional> findAll();

	ExamenAdicional findById(int id);

	boolean save(ExamenAdicional antecedentes);

}
