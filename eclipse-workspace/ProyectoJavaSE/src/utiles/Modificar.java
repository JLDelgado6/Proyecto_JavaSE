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
		int opcion = 0;
		do {opcion = utiles.LecturaTeclado.lecturaEntero("Indica el número del elemento que quieres modificar (ver Col1)\n" 
		+ "");
		Vehiculo vehiculoElegido = utiles.GestList.lstVehiculos.get(opcion);
		
		
			if (vehiculoElegido instanceof Coche) {
				utiles.ModificarSegunTipos.modificarCoche(opcion);
				utiles.ModificarSegunTipos.mostrarCoche(opcion);
			}
			if (vehiculoElegido instanceof Dron) {
				utiles.ModificarSegunTipos.modificarDron(opcion);
				utiles.ModificarSegunTipos.mostrarDron(opcion);
			}
			if (vehiculoElegido instanceof Camion) {
				utiles.ModificarSegunTipos.modificarCamion(opcion);
				utiles.ModificarSegunTipos.mostrarCamion(opcion);
			}
			if (vehiculoElegido instanceof Avion) {
				utiles.ModificarSegunTipos.modificarAvion(opcion);
				utiles.ModificarSegunTipos.mostrarAvion(opcion);
			}
		
			
		
}while(opcion!=0); {}
}
}

	

