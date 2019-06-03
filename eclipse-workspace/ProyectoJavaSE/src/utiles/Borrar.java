package utiles;

import java.util.List;

import aire.Avion;
import aire.Dron;
import start.Vehiculo;
import tierra.Camion;
import tierra.Coche;

/**Clase Borrar. Permite borrar vehículos listados en el sistema.
 * @author José Luis 
 * @version 03/06/2019
 */

@SuppressWarnings("unused")
public class Borrar {

	/**Función Borrar. Pregunta primero si se quiere volver atrás o se quiere borrar un vehículo
	 * Cuando se elige borrar, vuelve al menú principal si la lista está vacía, y pide el vehículo a borrar si no lo está.
	 * Se tratan excepciones cuando se introducen caracteres no válidos: valores no numéricos y valores numéricos superiores al índice máximo
	 * @author José Luis 
	 * @version 03/06/2019
	 */
 public static void borrar() {
		//
		// lanzar lista
	 int opcion = 0;
	 
		Integer vb;
		Integer tamanoListaMod = utiles.GestList.lstVehiculos.size()+1;
		try {
			opcion = utiles.LecturaTeclado.lecturaEntero("* Pulsar 0 para volver, 1 para borrar. *");
			switch(opcion) {
			case 0:
				start.App.main(null);
				break;
			case 1:
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
			break;
			} 
		} catch (Exception e) {
		} finally {
			System.out.println("No es un tipo de dato permitido");
		}
		;
	}


}