package utiles;

import aire.Avion;
import aire.Dron;
import tierra.Camion;
import tierra.Coche;
import tipos.TpCAM;
import tipos.TpCAR;
import tipos.TpCOM;

public class Introducir {
	public static void introducir() {
		
		int opcion = 0;
		do {mostrarMenu();
				opcion = utiles.LecturaTeclado.lecturaEntero("* Pulsar 0 para salir. ");
				ejecutarOpcion(opcion);
			} while (opcion != 0);	
		}
		
	    private static void ejecutarOpcion(int opcion) {
			switch(opcion) {
			case 1: 
				System.out.println("Introduzca los siguientes Datos:");
			    String a1 = utiles.LecturaTeclado.lecturaString("- Número de bastidor: ");
			    String b1 = utiles.LecturaTeclado.lecturaString("- Marca: ");
			    String c1 = utiles.LecturaTeclado.lecturaString("- Modelo: ");
			    Integer d1 = utiles.LecturaTeclado.lecturaEntero("- Números de Puertas: ");
			    Integer e1 = utiles.LecturaTeclado.lecturaEntero("- Volumen del maletero: ");
			    TpCAR f1 = utiles.LecturaTeclado.lecturaTpCAR("- Tipo de Carnet: ");
			    TpCOM g1 = utiles.LecturaTeclado.lecturaTpCOM("- Tipo de Combustiple: ");
			    utiles.GestList.lstVehiculos.add( new Coche(a1,b1,c1,g1,d1,e1,f1));
			    break;
			case 2: 
				System.out.println("Introduzca los siguientes Datos:");
			    String a2 = utiles.LecturaTeclado.lecturaString("- Número de bastidor: ");
			    String b2 = utiles.LecturaTeclado.lecturaString("- Marca: ");
			    String c2 = utiles.LecturaTeclado.lecturaString("- Modelo: ");
			    Integer d2 = utiles.LecturaTeclado.lecturaEntero("- Tara: ");
			    Integer e2 = utiles.LecturaTeclado.lecturaEntero("- Número de Ejes: ");
			    TpCAR f2 = utiles.LecturaTeclado.lecturaTpCAR("- Tipo de Carnet: ");
			    TpCOM g2 = utiles.LecturaTeclado.lecturaTpCOM("- Tipo de Combustiple: ");
			    utiles.GestList.lstVehiculos.add( new Camion(a2,b2,c2,g2,d2,e2,f2));
			    break;
			case 3: 
				System.out.println("Introduzca los siguientes Datos:");
			    String a3 = utiles.LecturaTeclado.lecturaString("- Número de bastidor: ");
			    Integer b3 = utiles.LecturaTeclado.lecturaEntero("- Altura Máxima: ");
			    Integer c3 = utiles.LecturaTeclado.lecturaEntero("- Kilometro de Autonomía ");
			    Integer d3 = utiles.LecturaTeclado.lecturaEntero("- Potencia ");
			    TpCAM f3 = utiles.LecturaTeclado.lecturaTpCAM("- Tipo de Cámara: ");
			    TpCAR g3 = utiles.LecturaTeclado.lecturaTpCAR("- Tipo de Combustiple: ");
			    utiles.GestList.lstVehiculos.add( new Dron(a3,b3,c3,f3,d3,g3));
			    break;
			case 4: 
				System.out.println("Introduzca los siguientes Datos:");
			    String a4 = utiles.LecturaTeclado.lecturaString("- Número de bastidor: ");
			    Integer b4 = utiles.LecturaTeclado.lecturaEntero("- Altura Máxima: ");
			    Integer c4 = utiles.LecturaTeclado.lecturaEntero("- Kilometro de Autonomía ");
			    Integer d4 = utiles.LecturaTeclado.lecturaEntero("- Máximo número de pasajeros:  ");
			    Integer e4 = utiles.LecturaTeclado.lecturaEntero("- Máximo número de turbinas:  ");
			    utiles.GestList.lstVehiculos.add( new Avion (a4,b4,c4,d4,e4));
			    break;
			}    
			    
		}
	   private static void mostrarMenu() {
			System.out.println("\nMENU VEHÍCULOS");
			System.out.println("******************************");
			System.out.println("*Opción 1. Introducir un Coche*");
			System.out.println("*Opción 2. Introducir un Camión *");
			System.out.println("*Opción 3. Introducir un Dron    *");
			System.out.println("*Opción 4. Introducir un Avión  *");
			System.out.println("******************************");
		}
}
