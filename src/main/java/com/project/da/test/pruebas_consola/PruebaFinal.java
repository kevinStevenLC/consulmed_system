package com.project.da.test.pruebas_consola;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

import com.project.da.test.pruebas_consola.modulos.menu_opciones.MenuConsultaMedica;
import com.project.da.test.pruebas_consola.modulos.menu_opciones.MenuExamenesMedicos;
import com.project.da.test.pruebas_consola.modulos.menu_opciones.MenuGestionFichaMedica;

@SuppressWarnings("unused")
public class PruebaFinal {

	public Scanner scanner = new Scanner(System.in);
	MenuGestionFichaMedica menuGestionFichaMedica;
	MenuConsultaMedica menuConsultaMedica;
	MenuExamenesMedicos menuExamenesMedicos;

	public PruebaFinal() {
		this.menuGestionFichaMedica = new MenuGestionFichaMedica();
		this.menuConsultaMedica = new MenuConsultaMedica();
		this.menuExamenesMedicos = new MenuExamenesMedicos();
	}

	public void menuPrincipal() {
		while (true) {
			System.out.println("--Menu Principal--");
			System.out.println("1. Gestion Ficha Medica");
			System.out.println("2. Consulta Medica");
			System.out.println("3. Salir");
			System.out.print("Escriba una opción: ");
			String opcion = scanner.nextLine();

			switch (opcion) {
				case "1":
					limpiarPantalla();
					menuGestionFichaMedica.gestionFichaMedica();
					break;
				case "2":
					limpiarPantalla();
					menuConsultaMedica.consultaMedica();
					if (menuExamenesMedicos.finish) {
						finalizarConsulta();
					}
					break;
				case "3":
					System.out.println("Saliendo del sistema...");
					return;
				default:
					limpiarPantalla();
					System.out.println("Opción no válida. Intente de nuevo.");
			}
		}
	}

	public void finalizarConsulta() {
		System.out.println("Finalizar consulta...");
		System.out.print("Presione Enter para regresar al menú principal...");
		scanner.nextLine();
		menuPrincipal();
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

	public static void main(String[] args) {
		PruebaFinal p = new PruebaFinal();
		p.menuPrincipal();
	}

}

/*
 * --Menu Principal--
 * 1. Gestion Ficha Medica
 * 2. Consulta Medica
 * 
 * --Gestion de ficha medica--
 * 1. buscar
 * 2. crear
 * 3. actualizar
 * 4. eliminar
 * escriba una opcion __
 * 
 * 
 * Gestion ficha medica / buscar:
 * --Buscar---
 * ingrese el numero de cedula: ___ (String)
 * 
 * Gestion ficha medica / eliminar:
 * --Eliminar---
 * ingrese el numero de cedula: ___ (String)
 * 
 * Gestion ficha medica / actualizar:
 * --Actualizar---
 * ingrese el numero de cedula: ___ (String)
 * 
 * Gestion ficha medica / crear:
 * --Crear---
 * ingrese el numero de cedula: ___ (String)
 * 
 * al crear la ficha medica pedira: datos del paciente(10), antecedentes (solo 1
 * y string)
 * 
 * 
 * En la consulta Medica
 * --Toma signos Vitales--
 * has una lista que carge aqui como 10 tomas de signoas vitales.
 * y que solo pueda escoger 5 opciones.
 * 
 * despues de escoger la toma de signos vitales, me lleva a :
 * 
 * pedira el numero de cedula para hallar su ficha medica
 * y al hacer enter mostrara:
 * 
 * --Consulta Medica--
 * -Mostrara los datos de la ficha medica
 * y me pedira que presione enter para continuar, despues se abre estas
 * opciones:
 * 
 * --Examenes--
 * 1. Examenes fisicos
 * 2. Examenes adicionales
 * 
 * opcion: __
 * 
 * al seleccionar una opcion me llevara a :
 * --Examenes Fisicos--
 * carga una lista de 10 examenes fisicos comunes y solo se pueda escoger 5
 * y presionar enter para continuar
 * despues..
 * --Examenes Adicionales--
 * 1. examen imagenologia
 * 2. examenes laboratorio
 * 
 * si presiono alguna opcion me llevara a :
 * --Examenes imagenenologia--
 * cargame 5 examenes y solo se pueda escoger 1
 * --Examenes Laboratorio--
 * cargame 5 examenes y solo se pueda escoger 1
 * 
 * y al final que diga, finalizar consulta... y me lleve denuevo al menu
 * principal, para generar otra consulta medica jajaja
 * 
 * 
 */