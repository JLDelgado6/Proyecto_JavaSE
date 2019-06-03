package utiles;

import java.util.ArrayList;
import java.util.List;
import start.Vehiculo;


/**Clase GestList. Engloba el conjunto de funciones que se usan para crear, borrar, modificar y mostrar la lista
 * La función introducir(Vehiculo v) añade un vehículo a la lista
 * La función getContenido() ordena los elementos de la lista según los criterios especificados en la clase Ordenacion y los muestra
 * La funcion modificar() llama a la función homónima creada en la clase Modificar
 * La función totalElementos() toma el tamaño de la lista de vehículos para su uso en el resto de funciones
 * @author José Luis
 * @version 03/06/2019
 * */
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
		/*utiles.Modificar.modificar();*/
		return null;
	}
	
	public static Integer totalElementos() {
		return lstVehiculos.size();
	}
}
