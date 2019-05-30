package utiles;

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
			    Integer a1 = utiles.LecturaTeclado.lecturaEntero("- N�mero de bastidor: ");
			    String b1 = utiles.LecturaTeclado.lecturaString("- Marca: ");
			    String c1 = utiles.LecturaTeclado.lecturaString("- Modelo: ");
			    Integer d1 = utiles.LecturaTeclado.lecturaEntero("- N�meros de Puertas: ");
			    Integer e1 = utiles.LecturaTeclado.lecturaEntero("- Volumen del maletero: ");
			    TpCAR f1 = utiles.LecturaTeclado.lecturaTpCAR("- Tipo de Carnet: ");
			    TpCOM g1 = utiles.LecturaTeclado.lecturaTpCOM("- Tipo de Combustiple: ");
			case 2: 
				System.out.println("Introduzca los siguientes Datos:");
			    Integer a2 = utiles.LecturaTeclado.lecturaEntero("- N�mero de bastidor: ");
			    String b2 = utiles.LecturaTeclado.lecturaString("- Marca: ");
			    String c2 = utiles.LecturaTeclado.lecturaString("- Modelo: ");
			    Integer d2 = utiles.LecturaTeclado.lecturaEntero("- Tara: ");
			    Integer e2 = utiles.LecturaTeclado.lecturaEntero("- N�mero de Ejes: ");
			    TpCAR f2 = utiles.LecturaTeclado.lecturaTpCAR("- Tipo de Carnet: ");
			    TpCOM g2 = utiles.LecturaTeclado.lecturaTpCOM("- Tipo de Combustiple: ");
			case 3: 
				System.out.println("Introduzca los siguientes Datos:");
			    Integer a3 = utiles.LecturaTeclado.lecturaEntero("- N�mero de bastidor: ");
			    Integer b3 = utiles.LecturaTeclado.lecturaEntero("- Altura M�xima: ");
			    Integer c3 = utiles.LecturaTeclado.lecturaEntero("- Kilometro de Autonom�a ");
			    Integer d3 = utiles.LecturaTeclado.lecturaEntero("- Potencia ");
			    TpCAM f3 = utiles.LecturaTeclado.lecturaTpCAM("- Tipo de C�mara: ");
			    TpCOM g3 = utiles.LecturaTeclado.lecturaTpCOM("- Tipo de Combustiple: ");
			case 4: 
				System.out.println("Introduzca los siguientes Datos:");
			    Integer a4 = utiles.LecturaTeclado.lecturaEntero("- N�mero de bastidor: ");
			    Integer b4 = utiles.LecturaTeclado.lecturaEntero("- Altura M�xima: ");
			    Integer c4 = utiles.LecturaTeclado.lecturaEntero("- Kilometro de Autonom�a ");
			    Integer d4 = utiles.LecturaTeclado.lecturaEntero("- M�ximo n�mero de pasajeros:  ");
			    Integer e4 = utiles.LecturaTeclado.lecturaEntero("- M�ximo n�mero de turbinas:  ");
			}    
			    
		}
	   private static void mostrarMenu() {
			System.out.println("\nMENU VEH�CULOS");
			System.out.println("******************************");
			System.out.println("*Opci�n 1. Introducir un Coche*");
			System.out.println("*Opci�n 2. Introducir un Cami�n *");
			System.out.println("*Opci�n 3. Introducir un Dron    *");
			System.out.println("*Opci�n 4. Introducir un Avi�n  *");
			System.out.println("******************************");
		}
}
