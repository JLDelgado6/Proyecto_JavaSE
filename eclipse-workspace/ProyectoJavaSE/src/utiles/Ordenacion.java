package utiles;

import java.util.Collections;
import java.util.Comparator;

import aire.Avion;
import aire.Dron;
import start.Vehiculo;
import tierra.Camion;
import tierra.Coche;
import utiles.TipoVeh;

/**Clase Ordenacion. Toma la lista generada por la introducci�n de veh�culos y los ordena seg�n 2 criterios:
 * En primer lugar, ordena por el tipo de veh�culo, en el siguiente orden: Coche, Cami�n, Dron y Avi�n.
 * En segundo lugar, ordena siguiendo el orden alfanum�rico del n�mero de bastidor entre los veh�culos del mismo tipo
 * @author Jos� Luis
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