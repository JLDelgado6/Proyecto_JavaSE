package utiles;

public class Introducir {
	public static void introducir() {
		
		private void start() {		
			int opcion = 0;
			do {mostrarMenu();
				opcion = utiles.LecturaTeclado.lecturaEntero("* Pulsar 0 para salir. ");
				ejecutarOpcion(opcion);
			} while (opcion != 0);	
		}
		
		private void ejecutarOpcion(int opcion) {
			switch(opcion) {
			case 1: 
				System.out.println("Introduzca los siguientes Datos:");
			    Integer a = utiles.LecturaTeclado.lecturaEntero("- Número de bastidor: ");
			    String b = utiles.LecturaTeclado.lecturaString("- Marca: ");
			    String c = utiles.LecturaTeclado.lecturaString("- Modelo: ");
			    Integer d = utiles.LecturaTeclado.lecturaEntero("- Números de Puertas: ");
			    Integer e = utiles.LecturaTeclado.lecturaEntero("- Volumen del maletero");
			}    
			    
		}
		private void mostrarMenu() {
			System.out.println("\nMENU VEHÍCULOS");
			System.out.println("******************************");
			System.out.println("*Opción 1. Introducir un Coche*");
			System.out.println("*Opción 2. Introducir un Camión *");
			System.out.println("*Opción 3. Introducir un Dron    *");
			System.out.println("*Opción 4. Introducir un Avión  *");
			System.out.println("******************************");

		}
		
		private 
	
}
