package com.project.da.services;

import java.sql.SQLException;
import java.util.List;

import com.project.da.interfaces.FichaMedicaRepository;
import com.project.da.models.principal.FichaMedica;

public class FichaMedicaService {

	private final FichaMedicaRepository fichaMedicaRepository;

	public FichaMedicaService(FichaMedicaRepository fichaMedicaRepository) {
		this.fichaMedicaRepository = fichaMedicaRepository;
	}

	public List<FichaMedica> obtenerTodosFichaMedica() {
		return this.fichaMedicaRepository.findAll();
	}

	public FichaMedica obtenerFichaMedicaById(int id) {
		return this.fichaMedicaRepository.findById(id);
	}

	public boolean guardarFichaMedica(FichaMedica fichaMedica) throws SQLException {
		return this.fichaMedicaRepository.save(fichaMedica);
	}

	public boolean actualizarFichaMedica(FichaMedica fichaMedica) {
		return this.fichaMedicaRepository.update(fichaMedica);
	}

	public boolean eliminarFichaMedica(int id) {
		return this.fichaMedicaRepository.delete(id);
	}

}
