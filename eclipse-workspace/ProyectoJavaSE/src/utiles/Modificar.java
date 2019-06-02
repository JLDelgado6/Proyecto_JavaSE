package utiles;

import aire.Avion;
import aire.Dron;
import start.Vehiculo;
import tierra.Camion;
import tierra.Coche;
import tipos.TpCAR;
import tipos.TpCOM;

public class Modificar {
	public static void modificar() {
		utiles.Listar.listar();
		try {
		int opcion = 0;
		
		do {opcion = utiles.LecturaTeclado.lecturaEntero("Indica el n�mero del elemento que quieres modificar (ver Col1)\n" 
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


	

