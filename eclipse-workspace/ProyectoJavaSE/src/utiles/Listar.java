package utiles;

import java.util.ArrayList;
import java.util.List;

import aire.Avion;
import aire.Dron;
import start.Vehiculo;
import tierra.Camion;
import tierra.Coche;

public class Listar {
	public static void listar() {
	}

	public void iniciarLista() {
	List<Vehiculo> lstVehiculos = new ArrayList<>();
	
		lstVehiculos.add( new Dron() );
		lstVehiculos.add( new Avion() );
		lstVehiculos.add( new Coche() );
		lstVehiculos.add( new Camion() );
	}}