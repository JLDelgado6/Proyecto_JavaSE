package utiles;

import java.util.List;

import aire.Avion;
import aire.Dron;
import start.Vehiculo;
import tierra.Camion;
import tierra.Coche;

/**Clase Borrar. Permite borrar veh�culos listados en el sistema.
 * @author Jos� Luis 
 * @version 03/06/2019
 */

@SuppressWarnings("unused")
public class Borrar {

	/**Funci�n Borrar. Pregunta primero si se quiere volver atr�s o se quiere borrar un veh�culo
	 * Cuando se elige borrar, vuelve al men� principal si la lista est� vac�a, y pide el veh�culo a borrar si no lo est�.
	 * Se tratan excepciones cuando se introducen caracteres no v�lidos: valores no num�ricos y valores num�ricos superiores al �ndice m�ximo
	 * @author Jos� Luis 
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
					System.out.println("La lista seleccionada est� vac�a");
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