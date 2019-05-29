package utiles;

import java.util.ArrayList;
import java.util.List;

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
		List<Vehiculo> lstVehiculos = new ArrayList<>();
		lstVehiculos.add( new Coche("HSKSNSYDN6555125","RENAULT","MEGANE",TpCOM.GASOLINA,5,2, TpCAR.B1));
		lstVehiculos.add( new Avion("nmmuJKIYU2145552458", 128, 9000,50,82) );
		lstVehiculos.add( new Camion("JKIYUCFF2145458", "IVECO", "DAILY",TpCOM.DIESEL,5400,6,TpCAR.C1) );
		lstVehiculos.add( new Dron("JK5e8e25d5d45f58", 15, 250,TpCAM._4K,5400,TpCAR.C1) );
		lstVehiculos.add( new Avion("nmmuJKIYU2145552458", 124, 50000,540,8) );
		
		String salida = "";
		
		for (Vehiculo v : lstVehiculos) {
			if (v instanceof Coche) {
				salida ="" +  v.getNumBastidor() +"" ;
			}
			if (v instanceof Camion) {
				salida = v.toString();
			}
			if (v instanceof Dron) {
				salida = v.toString();
			}
			if (v instanceof Avion) {
				salida = v.toString();
			}
			System.out.println(salida);
			}
		}
		public void cosasdeprueba() {
			
		
		int opcion = 0;
		switch(opcion){
		
		case 1:
			System.out.println("Para introducir un coche, los datos son estos: (Número bastidor, potencia, carnet");
			/**
		lstVehiculos.add( new Coche(lecturaTeclado()) );
		lstVehiculos.add( new Dron() );
		lstVehiculos.add( new Avion() );
		lstVehiculos.add( new Coche() );
		lstVehiculos.add( new Camion() );
		 lstVehiculos.read(1);
		lstVehiculos.forEach(v ->System.out.println(v));
		*/
	}}

	public void iniciarLista() {
	
	}}