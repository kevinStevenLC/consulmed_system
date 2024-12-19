package com.project.da.models.principal;

public class Paciente {
	String id;
	String nombres;
	String apellidos;
	String tipoSangre;
	String telefono;
	String email;
	String genero;

	public Paciente(String id, String nombres, String apellidos, String tipoSangre, String telefono, String email,
			String genero) {
		this.id = id;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.tipoSangre = tipoSangre;
		this.telefono = telefono;
		this.email = email;
		this.genero = genero;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombres() {
		return this.nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return this.apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getTipoSangre() {
		return this.tipoSangre;
	}

	public void setTipoSangre(String tipoSangre) {
		this.tipoSangre = tipoSangre;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGenero() {
		return this.genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

}
