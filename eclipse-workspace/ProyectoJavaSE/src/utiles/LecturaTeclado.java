package utiles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import tipos.TpCAM;
import tipos.TpCAR;
import tipos.TpCOM;

public class LecturaTeclado {

	
	public static String lecturaString(String pregunta) {
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		String respuesta = "";
		System.out.print(pregunta);
		try {
			respuesta = teclado.readLine();
		} catch (IOException e) {
		}
		return respuesta;
	}
	public static Integer lecturaEntero(String pregunta) {
		String respuesta  = lecturaString(pregunta);
		return Integer.parseInt( respuesta );
	}
	
	public static Double lecturaDecimal(String pregunta) {
		String respuesta = lecturaString(pregunta);
		return Double.parseDouble( respuesta );
	}
	
	public static TpCAR lecturaTpCAR(String pregunta) {
		
		int opcion = 0;
		do {mostrarMenuTpCAR();
				opcion = utiles.LecturaTeclado.lecturaEntero("* Pulsar 0 para salir. ");
				return ejecutarOpcionTpCAR(opcion);
			} while (opcion!= 0);	
		}
		
	    private static TpCAR ejecutarOpcionTpCAR (Integer opcion) {
	    	TpCAR respuesta = null;
			switch (opcion) {
			   case 1: respuesta = TpCAR.B1;break;
			   case 2: respuesta = TpCAR.B2;break;
			   case 3: respuesta = TpCAR.C1;break;
			   case 4: respuesta = TpCAR.D;break;
			   default:System.out.println("XXX Por favor, elija una opción entre 0-4 XXX");
			           lecturaTpCAR("- Tipo de Carnet: ");
			}
			return respuesta;
	    }
		    	   
	    private static void mostrarMenuTpCAR() {
				System.out.println("\nMENU TIPO DE CARNET");
				System.out.println("**********************************");
				System.out.println("*Opción 1. Carnet B1             *");
				System.out.println("*Opción 2. Carnet B2             *");
				System.out.println("*Opción 3. Carnet C              *");
				System.out.println("*Opción 4. Carnet D              *");
				System.out.println("**********************************");			
		}
	    public static TpCOM lecturaTpCOM(String pregunta) {
			
			int opcion = 0;
			do {mostrarMenuTpCOM();
					opcion = utiles.LecturaTeclado.lecturaEntero("* Pulsar 0 para salir. ");
					return ejecutarOpcionTpCOM(opcion);
				} while (opcion!=0);
			}
			
		    private static TpCOM ejecutarOpcionTpCOM (Integer opcion) {
		    	TpCOM respuesta = null;
				switch (opcion) {
				   case 1: respuesta = TpCOM.GASOLINA;break;
				   case 2: respuesta = TpCOM.DIESEL;break;
				   case 3: respuesta = TpCOM.ELECTRICO;break;
				   default:System.out.println("XXX Por favor, elija una opción entre 0-3 XXX");
				           lecturaTpCOM("- Tipo de Combustiple: ");
				}
				return respuesta;
		    }
			    	   
		    private static void mostrarMenuTpCOM() {
					System.out.println("\nMENU TIPO DE COMBUSTIBLE");
					System.out.println("**********************************");
					System.out.println("*Opción 1. Gasolina              *");
					System.out.println("*Opción 2. Diesel                *");
					System.out.println("*Opción 3. Eléctrico             *");
					System.out.println("**********************************");			
			}
		    public static TpCAM lecturaTpCAM(String pregunta) {
				
				int opcion = 0;
				do {mostrarMenuTpCAM();
						opcion = utiles.LecturaTeclado.lecturaEntero("* Pulsar 0 para salir. ");
						return ejecutarOpcionTpCAM(opcion);
					} while (opcion!=0);
				}
				
			    private static TpCAM ejecutarOpcionTpCAM (Integer opcion) {
			    	TpCAM respuesta = null;
					switch (opcion) {
					   case 1: respuesta = TpCAM.NINGUNA;break;
					   case 2: respuesta = TpCAM.HD;break;
					   case 3: respuesta = TpCAM._4K;break;
					   default:System.out.println("XXX Por favor, elija una opción entre 0-3 XXX");
					           lecturaTpCAM("- Tipo de Cámara: ");
					}
					return respuesta;
			    }
				    	   
			    private static void mostrarMenuTpCAM() {
						System.out.println("\nMENU TIPO DE CÁMARA");
						System.out.println("**********************************");
						System.out.println("*Opción 1. Ninguna               *");
						System.out.println("*Opción 2. HD                    *");
						System.out.println("*Opción 3. 4K                    *");
						System.out.println("**********************************");
				}
}
