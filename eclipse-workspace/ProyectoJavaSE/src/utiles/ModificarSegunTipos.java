package utiles;

import aire.Avion;
import aire.Dron;
import start.Vehiculo;
import tierra.Camion;
import tierra.Coche;
import tipos.TpCAM;
import tipos.TpCAR;
import tipos.TpCOM;

public class ModificarSegunTipos extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static void modificarCoche(int opcion)  {
		
		Vehiculo vehiculoElegido = utiles.GestList.lstVehiculos.get(opcion);
		mostrarCoche(opcion);
		 
				
				int opcion2 = 0;
				int opcion3 = 0;
				int opcion4 = 0;
				
				do {opcion2 = utiles.LecturaTeclado.lecturaEntero("Indica el número de la característica que quieres modificar \n 0 para salir" 
				+ "");
				
					switch(opcion2) {
						case 0: start.App.main(null);
						
						case 1: String valorNuevo = utiles.LecturaTeclado.lecturaString("Dame el nuevo valor del numero de bastidor (Tipo String)");
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
							case 4:utiles.ModificarSegunTipos.modificarCoche(opcion);break;
							}} while(opcion3>0 ||opcion3<=4);mostrarCoche(opcion);break;
												
						case 3: String valorNuevo1 = utiles.LecturaTeclado.lecturaString("Dame la nueva marca del coche (Tipo String)");
						((Coche) vehiculoElegido).setMarca(valorNuevo1);
						
						;mostrarCoche(opcion); break;
						
						case 4: String valorNuevo11 = utiles.LecturaTeclado.lecturaString("Dame el nuevo modelo del coche (Tipo String)");
						((Coche) vehiculoElegido).setModelo(valorNuevo11);mostrarCoche(opcion);break;
									
						case 5: try {
							Integer valorNuevo1111 = utiles.LecturaTeclado.lecturaEntero("Dame el nuevo numero de puertas (Tipo Integer)");
						((Coche) vehiculoElegido).setNumPuertas(valorNuevo1111);mostrarCoche(opcion);break;}
						catch(Exception e) {}
						finally {System.out.println("No es un tipo de dato permitido");};break;
						
						case 6:try { 
							Integer valorNuevo11111 = utiles.LecturaTeclado.lecturaEntero("Dame el nuevo volumen del maletero (Tipo Integer)");
						((Coche) vehiculoElegido).setVolumenMaletero(valorNuevo11111);mostrarCoche(opcion);break;}
						catch(Exception e) {}
						finally {System.out.println("No es un tipo de dato permitido");};break;
						
						case 7: 
							do {opcion4 = utiles.LecturaTeclado.lecturaEntero("Para modificar el tipo de carnet selecciona una de las siguientes opciones: \n 1 para B1 \n 2 para B2 \n 3 para C1 \n 4 para D \n 5 para Salir" 
							+ "");
							switch(opcion4) {
							case 1: ((Coche) vehiculoElegido).setTipoCarnet(TpCAR.B1);utiles.ModificarSegunTipos.modificarCoche(opcion); break;
							case 2: ((Coche) vehiculoElegido).setTipoCarnet(TpCAR.B2);utiles.ModificarSegunTipos.modificarCoche(opcion); break;
							case 3: ((Coche) vehiculoElegido).setTipoCarnet(TpCAR.C1);utiles.ModificarSegunTipos.modificarCoche(opcion); break;
							case 4: ((Coche) vehiculoElegido).setTipoCarnet(TpCAR.D);utiles.ModificarSegunTipos.modificarCoche(opcion); break;
							case 5:utiles.ModificarSegunTipos.modificarCoche(opcion);break;
							}} while(opcion4>0 ||opcion4<=5);
							mostrarCoche(opcion); break;
						}
			}while(opcion2>=0 ||opcion2<=7);}

	
			
		
	
public static void modificarDron(int opcion) {

	
	Vehiculo vehiculoElegido = utiles.GestList.lstVehiculos.get(opcion);
	mostrarDron(opcion);
	 
			
			int opcion2 = 0;
			int opcion3= 0;
			int opcion4 = 0;
			
			do {opcion2 = utiles.LecturaTeclado.lecturaEntero("Indica el número de la característica que quieres modificar \n 0 para salir" 
			+ "");
			
				switch(opcion2) {
					case 0: start.App.main(null);
					
					case 1: String valorNuevo = utiles.LecturaTeclado.lecturaString("Dame el nuevo valor del numero de bastidor (Tipo String)");
						vehiculoElegido.setNumBastidor(valorNuevo);
						mostrarDron(opcion); 
						break;
											
					case 2: try{
						Integer valorNuevo1 = utiles.LecturaTeclado.lecturaEntero("Dame el nuevo valor para la altura máxima (Tipo Integer)");
					((Dron) vehiculoElegido).setAlturaMaxima(valorNuevo1)
					;mostrarDron(opcion); break;}
				catch(Exception e) {}
				finally {System.out.println("No es un tipo de dato permitido");};break;
					
					case 3: try { 
						Integer valorNuevo11 = utiles.LecturaTeclado.lecturaEntero("Dame el nuevo valor para la autonomia (Tipo Integer)");
					((Dron) vehiculoElegido).setKmAutonomia(valorNuevo11)
					;mostrarDron(opcion); break;}
				catch(Exception e) {}
				finally {System.out.println("No es un tipo de dato permitido");};break;
					
					case 4: do {opcion3 = utiles.LecturaTeclado.lecturaEntero("Para modificar el tipo de camara selecciona una de las siguientes opciones: \n 1 para NINGUNA \n 2 para HD \n 3 para 4K \n 4 para Salir" 
							+ "");
							switch(opcion3) {
							case 1: ((Dron) vehiculoElegido).setTipoCamara(TpCAM.NINGUNA); utiles.ModificarSegunTipos.modificarDron(opcion);break;
							case 2:((Dron) vehiculoElegido).setTipoCamara(TpCAM.HD);utiles.ModificarSegunTipos.modificarDron(opcion);break;
							case 3:((Dron) vehiculoElegido).setTipoCamara(TpCAM._4K);utiles.ModificarSegunTipos.modificarDron(opcion);break;
							case 4:utiles.ModificarSegunTipos.modificarDron(opcion);break;
							}} while(opcion3>0 ||opcion3<=4);mostrarDron(opcion);break;
								
					case 5: try {
						Integer valorNuevo1111 = utiles.LecturaTeclado.lecturaEntero("Dame el nuevo valor de la potencia (Tipo Integer)");
					((Dron) vehiculoElegido).setPotencia(valorNuevo1111);mostrarDron(opcion);break;}
					catch(Exception e) {}
					finally {System.out.println("No es un tipo de dato permitido");};break;
					
					
					case 6: 
						do {opcion4 = utiles.LecturaTeclado.lecturaEntero("Para modificar el tipo de carnet selecciona una de las siguientes opciones: \n 1 para B1 \n 2 para B2 \n 3 para C1 \n 4 para D \n 5 para Salir" 
						+ "");
						switch(opcion4) {
						case 1: ((Dron) vehiculoElegido).setTipoCarnet(TpCAR.B1);utiles.ModificarSegunTipos.modificarDron(opcion); break;
						case 2: ((Dron) vehiculoElegido).setTipoCarnet(TpCAR.B2);utiles.ModificarSegunTipos.modificarDron(opcion); break;
						case 3: ((Dron) vehiculoElegido).setTipoCarnet(TpCAR.C1);utiles.ModificarSegunTipos.modificarDron(opcion); break;
						case 4: ((Dron) vehiculoElegido).setTipoCarnet(TpCAR.D);utiles.ModificarSegunTipos.modificarDron(opcion); break;
						case 5:utiles.ModificarSegunTipos.modificarDron(opcion);break;
						}} while(opcion4>0 ||opcion4<4);
						mostrarDron(opcion); break;
					}
		}while(opcion2>=0 ||opcion2<=6);}
		
	






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
					
					case 1: String valorNuevo = utiles.LecturaTeclado.lecturaString("Dame el nuevo valor del numero de bastidor (Tipo String)");
						vehiculoElegido.setNumBastidor(valorNuevo);
						mostrarCamion(opcion); 
						break;
						
					case 2: 
						do {opcion3 = utiles.LecturaTeclado.lecturaEntero("Para modificar el tipo de combustible selecciona una de las siguientes opciones: \n 1 para GASOLINA \n 2 para DIESEL \n 3 para ELECTRICO \n 4 para Salir" 
						+ "");
						switch(opcion3) {
						case 1: ((Camion) vehiculoElegido).setTipoCombustible(TpCOM.GASOLINA); utiles.ModificarSegunTipos.modificarCamion(opcion);break;
						case 2:((Camion) vehiculoElegido).setTipoCombustible(TpCOM.DIESEL);utiles.ModificarSegunTipos.modificarCamion(opcion);break;
						case 3:((Camion) vehiculoElegido).setTipoCombustible(TpCOM.ELECTRICO);utiles.ModificarSegunTipos.modificarCamion(opcion);break;
						case 4:utiles.ModificarSegunTipos.modificarCamion(opcion);break;
						}} while(opcion3>0 ||opcion3<=4);mostrarCamion(opcion);break;
											
					case 3: String valorNuevo1 = utiles.LecturaTeclado.lecturaString("Dame la nueva marca del camion (Tipo String)");
					((Camion) vehiculoElegido).setMarca(valorNuevo1);
					
					;mostrarCamion(opcion); break;
					
					case 4: String valorNuevo11 = utiles.LecturaTeclado.lecturaString("Dame el nuevo modelo del camion (Tipo String)");
					((Camion) vehiculoElegido).setModelo(valorNuevo11);mostrarCamion(opcion);break;
								
					case 5: try {
						Integer valorNuevo1111 = utiles.LecturaTeclado.lecturaEntero("Dame el nuevo valor de la tara (Tipo Integer)");
					((Camion) vehiculoElegido).setTara(valorNuevo1111);mostrarCamion(opcion);break;}
					catch(Exception e) {}
					finally {System.out.println("No es un tipo de dato permitido");};break;
					
					case 6:try { 
						Integer valorNuevo11111 = utiles.LecturaTeclado.lecturaEntero("Dame el nuevo valor del numero de ejes (Tipo Integer)");
					((Camion) vehiculoElegido).setNumEjes(valorNuevo11111);mostrarCamion(opcion);break;}
					catch(Exception e) {}
					finally {System.out.println("No es un tipo de dato permitido");};break;
					
					case 7: 
						do {opcion4 = utiles.LecturaTeclado.lecturaEntero("Para modificar el tipo de carnet selecciona una de las siguientes opciones: \n 1 para B1 \n 2 para B2 \n 3 para C1 \n 4 para D \n 5 para Salir" 
						+ "");
						switch(opcion4) {
						case 1: ((Camion) vehiculoElegido).setTipoCarnet(TpCAR.B1);utiles.ModificarSegunTipos.modificarCamion(opcion); break;
						case 2: ((Camion) vehiculoElegido).setTipoCarnet(TpCAR.B2);utiles.ModificarSegunTipos.modificarCamion(opcion); break;
						case 3: ((Camion) vehiculoElegido).setTipoCarnet(TpCAR.C1);utiles.ModificarSegunTipos.modificarCamion(opcion); break;
						case 4: ((Camion) vehiculoElegido).setTipoCarnet(TpCAR.D);utiles.ModificarSegunTipos.modificarCamion(opcion); break;
						case 5:utiles.ModificarSegunTipos.modificarCamion(opcion);break;
						}} while(opcion4>0 ||opcion4<=5);
						mostrarCamion(opcion); break;
					}
		}while(opcion2>=0 ||opcion2<=7);}



public static void modificarAvion(int opcion) {

	Vehiculo vehiculoElegido = utiles.GestList.lstVehiculos.get(opcion);
	mostrarAvion(opcion);
	 
			
			int opcion2 = 0;
			
			do {opcion2 = utiles.LecturaTeclado.lecturaEntero("Indica el número de la característica que quieres modificar \n 0 para salir" 
			+ "");
			
				switch(opcion2) {
					case 0: start.App.main(null);
					
					case 1: String valorNuevo = utiles.LecturaTeclado.lecturaString("Dame el nuevo valor del numero de bastidor (Tipo String)");
						vehiculoElegido.setNumBastidor(valorNuevo);
						mostrarAvion(opcion); 
						break;
											
					case 2: try{
						Integer valorNuevo1 = utiles.LecturaTeclado.lecturaEntero("Dame el nuevo valor para la altura máxima (Tipo Integer)");
					((Avion) vehiculoElegido).setAlturaMaxima(valorNuevo1)
					;mostrarAvion(opcion); break;}
				catch(Exception e) {}
				finally {System.out.println("No es un tipo de dato permitido");};break;
					
					case 3: try { 
						Integer valorNuevo11 = utiles.LecturaTeclado.lecturaEntero("Dame el nuevo valor para la autonomia (Tipo Integer)");
					((Avion) vehiculoElegido).setKmAutonomia(valorNuevo11)
					;mostrarAvion(opcion); break;}
				catch(Exception e) {}
				finally {System.out.println("No es un tipo de dato permitido");};break;
				
					case 4: try {
						Integer valorNuevo111 = utiles.LecturaTeclado.lecturaEntero("Dame el nuevo valor del máximo de pasajeros (Tipo Integer)");
					((Avion) vehiculoElegido).setMaxPasajeros(valorNuevo111);mostrarAvion(opcion);break;}
					catch(Exception e) {}
					finally {System.out.println("No es un tipo de dato permitido");};break;	
				
					case 5: try {
						Integer valorNuevo1111 = utiles.LecturaTeclado.lecturaEntero("Dame el nuevo valor de la potencia (Tipo Integer)");
					((Avion) vehiculoElegido).setNumTurbinas(valorNuevo1111);mostrarAvion(opcion);break;}
					catch(Exception e) {}
					finally {System.out.println("No es un tipo de dato permitido");};break;
					
					}
		}while(opcion2>=0 ||opcion2<=5);}



public static void mostrarCoche(int opcion) {
	Vehiculo vehiculoElegido = utiles.GestList.lstVehiculos.get(opcion);
	 
	System.out.println("El elemento elegido es un coche y sus atributos son los siguientes \n " 
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
	 
	System.out.println("El elemento elegido es un dron y sus atributos son los siguientes \n " 
						+" 1 "+ vehiculoElegido.getNumBastidor()+ "\n " 
						+" 2 "+ ((Dron) vehiculoElegido).getAlturaMaxima() + "\n "
						+" 3 "+ ((Dron) vehiculoElegido).getKmAutonomia() + "\n " 
						+" 4 "+ ((Dron) vehiculoElegido).getTipoCamara() + "\n " 
						+" 5 "+ ((Dron) vehiculoElegido).getPotencia() + "\n "
						+" 6 "+ ((Dron) vehiculoElegido).getCarnet() + "\n " );
	
	
}
public static void mostrarCamion(int opcion) {
	Vehiculo vehiculoElegido = utiles.GestList.lstVehiculos.get(opcion);
	 
	System.out.println("El elemento elegido es un camion y sus atributos son los siguientes \n " 
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
	 
	System.out.println("El elemento elegido es un avion y sus atributos son los siguientes \n " 
						+" 1 "+ vehiculoElegido.getNumBastidor()+ "\n " 
						+" 2 "+ ((Avion) vehiculoElegido).getAlturaMaxima() + "\n "
						+" 3 "+ ((Avion) vehiculoElegido).getKmAutonomia() + "\n " 
						+" 4 "+ ((Avion) vehiculoElegido).getMaxPasajeros() + "\n " 
						+" 5 "+ ((Avion) vehiculoElegido).getNumTurbinas() + "\n ");
	
	
}

}
