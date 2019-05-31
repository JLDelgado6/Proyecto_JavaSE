package utiles;

import java.util.ArrayList;
import java.util.List;

import aire.Avion;
import aire.Dron;
import start.Vehiculo;
import tierra.Camion;
import tierra.Coche;
import tipos.TpCAM;
import tipos.TpCAR;
import tipos.TpCOM;

public class GestList {
	
	static List<Vehiculo> lstVehiculos = new ArrayList<>();
	public static void inicializarLista() {
	lstVehiculos.add( new Coche( "ER345678901234567","RENAULT","MEGANE",TpCOM.GASOLINA,5,2, TpCAR.B1));
	lstVehiculos.add( new Coche( "CD345678901234567","PEUGEOT","ZZ",TpCOM.GASOLINA,5,2, TpCAR.B1));
	lstVehiculos.add( new Avion( "AS345678901234567", 128, 9000,50,82) );
	lstVehiculos.add( new Coche( "NV345678901234567","FORD","FOCUS",TpCOM.GASOLINA,5,2, TpCAR.B1));
	lstVehiculos.add( new Camion("RT345678901234567", "IVECO", "DAILY",TpCOM.DIESEL,5400,6,TpCAR.C1));
	lstVehiculos.add( new Dron(  "KL345678901234567", 15, 250,TpCAM._4K,5400,TpCAR.C1) );
	lstVehiculos.add( new Avion( "EW345678901234567", 124, 50000,540,8) );
	lstVehiculos.add( new Coche( "TY345678901234567","FORD","FIESTA",TpCOM.GASOLINA,5,2, TpCAR.B1));
	lstVehiculos.add( new Dron(  "ZMLK5678901234567", 25, 450,TpCAM._4K,255881,TpCAR.B2) );
	}
	
	public static void introducir(Vehiculo v) {
		lstVehiculos.add(v);
	}
	
	public static void borrar() {
		
	}
	
	public static void getContenido(){
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
