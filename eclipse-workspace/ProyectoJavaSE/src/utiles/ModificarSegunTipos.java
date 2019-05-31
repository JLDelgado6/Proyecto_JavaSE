package utiles;

import aire.Avion;
import aire.Dron;
import start.Vehiculo;
import tierra.Camion;
import tierra.Coche;
import tipos.TpCAR;
import tipos.TpCOM;

public class ModificarSegunTipos {

	public static void modificarCoche(int opcion) {
		
		Vehiculo vehiculoElegido = utiles.GestList.lstVehiculos.get(opcion);
		mostrarCoche(opcion);
		 
				
				int opcion2 = 0;
				int opcion3 = 0;
				int opcion4 = 0;
				do {opcion2 = utiles.LecturaTeclado.lecturaEntero("Indica el número de la característica que quieres modificar \n 0 para salir" 
				+ "");
				switch(opcion2) {
				case 0: start.App.main(null);
				
				case 1: String valorNuevo = utiles.LecturaTeclado.lecturaString("Dame el nuevo valor (Tipo String)");
					vehiculoElegido.setNumBastidor(valorNuevo); break;
					
				case 2: 
					do {opcion3 = utiles.LecturaTeclado.lecturaEntero("Para modificar el tipo de combustible selecciona una de las siguientes opciones: \n 1 para GASOLINA \n 2 para DIESEL \n 3 para ELECTRICO \n 4 para Salir" 
					+ "");
					switch(opcion3) {
					case 1: ((Coche) vehiculoElegido).setTipoCombustible(TpCOM.GASOLINA); utiles.Modificar.modificar();break;
					case 2:((Coche) vehiculoElegido).setTipoCombustible(TpCOM.DIESEL);utiles.Modificar.modificar();break;
					case 3:((Coche) vehiculoElegido).setTipoCombustible(TpCOM.ELECTRICO);utiles.Modificar.modificar();break;
					case 4:utiles.Modificar.modificar();break;
					}} while(opcion3>0 ||opcion3<3);break;
										
				case 3: String valorNuevo1 = utiles.LecturaTeclado.lecturaString("Dame el nuevo valor (Tipo String)");
				((Coche) vehiculoElegido).setMarca(valorNuevo1); break;
				
				case 4: String valorNuevo11 = utiles.LecturaTeclado.lecturaString("Dame el nuevo valor (Tipo String)");
				((Coche) vehiculoElegido).setModelo(valorNuevo11);break;
							
				case 5: Integer valorNuevo1111 = utiles.LecturaTeclado.lecturaEntero("Dame el nuevo valor (Tipo Integer)");
				((Coche) vehiculoElegido).setNumPuertas(valorNuevo1111);break;
				
				case 6: Integer valorNuevo11111 = utiles.LecturaTeclado.lecturaEntero("Dame el nuevo valor (Tipo Integer)");
				((Coche) vehiculoElegido).setVolumenMaletero(valorNuevo11111);break;
				
				case 7: 
					do {opcion4 = utiles.LecturaTeclado.lecturaEntero("Para modificar el tipo de carnet selecciona una de las siguientes opciones: \n 1 para B1 \n 2 para B2 \n 3 para C1 \n 4 para D \n 5 para Salir" 
					+ "");
					switch(opcion4) {
					case 1: ((Coche) vehiculoElegido).setTipoCarnet(TpCAR.B1);utiles.Modificar.modificar(); break;
					case 2: ((Coche) vehiculoElegido).setTipoCarnet(TpCAR.B2);utiles.Modificar.modificar(); break;
					case 3: ((Coche) vehiculoElegido).setTipoCarnet(TpCAR.C1);utiles.Modificar.modificar(); break;
					case 4: ((Coche) vehiculoElegido).setTipoCarnet(TpCAR.D);utiles.Modificar.modificar(); break;
					case 5: utiles.Modificar.modificar(); break;
					}} while(opcion4>0 ||opcion4<4);
				} 
				
			}while(opcion2>0 ||opcion2<5);}
			
		
		
		
	
	
	
	
	
public static void modificarDron(int opcion) {

	
	Vehiculo vehiculoElegido = utiles.GestList.lstVehiculos.get(opcion);
	mostrarDron(opcion);
	 
			
			int opcion2 = 0;
			int opcion3 = 0;
			int opcion4 = 0;
			do {opcion2 = utiles.LecturaTeclado.lecturaEntero("Indica el número de la característica que quieres modificar \n 0 para salir" 
			+ "");
			switch(opcion2) {
			case 0: start.App.main(null);
			
			case 1: String valorNuevo = utiles.LecturaTeclado.lecturaString("Dame el nuevo valor (Tipo String)");
				vehiculoElegido.setNumBastidor(valorNuevo); break;
				
			case 2: 
				do {opcion3 = utiles.LecturaTeclado.lecturaEntero("Para modificar el tipo de combustible selecciona una de las siguientes opciones: \n 1 para GASOLINA \n 2 para DIESEL \n 3 para ELECTRICO \n 4 para Salir" 
				+ "");
				switch(opcion3) {
				case 1: ((Coche) vehiculoElegido).setTipoCombustible(TpCOM.GASOLINA); utiles.Modificar.modificar();break;
				case 2:((Coche) vehiculoElegido).setTipoCombustible(TpCOM.DIESEL);utiles.Modificar.modificar();break;
				case 3:((Coche) vehiculoElegido).setTipoCombustible(TpCOM.ELECTRICO);utiles.Modificar.modificar();break;
				case 4:utiles.Modificar.modificar();break;
				}} while(opcion3>0 ||opcion3<3);break;
									
			case 3: String valorNuevo1 = utiles.LecturaTeclado.lecturaString("Dame el nuevo valor (Tipo String)");
			((Coche) vehiculoElegido).setMarca(valorNuevo1); break;
			
			case 4: String valorNuevo11 = utiles.LecturaTeclado.lecturaString("Dame el nuevo valor (Tipo String)");
			((Coche) vehiculoElegido).setModelo(valorNuevo11);break;
						
			case 5: Integer valorNuevo1111 = utiles.LecturaTeclado.lecturaEntero("Dame el nuevo valor (Tipo Integer)");
			((Coche) vehiculoElegido).setNumPuertas(valorNuevo1111);break;
			
			case 6: Integer valorNuevo11111 = utiles.LecturaTeclado.lecturaEntero("Dame el nuevo valor (Tipo Integer)");
			((Coche) vehiculoElegido).setVolumenMaletero(valorNuevo11111);break;
			
			case 7: 
				do {opcion4 = utiles.LecturaTeclado.lecturaEntero("Para modificar el tipo de carnet selecciona una de las siguientes opciones: \n 1 para B1 \n 2 para B2 \n 3 para C1 \n 4 para D \n 5 para Salir" 
				+ "");
				switch(opcion4) {
				case 1: ((Coche) vehiculoElegido).setTipoCarnet(TpCAR.B1);utiles.Modificar.modificar(); break;
				case 2: ((Coche) vehiculoElegido).setTipoCarnet(TpCAR.B2);utiles.Modificar.modificar(); break;
				case 3: ((Coche) vehiculoElegido).setTipoCarnet(TpCAR.C1);utiles.Modificar.modificar(); break;
				case 4: ((Coche) vehiculoElegido).setTipoCarnet(TpCAR.D);utiles.Modificar.modificar(); break;
				case 5: utiles.Modificar.modificar(); break;
				}} while(opcion4>0 ||opcion4<4);
			} 
			
		}while(opcion2>0 ||opcion2<5);}
		
	}






public static void modificarCamion() {
	
}





public static void modificarAvion() {
	
}
public static void mostrarCoche(int opcion) {
	Vehiculo vehiculoElegido = utiles.GestList.lstVehiculos.get(opcion);
	 
	System.out.println("El elemento " + opcion + " es un coche y sus atributos son los siguientes \n " 
						+" 1 "+ vehiculoElegido.getNumBastidor()+ "\n " 
						+" 2 "+ ((Coche) vehiculoElegido).getTipoCombustible() + "\n "
						+" 3 "+ ((Coche) vehiculoElegido).getMarca() + "\n " 
						+" 4 "+ ((Coche) vehiculoElegido).getModelo() + "\n " 
						+" 5 "+ ((Coche) vehiculoElegido).getNumPuertas() + "\n "
						+" 6 "+ ((Coche) vehiculoElegido).getVolumenMaletero() + "\n " 
						+" 7 "+ ((Coche) vehiculoElegido).getCarnet() + "\n " );
	
	
}
public static void mostrarDron(int opcion) {
	Vehiculo vehiculoElegido = utiles.GestList.lstVehiculos.get(opcion);
	 
	System.out.println("El elemento " + opcion + " es un coche y sus atributos son los siguientes \n " 
						+" 1 "+ vehiculoElegido.getNumBastidor()+ "\n " 
						+" 2 "+ ((Coche) vehiculoElegido).getTipoCombustible() + "\n "
						+" 3 "+ ((Coche) vehiculoElegido).getMarca() + "\n " 
						+" 4 "+ ((Coche) vehiculoElegido).getModelo() + "\n " 
						+" 5 "+ ((Coche) vehiculoElegido).getNumPuertas() + "\n "
						+" 6 "+ ((Coche) vehiculoElegido).getVolumenMaletero() + "\n " 
						+" 7 "+ ((Coche) vehiculoElegido).getCarnet() + "\n " );
	
	
}

}
