package utiles;

import aire.Avion;
import aire.Dron;
import start.Vehiculo;
import tierra.Camion;
import tierra.Coche;

/**Clase modificar. Muestra en primer lugar la list con los datos y mediante una lectura del teclado se selecciona el elemento a modificar, según el tipo que sea, lanza la clase ModificarSegunTipos.
 * @author Alejandro
 * @version 02/06/2019 
 */
public class Modificar {
	public static void modificar() {
		utiles.Listar.listar();
		try {
		int opcion = 0;
		
		do {opcion = utiles.LecturaTeclado.lecturaEntero("Indica el número del elemento que quieres modificar (ver Col1)\n" 
		+ "");
		int opcionReal = opcion - 1;
		
		Vehiculo vehiculoElegido = utiles.GestList.lstVehiculos.get(opcionReal);
		
		
			if (vehiculoElegido instanceof Coche) {
				utiles.ModificarSegunTipos.modificarCoche(opcionReal);
				utiles.ModificarSegunTipos.mostrarCoche(opcionReal);
			}
			if (vehiculoElegido instanceof Dron) {
				utiles.ModificarSegunTipos.modificarDron(opcionReal);
				utiles.ModificarSegunTipos.mostrarDron(opcionReal);
			}
			if (vehiculoElegido instanceof Camion) {
				utiles.ModificarSegunTipos.modificarCamion(opcionReal);
				utiles.ModificarSegunTipos.mostrarCamion(opcionReal);
			}
			if (vehiculoElegido instanceof Avion) {
				utiles.ModificarSegunTipos.modificarAvion(opcionReal);
				utiles.ModificarSegunTipos.mostrarAvion(opcionReal);
			}
		
			
		
		}while(opcion!=0); 
}catch(Exception e) {}
		finally {System.out.println("Revise los datos introducidos por favor\n"); modificar();}
		
}
}


	

