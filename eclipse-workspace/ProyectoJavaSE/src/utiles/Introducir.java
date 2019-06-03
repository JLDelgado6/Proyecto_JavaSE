package utiles;

import aire.Avion;
import aire.Dron;
import tierra.Camion;
import tierra.Coche;
import tipos.TpCAM;
import tipos.TpCAR;
import tipos.TpCOM;

/**Clase Introducir. Permite introducir nuevos veh�culos al sistema.
 * @author Sebasti�n
 * @version 02/06/2019 
 */
public class Introducir {
	/**Clase introducir. Muestra en primer lugar el menu de veh�culos disponibles que se pueden introducir en el sistema,y seg�n cual sea la �pci�n, ejecutara la clase ejecutarOpcion.
	 * @author Sebasti�n
	 * @version 02/06/2019 
	 */
	public static void introducir() {	
		int opcion = 0;
		do {mostrarMenu();
		        try {
				opcion = utiles.LecturaTeclado.lecturaEntero("* Pulsar 0 para salir. ");
				ejecutarOpcion(opcion);
		        }catch(Exception e1) {
		        	System.out.println("XXX No es un tipo de dato permitido XXX");	
		        }
			} while (opcion != 0);	
		//utiles.Ordenacion.ordenacion();
		}
	/**Clase ejecutarOpcion. Seg�n la opci�n marcada, te pedir� los datos necesarios para guardarlo en el sistema.
	 * @author Sebasti�n
	 * @version 02/06/2019 
	 */	
	private static void ejecutarOpcion(int opcion) {
		System.out.println("**********************************");
		switch(opcion) {
	    	case 1: 
	    		System.out.println("Introduzca los siguientes Datos:");
	    		try {
			    String a1 = utiles.LecturaTeclado.lecturaString("- N�mero de Bastidor: ");
			    String b1 = utiles.LecturaTeclado.lecturaString("- Marca: ");
			    String c1 = utiles.LecturaTeclado.lecturaString("- Modelo: ");
			    Integer d1 = utiles.LecturaTeclado.lecturaEntero("- N�meros de Puertas(de 2 a 7): ");
			    if (d1<2 || d1>7) {System.out.println("XXX El N�mero de Puertas no es correcto XXX");ejecutarOpcion(1);}
			    Integer e1 = utiles.LecturaTeclado.lecturaEntero("- Volumen del Maletero (dm^3): ");
			    if (e1 < 0 || e1>1000) {System.out.println("XXX El Volumen de Maletero no es correcto XXX");ejecutarOpcion(1);}
			    TpCAR f1 = utiles.LecturaTeclado.lecturaTpCAR("- Tipo de Carnet: ");
			    TpCOM g1 = utiles.LecturaTeclado.lecturaTpCOM("- Tipo de Combustiple: ");
			    
			    utiles.GestList.lstVehiculos.add( new Coche(a1,b1,c1,g1,d1,e1,f1));
			    
	    		} catch(Exception e1) {
	    			System.out.println("XXX No es un tipo de dato permitido XXX");
	    			ejecutarOpcion(1);
	    		}
	    		break;
	    		
			case 2: 
				try {
				System.out.println("Introduzca los siguientes Datos:");
			    String a2 = utiles.LecturaTeclado.lecturaString("- N�mero de Bastidor: ");
			    String b2 = utiles.LecturaTeclado.lecturaString("- Marca: ");
			    String c2 = utiles.LecturaTeclado.lecturaString("- Modelo: ");
			    Integer d2 = utiles.LecturaTeclado.lecturaEntero("- Tara(Kg): ");
			    if (d2 < 500 || d2 > 31000) {System.out.println("XXX La Tara no es correcta XXX");ejecutarOpcion(2);}
			    Integer e2 = utiles.LecturaTeclado.lecturaEntero("- N�mero de Ejes: ");
			    if (e2 < 1 || e2 > 4) {System.out.println("XXX El N�mero de Ejes no es correcto XXX");ejecutarOpcion(2);}
			    TpCAR f2 = utiles.LecturaTeclado.lecturaTpCAR("- Tipo de Carnet: ");
			    TpCOM g2 = utiles.LecturaTeclado.lecturaTpCOM("- Tipo de Combustiple: ");
			    
			    utiles.GestList.lstVehiculos.add( new Camion(a2,b2,c2,g2,d2,e2,f2));
				} catch(Exception e1) {
	    			System.out.println("XXX No es un tipo de dato permitido XXX");
	    			ejecutarOpcion(2);
	    		}
	    		break;
	    		
			case 3: 
				try {
				System.out.println("Introduzca los siguientes Datos:");
			    String a3 = utiles.LecturaTeclado.lecturaString("- N�mero de Bastidor: ");
			    Integer b3 = utiles.LecturaTeclado.lecturaEntero("- Altura M�xima de Vuelo (m): ");
			    if (b3 < 0 || b3 > 1000) {System.out.println("XXX La Altura M�xima de Vuelo no es correcta XXX");ejecutarOpcion(3);}
			    Integer c3 = utiles.LecturaTeclado.lecturaEntero("- Kilometro de Autonom�a (km) ");
			    if (c3 < 0 || c3 > 10000000) {System.out.println("XXX El kilometro de Autonom�a no es correcto XXX");ejecutarOpcion(3);}
			    Integer d3 = utiles.LecturaTeclado.lecturaEntero("- Potencia (kV)-(min 10kV) ");
			    if (d3 < 10  || d3 > 50000) {System.out.println("XXX La Potencia no es correcta XXX");ejecutarOpcion(3);}
			    TpCAM f3 = utiles.LecturaTeclado.lecturaTpCAM("- Tipo de C�mara: ");
			    TpCAR g3 = utiles.LecturaTeclado.lecturaTpCAR("- Tipo de Combustiple: ");
			    
			    utiles.GestList.lstVehiculos.add( new Dron(a3,b3,c3,f3,d3,g3));
			    
				} catch(Exception e1) {
	    			System.out.println("XXX No es un tipo de dato permitido XXX");
	    			ejecutarOpcion(3);
	    		}
	    		break;
	    		
			case 4: 
				try {
				System.out.println("Introduzca los siguientes Datos:");
			    String a4 = utiles.LecturaTeclado.lecturaString("- N�mero de Bastidor: ");
			    Integer b4 = utiles.LecturaTeclado.lecturaEntero("- Altura M�xima de Vuelo (m): ");
			    if (b4 < 0 || b4 > 12800) {System.out.println("XXX La Altura M�xima de Vuelo no es correcta XXX");ejecutarOpcion(4);}
			    Integer c4 = utiles.LecturaTeclado.lecturaEntero("- Kilometro de Autonom�a ");
			    if (c4 < 0) {System.out.println("XXX El kilometro de Autonom�a no es correcto XXX");ejecutarOpcion(4);}
			    Integer d4 = utiles.LecturaTeclado.lecturaEntero("- M�ximo N�mero de Pasajeros:  ");
			    if (d4 < 5 || d4 > 550) {System.out.println("XXX El M�ximo N�mero de Pasajeros no es correcto XXX");ejecutarOpcion(4);}
			    Integer e4 = utiles.LecturaTeclado.lecturaEntero("- M�ximo N�mero de Turbinas: (entre 2 y 6)  ");
			    if (e4 < 2 || e4 > 6) {System.out.println("XXX El M�ximo N�mero de Turbinas no es correcto XXX");ejecutarOpcion(4);}
			    
			    utiles.GestList.lstVehiculos.add( new Avion (a4,b4,c4,d4,e4));
			       
				} catch(Exception e1) {
	    			System.out.println("XXX No es un tipo de dato permitido XXX");
	    			ejecutarOpcion(4);
	    		}
	    		break;
			case 0: break;
			default:System.out.println("XXX Por favor, elija una opci�n entre 0-4 XXX");
			        introducir();
			}    
		
		    System.out.println("**********************************"); 
		    System.out.println("----------------------------------"); 
		}
	
	/*** Clase mostrarMenu. Muestra el men� de veh�culos posibles a introducir en el sistema.
	 * @author Sebasti�n
	 * @version 02/06/2019 
	 */
	   private static void mostrarMenu() {
			System.out.println("\nMENU VEH�CULOS");
			System.out.println("**********************************");
			System.out.println("*Opci�n 1. Introducir un Coche   *");
			System.out.println("*Opci�n 2. Introducir un Cami�n  *");
			System.out.println("*Opci�n 3. Introducir un Dron    *");
			System.out.println("*Opci�n 4. Introducir un Avi�n   *");
			System.out.println("**********************************");
		}
}
