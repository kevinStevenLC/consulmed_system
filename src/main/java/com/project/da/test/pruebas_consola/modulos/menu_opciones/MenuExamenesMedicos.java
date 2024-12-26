package com.project.da.test.pruebas_consola.modulos.menu_opciones;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

@SuppressWarnings("unused")
public class MenuExamenesMedicos {

	public Scanner scanner = new Scanner(System.in);
	public boolean finish = false;

	public void examenesFisicos() {
		System.out.println("--Examenes Fisicos--");
		System.out.println("Seleccione 5 de los siguientes examenes (ejemplo):");

		// Crear un ArrayList para almacenar los exámenes seleccionados
		ArrayList<String> examenesSeleccionados = new ArrayList<>();
		HashSet<Integer> seleccionados = new HashSet<>(); // Para evitar duplicados

		// Mostrar los exámenes disponibles
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + ". Examen Físico " + i);
		}

		// Permitir al usuario seleccionar 5 exámenes
		while (examenesSeleccionados.size() < 5) {
			System.out.print("Seleccione un examen físico (1-10): ");
			int seleccion = Integer.parseInt(scanner.nextLine());

			if (seleccion >= 1 && seleccion <= 10) {
				if (!seleccionados.contains(seleccion)) {
					seleccionados.add(seleccion);
					examenesSeleccionados.add("Examen Físico " + seleccion);
				} else {
					System.out.println("Ya ha seleccionado este examen físico. Por favor, elija otro.");
				}
			} else {
				System.out.println("Opción no válida. Intente de nuevo.");
			}
		}

		// Mostrar los exámenes seleccionados
		System.out.println("Exámenes físicos seleccionados: " + examenesSeleccionados);
		System.out.print("Presione Enter para continuar...");
		scanner.nextLine();

		// Llamar al siguiente método
		examenesAdicionales();
	}

	public void examenesAdicionales() {
		System.out.println("--Examenes Adicionales--");
		System.out.println("1. Examen imagenología");
		System.out.println("2. Exámenes laboratorio");
		System.out.print("Opción: ");
		String opcion = scanner.nextLine();

		switch (opcion) {
			case "1":
				examenesImagenologia();
				break;
			case "2":
				examenesLaboratorio();
				break;
			default:
				System.out.println("Opción no válida. Regresando al menú de exámenes adicionales...");
				examenesAdicionales();
		}
	}

	public void examenesImagenologia() {
		System.out.println("--Examenes imagenología--");
		System.out.println("Seleccione uno de los siguientes exámenes (ejemplo):");

		// Mostrar los exámenes disponibles
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + ". Examen Imagenología " + i);
		}
		System.out.println("Ingresa una opcion");
		Integer cedula = scanner.nextInt();
		System.out.print("Presione Enter para continuar...");
		scanner.nextLine();

	}

	public void examenesLaboratorio() {
		System.out.println("--Examenes Laboratorio--");
		System.out.println("Seleccione uno de los siguientes exámenes (ejemplo):");

		// Crear un ArrayList para almacenar el examen seleccionado

		// Mostrar los exámenes disponibles
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + ". Examen Laboratorio " + i);
		}
		System.out.println("Ingresa una opcion");
		Integer cedula = scanner.nextInt();
		System.out.print("Presione Enter para continuar...");
		scanner.nextLine();
	}

	public void finalizarConsulta() {
		this.finish = true;
	}

}
