package utiles;

import start.Vehiculo;
import tierra.Coche;

public class Modificar {
	public static void modificar() {
		utiles.Listar.listar();
		
		int opcion = 0;
		do {	opcion = utiles.LecturaTeclado.lecturaEntero("¿Qué elemento de la lista quieres borrar?");
				System.out.println("Este es el elemento que vas a modificar: " + modificarCoche());
			} while (opcion != 0);
	}
		
		public void modificarCoche() {
		String salida = "";
		for (Vehiculo v : utiles.GestList.lstVehiculos) {
			if (v instanceof Coche) {
				salida =+ utiles.GestList.lstVehiculos.indexOf(v)+ " COCHE  " 
						+          v.getNumBastidor() + " "
						+ ((Coche) v).getModelo() + " " 
						+ ((Coche) v).getTipoCombustible() + " "
						+ ((Coche) v).getNumPuertas() + " "
						+ ((Coche) v).getVolumenMaletero() + " "
						+  " ";
						
			}
			System.out.println(salida);
		
		
	}

	 }
}
	 
		
		/*String respuesta = lecturaString(pregunta);
		return Integer.parseInt( respuesta );
		utiles.GestList.lstVehiculos.get(respuesta);
		*/
		//utiles.GestList.lstVehiculos.set(0,utiles.Introducir());
		
	
	

