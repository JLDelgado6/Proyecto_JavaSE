package start;

public class App {

	public static void main(String[] args) {
		App app = new App();
		app.start();
	}
	
	private void start() {		
		int opcion = 0;
		do {
			mostrarMenu();
			opcion = utiles.Utiles.lecturaEntero("Opci�n (0-Salir): ");
			ejecutarOpcion(opcion);
		} while (opcion != 0);
		
	}
	private void ejecutarOpcion(int opcion) {
		switch(opcion) {
		case 1: ; break;
		case 2: ; break;
		case 3: ; break;
		case 4: ; break;
		}
	}
	private void mostrarMenu() {
		System.out.println("\nMENU PRINCIPAL");
		System.out.println("******************************");
		System.out.println("*Opci�n 1. Introducir un dato*");
		System.out.println("*Opci�n 2. Modificar un dato *");
		System.out.println("*Opci�n 3. Borrar un dato    *");
		System.out.println("*Opci�n 4. Listar los datos  *");
		System.out.println("******************************");

	}

}
