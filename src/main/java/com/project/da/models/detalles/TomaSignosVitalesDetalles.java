package com.project.da.models.detalles;

import com.project.da.models.independiente.SignoVital;
import com.project.da.models.principal.TomaSignosVitales;

public class TomaSignosVitalesDetalles {

	int id;
	SignoVital signoVital;
	Double valor;
	String observaciones;
	TomaSignosVitales tomaSignosVitales;

	// |id |id_signosVitales| idSignoVital |valor | observaciones|

	public TomaSignosVitalesDetalles(SignoVital signoVital, Double valor,
			String observaciones, TomaSignosVitales tomaSignosVitales) {
		this.signoVital = signoVital;
		this.valor = valor;
		this.observaciones = observaciones;
		this.tomaSignosVitales = tomaSignosVitales;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public SignoVital getSignoVital() {
		return this.signoVital;
	}

	public void setSignoVital(SignoVital signoVital) {
		this.signoVital = signoVital;
	}

	public Double getValor() {
		return this.valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getObservaciones() {
		return this.observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public TomaSignosVitales getTomaSignosVitales() {
		return this.tomaSignosVitales;
	}

	public void setTomaSignosVitales(TomaSignosVitales tomaSignosVitales) {
		this.tomaSignosVitales = tomaSignosVitales;
	}

}
