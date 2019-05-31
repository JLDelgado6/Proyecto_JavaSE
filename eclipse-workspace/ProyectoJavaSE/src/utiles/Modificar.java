package utiles;

import start.Vehiculo;
import tierra.Coche;

public class Modificar {
	public static void modificar() {
		utiles.Listar.listar();
		
		int opcion = 0;
		do {opcion = utiles.LecturaTeclado.lecturaEntero("Indica el número del elemento que quieres modificar (ver Col1)\n" 
		+ "");
				Vehiculo vehiculoElegido = utiles.GestList.lstVehiculos.get(opcion);
				System.out.println(vehiculoElegido);
			} while (opcion != 0);			
		
		for (Vehiculo v : utiles.GestList.lstVehiculos) {
			if (v instanceof Coche) {
			//String mostrarMenuCoche(){
				return;
				
			}
			}
		}
		}


		/**
			String cambioString;
			
			switch(tipoVehiculo) {
			case 1 utiles.LecturaTeclado.lecturaString(cambioString); break;
			}
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



modificar StringMod(StringOriginal) {
	String datoModificar = numBastidor;
	
	
	
}
modificar IntegerMod(IntegerOriginal) {
	
}
modificar TipoMod() {
	
}
	 */
		
		/*String respuesta = lecturaString(pregunta);
		return Integer.parseInt( respuesta );
		utiles.GestList.lstVehiculos.get(respuesta);
		*/
		//utiles.GestList.lstVehiculos.set(0,utiles.Introducir());
		
	
	

