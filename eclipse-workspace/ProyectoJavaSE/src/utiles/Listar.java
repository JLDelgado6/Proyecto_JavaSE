package utiles;

import aire.Avion;
import aire.Dron;
import start.Vehiculo;
import tierra.Camion;
import tierra.Coche;
import tipos.TpCAM;
import tipos.TpCAR;
import tipos.TpCOM;


public class Listar {

	public static void listar() {
		utiles.GestList.lstVehiculos.add( new Coche( "ER345678901234567","RENAULT","MEGANE",TpCOM.GASOLINA,5,2, TpCAR.B1));
		utiles.GestList.lstVehiculos.add( new Coche( "CD345678901234567","PEUGEOT","ZZ",TpCOM.GASOLINA,5,2, TpCAR.B1));
		utiles.GestList.lstVehiculos.add( new Avion( "AS345678901234567", 128, 9000,50,82) );
		utiles.GestList.lstVehiculos.add( new Coche( "NV345678901234567","FORD","FOCUS",TpCOM.GASOLINA,5,2, TpCAR.B1));
		utiles.GestList.lstVehiculos.add( new Camion("RT345678901234567", "IVECO", "DAILY",TpCOM.DIESEL,5400,6,TpCAR.C1) );
		utiles.GestList.lstVehiculos.add( new Dron(  "KL345678901234567", 15, 250,TpCAM._4K,5400,TpCAR.C1) );
		utiles.GestList.lstVehiculos.add( new Avion( "EW345678901234567", 124, 50000,540,8) );
		utiles.GestList.lstVehiculos.add( new Coche( "TY345678901234567","FORD","FIESTA",TpCOM.GASOLINA,5,2, TpCAR.B1));
				
		String salida = "";
		System.out.println("Col1\t Col2");
		
		for (Vehiculo v : utiles.GestList.lstVehiculos) {
			if (v instanceof Coche) {
				salida =+ utiles.GestList.lstVehiculos.indexOf(v)+ "\t COCHE  " 
						+          v.getNumBastidor() + "\t "
						+ ((Coche) v).getModelo() + "\t " 
						+ ((Coche) v).getTipoCombustible() + "\t "
						+ ((Coche) v).getNumPuertas() + "\t "
						+ ((Coche) v).getVolumenMaletero() + "\t "
						+  " ";
						
			}
			if (v instanceof Camion) {
				salida = utiles.GestList.lstVehiculos.indexOf(v)+ "\t CAMION " 
						+          v.getNumBastidor() + "\t "
						+ ((Camion) v).getMarca() + "\t " 
						+ ((Camion) v).getModelo() + "\t\t " 
						+ ((Camion) v).getTipoCombustible() + "\t "
						+ ((Camion) v).getTara() + "\t "
						+ ((Camion) v).getNumEjes() + "\t "
						+  " ";
			}
			if (v instanceof Dron) {
				salida = utiles.GestList.lstVehiculos.indexOf(v)+ "\t DRON   " 
						+          v.getNumBastidor() + "\t "
						+ ((Dron) v).getAlturaMaxima() + "\t "
						+ ((Dron) v).getKmAutonomia() + "\t\t "
						+ ((Dron) v).getTipoCamara() + "\t " 
						+ ((Dron) v).getPotencia() + "\t " 
						+  " ";  
			}
			if (v instanceof Avion) {
				salida =utiles.GestList.lstVehiculos.indexOf(v)+ "\t AVION  " 
						
						+          v.getNumBastidor() + "\t "
						+ ((Avion) v).getAlturaMaxima() + "\t "
						+ ((Avion) v).getKmAutonomia() + "\t\t "
						+ ((Avion) v).getMaxPasajeros() + "\t "
						+ ((Avion) v).getNumTurbinas() + "\t "
						+  " "; 
			}
			System.out.println(salida);
			}
		}
	
		}

	