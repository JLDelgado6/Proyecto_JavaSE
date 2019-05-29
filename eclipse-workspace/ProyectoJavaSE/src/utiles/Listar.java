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
		List<Vehiculo> lstVehiculos = new ArrayList<>();
		switch(opcion){
		
		case 1:
			System.out.println("Para introducir un coche, los datos son estos: (Número bastidor, potencia, carnet");
			
		lstVehiculos.add( new Coche(lecturaTeclado()) );
		; 
		lstVehiculos.add( new Dron() );
		lstVehiculos.add( new Avion() );
		lstVehiculos.add( new Coche() );
		lstVehiculos.add( new Camion() );
		 lstVehiculos.read(1);
		lstVehiculos.forEach(v ->System.out.println(v));
	}

	public void iniciarLista() {
	
	}}