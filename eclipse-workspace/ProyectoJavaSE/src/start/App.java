package start;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		App app = new App();
		app.start();
	}

	private void start() {		
		int opcion = 0;
		do {mostrarMenu();
			opcion = utiles.LecturaTeclado.lecturaEntero("* Pulsar 0 para salir. ");
			ejecutarOpcion(opcion);
		} while (opcion != 0);
		
	}
	private void ejecutarOpcion(int opcion) {
		switch(opcion) {
		case 1:utiles.Introducir.introducir() ; break;
		case 2:utiles.Modificar.modificar() ; break;
		case 3:utiles.Borrar.borrar() ; break;
		case 4:utiles.Listar.listar() ; break;
		case 0:System.out.println("Saliendo.\nSaliendo..\nSaliendo..."); ;break;
		default:System.out.println("Por favor, elija una opción entre 0-4");break;
		}
	}
	private void mostrarMenu() {
		System.out.println("\nMENU PRINCIPAL");
		System.out.println("******************************");
		System.out.println("*Opción 1. Introducir un dato*");
		System.out.println("*Opción 2. Modificar un dato *");
		System.out.println("*Opción 3. Borrar un dato    *");
		System.out.println("*Opción 4. Listar los datos  *");
		System.out.println("******************************");

	}
	

}
