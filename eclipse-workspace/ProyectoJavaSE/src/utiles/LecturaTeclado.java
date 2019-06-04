package utiles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import tipos.TpCAM;
import tipos.TpCAR;
import tipos.TpCOM;
/**Clase LecturaTeclado. Esta clase contiene todas las clases necesarias para poder leer cualquier tipo de dato que entre al sistema.
 * @author Sebasti�n
 * @version 02/06/2019 
 */
public class LecturaTeclado {

	/**Clase lecturaString. Permite introducir al sistema desde el teclado un elemento tipo String.
	 * @author Sebasti�n
	 * @version 02/06/2019
	 * @return Un elemento String.
	 * @param respuesta El valor del String. 
	 */
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
	/**Clase lecturaInteger. Permite introducir al sistema desde el teclado un elemento tipo Integer.
	 * @author Sebasti�n
	 * @version 02/06/2019
	 * @return Un elemento Integer. 
	 * @param respuesta El valor del Integer.
	 */
	public static Integer lecturaEntero(String pregunta) {
		String respuesta  = lecturaString(pregunta);
		return Integer.parseInt( respuesta );
	}
	/**Clase lecturaTpCAR. Permite introducir al sistema desde el teclado un elemento tipo enum TpCAR.
	 * @author Sebasti�n
	 * @version 02/06/2019
	 * @return Un elemento TpCAR.
	 * @param respuesta El valor del Enum TpCAR. 
	 */
	public static TpCAR lecturaTpCAR(String pregunta) {
		
		int opcion = 0;
		do {mostrarMenuTpCAR();
				opcion = utiles.LecturaTeclado.lecturaEntero("* Pulsar 0 para salir. ");
				return ejecutarOpcionTpCAR(opcion);
			} while (opcion!= 0);	
		}
	/**Clase ejecutarOpcionTpCAR. Seg�n la opci�n marcada, se introducir� en el sistema un tipo de carnet determinado.
	 * @author Sebasti�n
	 * @version 02/06/2019 
	 */	
	 private static TpCAR ejecutarOpcionTpCAR (Integer opcion) {
	    	TpCAR respuesta = null;
			switch (opcion) {
			   case 1: respuesta = TpCAR.B1;break;
			   case 2: respuesta = TpCAR.B2;break;
			   case 3: respuesta = TpCAR.C1;break;
			   case 4: respuesta = TpCAR.D;break;
			   default:System.out.println("XXX Por favor, elija una opci�n entre 0-4 XXX");
			           lecturaTpCAR("- Tipo de Carnet: ");break;
			}
			return respuesta;
	  }
	    /**Clase mostrarMenuTpCAR. Muestra el men� de de tipos de carnets de conducir posibles a introducir en el sistema.
		 * @author Sebasti�n
		 * @version 02/06/2019 
		 */    	   
	    private static void mostrarMenuTpCAR() {
				System.out.println("\nMENU TIPO DE CARNET");
				System.out.println("**********************************");
				System.out.println("*Opci�n 1. Carnet B1             *");
				System.out.println("*Opci�n 2. Carnet B2             *");
				System.out.println("*Opci�n 3. Carnet C              *");
				System.out.println("*Opci�n 4. Carnet D              *");
				System.out.println("**********************************");			
		}
	    /**Clase lecturaTpCOM. Permite introducir al sistema desde el teclado un elemento tipo enum TpCOM.
		 * @author Sebasti�n
		 * @version 02/06/2019
		 * @return Un elemento TpCOM.
		 * @param respuesta El valor del Enum TpCOM.  
		 */
	    public static TpCOM lecturaTpCOM(String pregunta) {
			
			int opcion = 0;
			do {mostrarMenuTpCOM();
					opcion = utiles.LecturaTeclado.lecturaEntero("* Pulsar 0 para salir. ");
					return ejecutarOpcionTpCOM(opcion);
				} while (opcion!=0);
			}
	    /**Clase ejecutarOpcionTpCOM. Seg�n la opci�n marcada, se introducir� en el sistema un tipo de combustible determinado.
		 * @author Sebasti�n
		 * @version 02/06/2019 
		 */	
		 private static TpCOM ejecutarOpcionTpCOM (Integer opcion) {
		    	TpCOM respuesta = null;
				switch (opcion) {
				   case 1: respuesta = TpCOM.GASOLINA;break;
				   case 2: respuesta = TpCOM.DIESEL;break;
				   case 3: respuesta = TpCOM.ELECTRICO;break;
				   default:System.out.println("XXX Por favor, elija una opci�n entre 0-3 XXX");
				           lecturaTpCOM("- Tipo de Combustiple: ");break;
				}
				return respuesta;
		  }
		    /**Clase mostrarMenuTpCOM. Muestra el men� de de tipos de combustibles posibles a introducir en el sistema.
			 * @author Sebasti�n
			 * @version 02/06/2019 
			 */    	   
		    private static void mostrarMenuTpCOM() {
					System.out.println("\nMENU TIPO DE COMBUSTIBLE");
					System.out.println("**********************************");
					System.out.println("*Opci�n 1. Gasolina              *");
					System.out.println("*Opci�n 2. Diesel                *");
					System.out.println("*Opci�n 3. El�ctrico             *");
					System.out.println("**********************************");			
			}
		    /**Clase lecturaTpCAM. Permite introducir al sistema desde el teclado un elemento tipo enum TpCAM.
			 * @author Sebasti�n
			 * @version 02/06/2019
			 * @return Un elemento TpCAM.
			 * @param respuesta El valor del Enum TpCAM.  
			 */
		    public static TpCAM lecturaTpCAM(String pregunta) {
				
				int opcion = 0;
				do {mostrarMenuTpCAM();
						opcion = utiles.LecturaTeclado.lecturaEntero("* Pulsar 0 para salir. ");
						return ejecutarOpcionTpCAM(opcion);
					} while (opcion!=0);
				}
		    /**Clase ejecutarOpcionTpCAM. Seg�n la opci�n marcada, se introducir� en el sistema un tipo de c�mara determinado.
			 * @author Sebasti�n
			 * @version 02/06/2019 
			 */	
			    private static TpCAM ejecutarOpcionTpCAM (Integer opcion) {
			    	TpCAM respuesta = null;
					switch (opcion) {
					   case 1: respuesta = TpCAM.NINGUNA;break;
					   case 2: respuesta = TpCAM.HD;break;
					   case 3: respuesta = TpCAM._4K;break;
					   default:System.out.println("XXX Por favor, elija una opci�n entre 0-3 XXX");
					           lecturaTpCAM("- Tipo de C�mara: ");break;
					}
					return respuesta;
			    }
			    /**Clase mostrarMenuTpCAM. Muestra el men� de de tipos de c�maras posibles a introducir en el sistema.
				 * @author Sebasti�n
				 * @version 02/06/2019 
				 */    	   
			    private static void mostrarMenuTpCAM() {
						System.out.println("\nMENU TIPO DE C�MARA");
						System.out.println("**********************************");
						System.out.println("*Opci�n 1. Ninguna               *");
						System.out.println("*Opci�n 2. HD                    *");
						System.out.println("*Opci�n 3. 4K                    *");
						System.out.println("**********************************");
				}
}
