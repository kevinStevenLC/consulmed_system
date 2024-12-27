package com.project.da.test.pruebas_consola.modulos.menu_opciones;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.project.da.models.detalles.TomaSignosVitalesDetalles;
import com.project.da.models.independiente.SignoVital;
import com.project.da.models.principal.Paciente;
import com.project.da.models.principal.TomaSignosVitales;
import com.project.da.test.pruebas_consola.logica.GestionPaciente;
import com.project.da.test.pruebas_consola.logica.GestionTomaSignosVitales;
import com.project.da.utils.independiente.IndependienteObtenerTodos;

//
public class MenuConsultaMedica {

	MenuExamenesMedicos menuExamenesMedicos;
	GestionPaciente gp;
	GestionTomaSignosVitales gtsv;
	int pacienteSeleccionado;
	int idTomaSignosVitales;
	List<TomaSignosVitalesDetalles> tsvDetalles;

	public MenuConsultaMedica() {
		this.menuExamenesMedicos = new MenuExamenesMedicos();
		this.gp = new GestionPaciente();
		this.gtsv = new GestionTomaSignosVitales();
		tsvDetalles = new ArrayList<>();
	}

	public Scanner scanner = new Scanner(System.in);

	public void consultaMedica() {
		while (true) {
			System.out.println("--Consulta Medica--");
			System.out.println("1. Toma signos Vitales");
			System.out.println("2. Volver al menú principal");
			System.out.print("Escriba una opción: ");
			String opcion = scanner.nextLine();

			switch (opcion) {
				case "1":
					evaluacionPaciente();
					break;
				case "2":
					return;
				default:
					System.out.println("Opción no válida. Intente de nuevo.");
			}
		}
	}

	public void evaluacionPaciente() {

		while (true) {
			System.out.println("--Consulta Medica--");
			cargarPacientes();
			System.out.print("Ingrese la Identificacion del Paciente: ");
			int idPaciente = scanner.nextInt();
			scanner.nextLine();
			System.out.print("Presione Enter para continuar...");
			try {
				if (gp.obtenerPacientePorId(idPaciente).getId() != 0) {
					limpiarPantalla();
					tomaSignosVitales(idPaciente);
				} else {
					System.out.println("Paciente no encontrado.");
				}
			} catch (Exception e) {
				System.out.println("Ha ocurrido un error. Por favor, intente nuevamente.");
			}

		}
	}

	public void cargarPacientes() {
		for (Paciente p : gp.obtenerTodosLosPacientes()) {
			System.out.printf("ID: %d - Cedula: %s - Nombres Completos: %s %s%n", p.getId(), p.getCedula(), p.getNombres(),
					p.getApellidos());
		}
	}

	public void tomaSignosVitales(int id) {
		pacienteSeleccionado = id;

		// Aquí podrías mostrar los datos reales de la ficha médica

		mostrarFichaMedica(gp.obtenerPacientePorId(id));
		try {
			creandoTomaSignosVitales();
			gestionTomaSignosVitaleDetalles();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// Aquí iría la lógica para seleccionar los signos vitales
		System.out.print("Presione Enter para continuar...");
		scanner.nextLine();

		// Opciones de exámenes
		System.out.println("--Examenes--");
		System.out.println("1. Examenes fisicos");
		System.out.println("2. Examenes adicionales");
		System.out.print("Opción: ");
		String opcion = scanner.nextLine();

		switch (opcion) {
			case "1":
				menuExamenesMedicos.examenesFisicos();
				break;
			case "2":
				menuExamenesMedicos.examenesAdicionales();
				break;
			default:
				System.out.println("Opción no válida. Regresando al menú de consulta médica...");
				consultaMedica();
		}
	}

	public void mostrarFichaMedica(Paciente p) {
		System.out.printf(
				"--Ficha Medica del Paciente ID: %d --%nCedula: %s%nNombres Completos: %s %s%nTipo de sangre: %s%n Telefono: %s%n Email: %s%n Genero: %s%n",
				p.getId(), p.getCedula(), p.getNombres(), p.getApellidos(), p.getTipoSangre(), p.getTelefono(), p.getEmail(),
				p.getGenero());
	}

	public void creandoTomaSignosVitales() {
		// Se crea una toma de signos vitales con su ID, despues se agregaran detalles.
		IndependienteObtenerTodos ipt = new IndependienteObtenerTodos();

		TomaSignosVitales tomaSignosVitales = new TomaSignosVitales(ipt.obtenerTodosEnfermeros().get(0), "Entrada de la 8",
				gp.obtenerPacientePorId(pacienteSeleccionado));
		this.idTomaSignosVitales = gtsv.guardarTomaSignosVitales(tomaSignosVitales);
	}

	public void gestionTomaSignosVitaleDetalles() throws SQLException {
		List<TomaSignosVitalesDetalles> tmDetalles = new ArrayList<>();
		IndependienteObtenerTodos idpot = new IndependienteObtenerTodos();

		System.out.println("--Toma signos Vitales--");

		List<SignoVital> signosVitales = gtsv.obtenerTodosSignoVital();

		// Mostrar los signos vitales disponibles
		for (SignoVital tmsv : signosVitales) {
			System.out.println("ID: " + tmsv.getId() + " Descripcion: " + tmsv.getDescripcion());
		}
		System.out.println("Seleccione 5 de las siguientes opciones (ID):");

		// Procesar la entrada de los 5 signos vitales
		for (int i = 0; i < 1; i++) { // Solo permitir 5 entradas
			System.out.println("ID: ");
			int idSignoVital = scanner.nextInt();
			scanner.nextLine();

			System.out.println("Valor: ");
			Double valor = scanner.nextDouble();
			scanner.nextLine();

			System.out.println("Observaciones: ");
			String observaciones = scanner.nextLine();

			// Encontrar el signo vital seleccionado
			SignoVital signoVital = idpot.obtenerSignoVitalPorId(idSignoVital);

			TomaSignosVitalesDetalles tomaSignosVitalesDetalles = new TomaSignosVitalesDetalles(
					signoVital, valor, observaciones, gtsv.obtenenerTomaSignosVitalesPorID(idSignoVital));
			tmDetalles.add(tomaSignosVitalesDetalles);

			gtsv.guardarSignosVitalesDetalles(tomaSignosVitalesDetalles);
		}

		/*
		 * for (TomaSignosVitalesDetalles tmddd : tmDetalles) {
		 * System.out.println("ID: " + tmddd.getId() + " observaciones: " +
		 * tmddd.getObservaciones() + " valor:  "
		 * + tmddd.getValor() + " descripcion: "
		 * + tmddd.getSignoVital().getDescripcion() + " enfermero encargado:"
		 * + tmddd.getTomaSignosVitales().getEnfermeroEncargado());
		 * }
		 */

	}

	public static void limpiarPantalla() {
		String os = System.getProperty("os.name").toLowerCase();
		try {
			if (os.contains("win")) {
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			} else {
				new ProcessBuilder("clear").inheritIO().start().waitFor();
			}
		} catch (IOException | InterruptedException ex) {
			System.err.println("Error al limpiar la pantalla: " + ex.getMessage());
		}
	}

}