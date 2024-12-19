package com.project.da.interfaces;

import java.util.List;

import com.project.da.models.independiente.ExamenFisico;

public interface ExamenFisicoRepository {

	List<ExamenFisico> findAll();

	ExamenFisico findById(int id);

	boolean save(ExamenFisico antecedentes);

}
