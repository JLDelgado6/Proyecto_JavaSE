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
							vehiculoElegido.setNumBastidor(valorNuevo);
							mostrarCoche(opcion); 
							break;
							
						case 2: 
							do {opcion3 = utiles.LecturaTeclado.lecturaEntero("Para modificar el tipo de combustible selecciona una de las siguientes opciones: \n 1 para GASOLINA \n 2 para DIESEL \n 3 para ELECTRICO \n 4 para Salir" 
							+ "");
							switch(opcion3) {
							case 1: ((Coche) vehiculoElegido).setTipoCombustible(TpCOM.GASOLINA); utiles.ModificarSegunTipos.modificarCoche(opcion);break;
							case 2:((Coche) vehiculoElegido).setTipoCombustible(TpCOM.DIESEL);utiles.ModificarSegunTipos.modificarCoche(opcion);break;
							case 3:((Coche) vehiculoElegido).setTipoCombustible(TpCOM.ELECTRICO);utiles.ModificarSegunTipos.modificarCoche(opcion);break;
							case 4:utiles.Modificar.modificar();break;
							}} while(opcion3>0 ||opcion3<3);mostrarCoche(opcion);break;
												
						case 3: String valorNuevo1 = utiles.LecturaTeclado.lecturaString("Dame el nuevo valor (Tipo String)");
						((Coche) vehiculoElegido).setMarca(valorNuevo1);mostrarCoche(opcion); break;
						
						case 4: String valorNuevo11 = utiles.LecturaTeclado.lecturaString("Dame el nuevo valor (Tipo String)");
						((Coche) vehiculoElegido).setModelo(valorNuevo11);mostrarCoche(opcion);break;
									
						case 5: Integer valorNuevo1111 = utiles.LecturaTeclado.lecturaEntero("Dame el nuevo valor (Tipo Integer)");
						((Coche) vehiculoElegido).setNumPuertas(valorNuevo1111);mostrarCoche(opcion);break;
						
						case 6: Integer valorNuevo11111 = utiles.LecturaTeclado.lecturaEntero("Dame el nuevo valor (Tipo Integer)");
						((Coche) vehiculoElegido).setVolumenMaletero(valorNuevo11111);mostrarCoche(opcion);break;
						
						case 7: 
							do {opcion4 = utiles.LecturaTeclado.lecturaEntero("Para modificar el tipo de carnet selecciona una de las siguientes opciones: \n 1 para B1 \n 2 para B2 \n 3 para C1 \n 4 para D \n 5 para Salir" 
							+ "");
							switch(opcion4) {
							case 1: ((Coche) vehiculoElegido).setTipoCarnet(TpCAR.B1);utiles.ModificarSegunTipos.modificarCoche(opcion);; break;
							case 2: ((Coche) vehiculoElegido).setTipoCarnet(TpCAR.B2);utiles.ModificarSegunTipos.modificarCoche(opcion);; break;
							case 3: ((Coche) vehiculoElegido).setTipoCarnet(TpCAR.C1);utiles.ModificarSegunTipos.modificarCoche(opcion);; break;
							case 4: ((Coche) vehiculoElegido).setTipoCarnet(TpCAR.D);utiles.ModificarSegunTipos.modificarCoche(opcion);; break;
							case 5: utiles.Modificar.modificar(); break;
							}} while(opcion4>0 ||opcion4<4);
							mostrarCoche(opcion); break;
						}
			}while(opcion2>0 ||opcion2<5);
	}
			
		
	
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
		
	






public static void modificarCamion(int opcion) {

	
	Vehiculo vehiculoElegido = utiles.GestList.lstVehiculos.get(opcion);
	mostrarCamion(opcion);
	 
			
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
				case 1: ((Camion) vehiculoElegido).setTipoCombustible(TpCOM.GASOLINA); utiles.Modificar.modificar();break;
				case 2:((Camion) vehiculoElegido).setTipoCombustible(TpCOM.DIESEL);utiles.Modificar.modificar();break;
				case 3:((Camion) vehiculoElegido).setTipoCombustible(TpCOM.ELECTRICO);utiles.Modificar.modificar();break;
				case 4:utiles.Modificar.modificar();break;
				}} while(opcion3>0 ||opcion3<3);break;
									
			case 3: String valorNuevo1 = utiles.LecturaTeclado.lecturaString("Dame el nuevo valor (Tipo String)");
			((Camion) vehiculoElegido).setMarca(valorNuevo1); break;
			
			case 4: String valorNuevo11 = utiles.LecturaTeclado.lecturaString("Dame el nuevo valor (Tipo String)");
			((Camion) vehiculoElegido).setModelo(valorNuevo11);break;
						
			case 5: Integer valorNuevo1111 = utiles.LecturaTeclado.lecturaEntero("Dame el nuevo valor (Tipo Integer)");
			((Camion) vehiculoElegido).setTara(valorNuevo1111);break;
			
			case 6: Integer valorNuevo11111 = utiles.LecturaTeclado.lecturaEntero("Dame el nuevo valor (Tipo Integer)");
			((Camion) vehiculoElegido).setNumEjes(valorNuevo11111);break;
			
			case 7: 
				do {opcion4 = utiles.LecturaTeclado.lecturaEntero("Para modificar el tipo de carnet selecciona una de las siguientes opciones: \n 1 para B1 \n 2 para B2 \n 3 para C1 \n 4 para D \n 5 para Salir" 
				+ "");
				switch(opcion4) {
				case 1: ((Camion) vehiculoElegido).setTipoCarnet(TpCAR.B1);utiles.Modificar.modificar(); break;
				case 2: ((Camion) vehiculoElegido).setTipoCarnet(TpCAR.B2);utiles.Modificar.modificar(); break;
				case 3: ((Camion) vehiculoElegido).setTipoCarnet(TpCAR.C1);utiles.Modificar.modificar(); break;
				case 4: ((Camion) vehiculoElegido).setTipoCarnet(TpCAR.D);utiles.Modificar.modificar(); break;
				case 5: utiles.Modificar.modificar(); break;
				}} while(opcion4>0 ||opcion4<4);
			} 
			
		}while(opcion2>0 ||opcion2<5);}





public static void modificarAvion(int opcion) {

	Vehiculo vehiculoElegido = utiles.GestList.lstVehiculos.get(opcion);
	mostrarCamion(opcion);
	 
			
			int opcion2 = 0;
			int opcion3 = 0;
			int opcion4 = 0;
			do {opcion2 = utiles.LecturaTeclado.lecturaEntero("Indica el número de la característica que quieres modificar \n 0 para salir" 
			+ "");
			switch(opcion2) {
			case 0: start.App.main(null);
			
			case 1: String valorNuevo = utiles.LecturaTeclado.lecturaString("Dame el nuevo valor (Tipo String)");
				vehiculoElegido.setNumBastidor(valorNuevo);mostrarCamion(opcion); break;
				
			case 2: 
				do {opcion3 = utiles.LecturaTeclado.lecturaEntero("Para modificar el tipo de combustible selecciona una de las siguientes opciones: \n 1 para GASOLINA \n 2 para DIESEL \n 3 para ELECTRICO \n 4 para Salir" 
				+ "");
				switch(opcion3) {
				case 1: ((Coche) vehiculoElegido).setTipoCombustible(TpCOM.GASOLINA); utiles.Modificar.modificar();break;
				case 2:((Coche) vehiculoElegido).setTipoCombustible(TpCOM.DIESEL);utiles.Modificar.modificar();break;
				case 3:((Coche) vehiculoElegido).setTipoCombustible(TpCOM.ELECTRICO);utiles.Modificar.modificar();break;
				case 4:utiles.Modificar.modificar();break;
				}} while(opcion3>0 ||opcion3<3);mostrarCamion(opcion);break;
									
			case 3: String valorNuevo1 = utiles.LecturaTeclado.lecturaString("Dame el nuevo valor (Tipo String)");
			((Coche) vehiculoElegido).setMarca(valorNuevo1);mostrarCamion(opcion); break;
			
			case 4: String valorNuevo11 = utiles.LecturaTeclado.lecturaString("Dame el nuevo valor (Tipo String)");
			((Coche) vehiculoElegido).setModelo(valorNuevo11);mostrarCamion(opcion);break;
						
			case 5: Integer valorNuevo1111 = utiles.LecturaTeclado.lecturaEntero("Dame el nuevo valor (Tipo Integer)");
			((Coche) vehiculoElegido).setNumPuertas(valorNuevo1111);mostrarCamion(opcion);break;
			
			case 6: Integer valorNuevo11111 = utiles.LecturaTeclado.lecturaEntero("Dame el nuevo valor (Tipo Integer)");
			((Coche) vehiculoElegido).setVolumenMaletero(valorNuevo11111);mostrarCamion(opcion);break;
			
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
			} mostrarCamion(opcion); break;
			
		}while(opcion2>0 ||opcion2<5);}



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
						+" 2 "+ ((Dron) vehiculoElegido).getAlturaMaxima() + "\n "
						+" 3 "+ ((Dron) vehiculoElegido).getKmAutonomia() + "\n " 
						+" 4 "+ ((Dron) vehiculoElegido).getTipoCamara() + "\n " 
						+" 5 "+ ((Dron) vehiculoElegido).getPotencia() + "\n "
						+" 6 "+ ((Dron) vehiculoElegido).getCarnet() + "\n " );
	
	
}
public static void mostrarCamion(int opcion) {
	Vehiculo vehiculoElegido = utiles.GestList.lstVehiculos.get(opcion);
	 
	System.out.println("El elemento " + opcion + " es un coche y sus atributos son los siguientes \n " 
						+" 1 "+ vehiculoElegido.getNumBastidor()+ "\n " 
						+" 2 "+ ((Camion) vehiculoElegido).getTipoCombustible() + "\n "
						+" 3 "+ ((Camion) vehiculoElegido).getMarca() + "\n " 
						+" 4 "+ ((Camion) vehiculoElegido).getModelo() + "\n " 
						+" 5 "+ ((Camion) vehiculoElegido).getTara() + "\n "
						+" 6 "+ ((Camion) vehiculoElegido).getNumEjes() + "\n " 
						+" 7 "+ ((Camion) vehiculoElegido).getCarnet() + "\n " );
	
	
}
public static void mostrarAvion(int opcion) {
	Vehiculo vehiculoElegido = utiles.GestList.lstVehiculos.get(opcion);
	 
	System.out.println("El elemento " + opcion + " es un coche y sus atributos son los siguientes \n " 
						+" 1 "+ vehiculoElegido.getNumBastidor()+ "\n " 
						+" 2 "+ ((Avion) vehiculoElegido).getAlturaMaxima() + "\n "
						+" 3 "+ ((Avion) vehiculoElegido).getKmAutonomia() + "\n " 
						+" 4 "+ ((Avion) vehiculoElegido).getMaxPasajeros() + "\n " 
						+" 5 "+ ((Avion) vehiculoElegido).getNumTurbinas() + "\n ");
	
	
}

}
