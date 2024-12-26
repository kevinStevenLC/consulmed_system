package com.project.da.models.detalles;

import java.util.List;

import com.project.da.models.independiente.ExamenAdicional;
import com.project.da.models.independiente.ExamenFisico;

public class ExamenDetalles {

	int id;
	List<ExamenAdicional> examenAdicionalList;
	List<ExamenFisico> examenFisicoList;

	public ExamenDetalles(List<ExamenAdicional> examenAdicionalList, List<ExamenFisico> examenFisicoList) {
		this.examenAdicionalList = examenAdicionalList;
		this.examenFisicoList = examenFisicoList;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<ExamenAdicional> getExamenAdicionalList() {
		return this.examenAdicionalList;
	}

	public void setExamenAdicionalList(List<ExamenAdicional> examenAdicionalList) {
		this.examenAdicionalList = examenAdicionalList;
	}

	public List<ExamenFisico> getExamenFisicoList() {
		return this.examenFisicoList;
	}

	public void setExamenFisicoList(List<ExamenFisico> examenFisicoList) {
		this.examenFisicoList = examenFisicoList;
	}

}
