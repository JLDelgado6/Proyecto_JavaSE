package utiles;

import java.util.ArrayList;
import java.util.List;

import start.Vehiculo;

public class GestList {
	
	static List<Vehiculo> lstVehiculos = new ArrayList<>();
	
	
	public static void Introducir(Vehiculo v) {
		lstVehiculos.add(v);
	}
	
	public static void Borrar(Integer vb) {
		lstVehiculos.remove(vb);
	}
	
	public static List<Vehiculo> getContenido(){
		return lstVehiculos;
	}
	
	public static Integer totalElementos() {
		return lstVehiculos.size();
	}
}
