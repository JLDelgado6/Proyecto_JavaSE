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
			if (v instanceof Camion) {
				salida = utiles.GestList.lstVehiculos.indexOf(v)+ " CAMION " 
						+          v.getNumBastidor() + " "
						+ ((Camion) v).getMarca() + " " 
						+ ((Camion) v).getModelo() + " " 
						+ ((Camion) v).getTipoCombustible() + " "
						+ ((Camion) v).getTara() + " "
						+ ((Camion) v).getNumEjes() + " "
						+  " ";
			}
			if (v instanceof Dron) {
				salida = utiles.GestList.lstVehiculos.indexOf(v)+ " DRON   " 
						+          v.getNumBastidor() + " "
						+ ((Dron) v).getAlturaMaxima() + " "
						+ ((Dron) v).getKmAutonomia() + " "
						+ ((Dron) v).getTipoCamara() + " " 
						+ ((Dron) v).getPotencia() + " " 
						+  " ";  
			}
			if (v instanceof Avion) {
				salida =utiles.GestList.lstVehiculos.indexOf(v)+ " AVION  " 
						
						+          v.getNumBastidor() + " "
						+ ((Avion) v).getAlturaMaxima() + " "
						+ ((Avion) v).getKmAutonomia() + " "
						+ ((Avion) v).getMaxPasajeros() + " "
						+ ((Avion) v).getNumTurbinas() + " "
						+  " "; 
			}
			System.out.println(salida);
			}
		}
		}

	