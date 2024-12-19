package com.project.da.interfaces;

import java.util.List;

import com.project.da.models.principal.ConsultaMedica;

public interface ConsultaMedicaRepository {

	List<ConsultaMedica> findAll();

	ConsultaMedica findById(int id);

	boolean save(ConsultaMedica antecedentes);

}
