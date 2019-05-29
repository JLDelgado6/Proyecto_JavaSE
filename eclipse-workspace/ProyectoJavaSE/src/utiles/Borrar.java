package utiles;

public class Borrar {

	public static void borrar() {

		/*
		 * int opcion = 0; String salida;
		 */

		// lanzar lista
		utiles.Listar.listar();
		Integer vb;
		do {
			vb = utiles.LecturaTeclado.lecturaEntero("* Pulsar elemento que desea borrar. ");
			start.App.lstVehiculos.remove(vb);
		} while (vb < start.App.lstVehiculos.size() - 1);
	}

}
