package utiles;

import java.util.Collections;
import java.util.Comparator;

import aire.Avion;
import aire.Dron;
import start.Vehiculo;
import tierra.Camion;
import tierra.Coche;
import utiles.TipoVeh;

/**Clase Ordenacion. Toma la lista generada por la introducción de vehículos y los ordena según 2 criterios:
 * En primer lugar, ordena por el tipo de vehículo, en el siguiente orden: Coche, Camión, Dron y Avión.
 * En segundo lugar, ordena siguiendo el orden alfanumérico del número de bastidor entre los vehículos del mismo tipo
 * @author José Luis
 * @version 03/06/2019
 * */
@SuppressWarnings("unused")
public class Ordenacion {
public static void ordenacion() {
	
    Collections.sort(utiles.GestList.lstVehiculos, new Comparator<Vehiculo>(){
        public int compare(Vehiculo v1, Vehiculo v2) {
        	int res;
        	for (Vehiculo v : utiles.GestList.lstVehiculos) {
        		if(v instanceof Coche) {
        			v.setTipoVeh(1);
        		}
        		if(v instanceof Camion) {
        			v.setTipoVeh(2);
        		}
        		if(v instanceof Dron) {
        			v.setTipoVeh(3);
        		}
        		if(v instanceof Avion) {
        			v.setTipoVeh(4);
        		}
        	}
        	res = v1.getTipoVeh().compareTo(v2.getTipoVeh());
        	if (res==0) {
        		res = v1.getNumBastidor().compareToIgnoreCase(v2.getNumBastidor());
        	}
        	return res;
        }
    });     
}




}