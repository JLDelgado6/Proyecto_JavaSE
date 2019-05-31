package utiles;

import aire.Avion;
import aire.Dron;
import start.Vehiculo;
import tierra.Camion;
import tierra.Coche;



public class Listar {

	public static void listar() {

				
		String salida = "";
		System.out.println("Col1\t Col2");
		
		for (Vehiculo v : utiles.GestList.lstVehiculos) {
			if (v instanceof Coche) {
				salida =+ utiles.GestList.lstVehiculos.indexOf(v)+ "\t COCHE  " 
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
				salida = utiles.GestList.lstVehiculos.indexOf(v)+ "\t CAMION " 
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
				salida = utiles.GestList.lstVehiculos.indexOf(v)+ "\t DRON   " 
						+          v.getNumBastidor() + "\t "
						+ ((Dron) v).getAlturaMaxima() + "\t "
						+ ((Dron) v).getKmAutonomia() + "\t "
						+ ((Dron) v).getTipoCamara() + "\t " 
						+ ((Dron) v).getPotencia() + "\t\t\t\t " 
						+ ((Dron) v).getCarnet() + "\t "
						+  " ";  
			}
			if (v instanceof Avion) {
				salida =utiles.GestList.lstVehiculos.indexOf(v)+ "\t AVION  " 
						
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
	
		}

	