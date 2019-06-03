package utiles;

import java.util.ArrayList;
import java.util.List;
import start.Vehiculo;

public class GestList {
	
	static List<Vehiculo> lstVehiculos = new ArrayList<>();
		
	public static void introducir(Vehiculo v) {
		lstVehiculos.add(v);
	}
	
	public static void borrar() {
		
	}
	
	public static void getContenido(){
		utiles.Ordenacion.ordenacion();
		utiles.Listar.listar();
	}
	
	public static List<Vehiculo> modificar() {
		utiles.Modificar.modificar();
		return null;
	}
	
	public static Integer totalElementos() {
		return lstVehiculos.size();
	}
}
