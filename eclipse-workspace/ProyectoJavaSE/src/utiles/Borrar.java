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
		Integer vb;
		Integer tamanoListaMod = utiles.GestList.lstVehiculos.size() + 1;
		try {
			do {
				vb = 0;
				if (utiles.GestList.lstVehiculos.size() == 0) {
					System.out.println("La lista seleccionada está vacía");
					start.App.main(null);
				} else {
					utiles.Listar.listar();
					// System.out.println(utiles.GestList.lstVehiculos);
					vb = utiles.LecturaTeclado.lecturaEntero("* Pulsar elemento que desea borrar. ");
					Vehiculo vehBorrado = utiles.GestList.lstVehiculos.get(vb - 1);
					utiles.GestList.lstVehiculos.remove(vehBorrado);
					utiles.Listar.listar();
					start.App.main(null);
				}
			} while (vb >= 0 && vb < tamanoListaMod);

		} catch (Exception e) {
		} finally {
			System.out.println("No es un tipo de dato permitido");
		}
		;
	}
}
