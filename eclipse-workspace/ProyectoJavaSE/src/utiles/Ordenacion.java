package utiles;

import java.util.Collections;
import java.util.Comparator;

import start.Vehiculo;

public class Ordenacion implements Comparator<T> {

	@Override
	public int compare(Vehiculo v1, Vehiculo v2) {
		int res;
		res = v1.getTipoVeh().compareTo(v2.getTipoVeh());
		if(res==0) {
			res = v1.getNumBastidor().compareTo(v2.getNumBastidor());
		}
		return res;
	}
	
}
