package utiles;

import java.util.List;

import aire.Avion;
import aire.Dron;
import start.Vehiculo;
import tierra.Camion;
import tierra.Coche;


@SuppressWarnings("unused")
public class Borrar {

	public static void borrar() {

		/*
		 * int opcion = 0; String salida;
		 */
		//
		// lanzar lista
		utiles.Listar.listar();
		System.out.println(utiles.GestList.lstVehiculos);
		Integer	vb = utiles.LecturaTeclado.lecturaEntero("* Pulsar elemento que desea borrar. ");
		Vehiculo vehBorrado = utiles.GestList.lstVehiculos.get(vb);	
			utiles.GestList.lstVehiculos.remove(vehBorrado);
		}
	}


