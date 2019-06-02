package utiles;

import java.util.List;

import aire.Avion;
import aire.Dron;
import start.Vehiculo;
import tierra.Camion;
import tierra.Coche;

/**
 * @author José Luis Clase Borrar. Permite borrar vehículos listados en el
 *         sistema.
 * @version 03/06/2019
 */
@SuppressWarnings("unused")
public class Borrar {

	public static void borrar() {

		int opcion = 0;
		do {
			try {mostrarMenu();
				opcion = utiles.LecturaTeclado.lecturaEntero("* Pulsar 0 para salir. ");
				ejecutarOpcion(opcion);
			} catch (Exception e1) {
				System.out.println("XXX No es un tipo de dato permitido XXX");
			}
		} while (opcion != 0);
	}

	/*
	 * int opcion = 0; String salida;
	 */
	//
	// lanzar lista
	private static void ejecutarOpcion(int opcion) {
		System.out.println("**********************************");
		switch(opcion) {
	    case 1: 
		Integer vb;
		Integer tamanoListaMod = utiles.GestList.lstVehiculos.size() + 1;
		try {
			do {
				vb = 0;
				if (utiles.GestList.lstVehiculos.size() == 0) {
					System.out.println("La lista seleccionada está vacía");
				} else {
					utiles.Listar.listar();
					// System.out.println(utiles.GestList.lstVehiculos);
					vb = utiles.LecturaTeclado.lecturaEntero("* Pulsar elemento que desea borrar. ");
					Vehiculo vehBorrado = utiles.GestList.lstVehiculos.get(vb - 1);
					utiles.GestList.lstVehiculos.remove(vehBorrado);
					utiles.Listar.listar();
					}		
			} while (vb >= 0 && vb < tamanoListaMod);
			opcion=0;
		} catch (Exception e) {
		} finally {
			System.out.println("No es un tipo de dato permitido");
		}
		
	}
}
	private static void mostrarMenu() {
		System.out.println("******************");
		System.out.println("* MENU BORRADO *");
		System.out.println("**********************************");
		System.out.println("*Opción 0. Salir    			 *");
		System.out.println("*Opción 1. Borrar un vehículo    *");
		System.out.println("**********************************");

	}
}
