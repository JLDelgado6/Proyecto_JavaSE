package utiles;

import aire.Avion;
import aire.Dron;
import start.Vehiculo;
import tierra.Camion;
import tierra.Coche;

/**Clase listar. Muestra por pantalla todos los valores de la tabla que se hayan introducido diferenciando entre los cuatro tipos y según cual sea, mostrando sus características.
 * @author Alejandro
 * @version 02/06/2019 
 */

public class Listar {
	

	public static void listar() {

				if(utiles.GestList.lstVehiculos.size()>0) {
		String salida = "";
		System.out.println("Col1\t Col2");
		
		for (Vehiculo v : utiles.GestList.lstVehiculos) {
			Integer indice;
			indice = utiles.GestList.lstVehiculos.indexOf(v) + 1;
			if (v instanceof Coche) {
				salida =indice+ "\t COCHE  " 
						+          v.getNumBastidor() + "\t "
						+ ((Coche) v).getMarca() + "\t " 
						+ ((Coche) v).getModelo() + "\t " 
						+ ((Coche) v).getTipoCombustible() + "\t "
						+ ((Coche) v).getNumPuertas() + "\t "
						+ ((Coche) v).getVolumenMaletero() + "\t "
						+ ((Coche) v).getCarnet() + "\t "
						+ ((Coche) v).getPotencia() + "\t "
						+  " ";
						
			}
			if (v instanceof Camion) {
				salida = indice+ "\t CAMION " 
						+          v.getNumBastidor() + "\t "
						+ ((Camion) v).getMarca() + "\t " 
						+ ((Camion) v).getModelo() + "\t " 
						+ ((Camion) v).getTipoCombustible() + "\t "
						+ ((Camion) v).getTara() + "\t "
						+ ((Camion) v).getNumEjes() + "\t "
						+ ((Camion) v).getCarnet() + "\t "
						+ ((Camion) v).getPotencia() + "\t "
						+  " ";
			}
			if (v instanceof Dron) {
				salida = indice+ "\t DRON   " 
						+          v.getNumBastidor() + "\t "
						+ ((Dron) v).getAlturaMaxima() + "\t "
						+ ((Dron) v).getKmAutonomia() + "\t "
						+ ((Dron) v).getTipoCamara() + "\t " 
						+ ((Dron) v).getPotencia() + "\t\t\t\t " 
						+ ((Dron) v).getCarnet() + "\t "
						+  " ";  
			}
			if (v instanceof Avion) {
				salida =indice+ "\t AVION  " 
						+          v.getNumBastidor() + "\t "
						+ ((Avion) v).getAlturaMaxima() + "\t "
						+ ((Avion) v).getKmAutonomia() + "\t "
						+ ((Avion) v).getMaxPasajeros() + "\t "
						+ ((Avion) v).getNumTurbinas() + "\t "
						+  " "; 
			}
			System.out.println(salida);
			}

		}
	else {
		System.out.println("La lista está vacía, introduzca algun dato");
		utiles.Introducir.introducir();
	}
	
		}
}

	