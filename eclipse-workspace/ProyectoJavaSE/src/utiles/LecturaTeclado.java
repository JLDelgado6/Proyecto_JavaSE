package utiles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import tipos.TpCAR;

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
		String respuesta = lecturaString(pregunta);
		return Integer.parseInt( respuesta );
	}
	
	public static Double lecturaDecimal(String pregunta) {
		String respuesta = lecturaString(pregunta);
		return Double.parseDouble( respuesta );
	}
	
	public static TpCAR lecturaTpCAR(String pregunta) {
			
		int opcion = 0;
		do {mostrarMenu();
				opcion = utiles.LecturaTeclado.lecturaEntero("* Pulsar 0 para salir. ");
				ejecutarOpcion(opcion);
			} while (opcion != 0);
		}
		
	    private static TpCAR ejecutarOpcion (int opcion) {
	    	TpCAR f;
			switch (opcion) {
			   case 1: f = TpCAR.B1 ;
			   case 2: f = TpCAR.B2;
			   case 3: f = TpCAR.C1;
			   case 4: f = TpCAR.D;
			}
			return f;
	    }
		    	   
	    private static void mostrarMenu() {
				System.out.println("\nMENU TIPO DE CARNET");
				System.out.println("******************************");
				System.out.println("*Opción 1. Carnet B1*");
				System.out.println("*Opción 2. Carnet B2*");
				System.out.println("*Opción 3. Carnet C*");
				System.out.println("*Opción 4. Carnet D*");
				System.out.println("******************************");			
		}
}
