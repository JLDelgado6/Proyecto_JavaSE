package utiles;

import aire.Avion;
import aire.Dron;
import start.Vehiculo;
import tierra.Camion;
import tierra.Coche;
import tipos.TpCAM;
import tipos.TpCAR;
import tipos.TpCOM;
/**Clase ModificarSegunTipos. Las clases cuyo nombre comienzan por Mostrar (p.e. MostrarCamion) se limitan a mostrar las características especiales de cada tipo de vehículo en una lista ordenada.
 * Las clases que comienzan con modificar (p.e. ModificarCamion) lanzan un switch de manera que cada uno de los case X sea la característica a modificar. Los tipos se plantean mediante un switch y los Integer/String mediante una lectura de teclado.
 * @author Alejandro
 * @version 02/06/2019 
 */
public class ModificarSegunTipos extends RuntimeException{
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
							
							if(valorNuevo1111<=7 && valorNuevo1111>=2) {
								((Coche) vehiculoElegido).setNumPuertas(valorNuevo1111);mostrarCoche(opcion);break;}
							
						else {	System.out.println("ERROR!\nEl valor no es coherente con el parámetro a introducir.\nIntroduzca un valor numérico entre 2 y 7");
								mostrarCoche(opcion);
						}break;
							}
						catch(Exception e) {System.out.println("No es un tipo de dato permitido");
						mostrarCoche(opcion);
						break;
						}
						
						case 6:try { 
							Integer valorNuevo11111 = utiles.LecturaTeclado.lecturaEntero("Dame el nuevo volumen del maletero (Tipo Integer)");
							if(valorNuevo11111<=1000 && valorNuevo11111 >=0) {
						((Coche) vehiculoElegido).setVolumenMaletero(valorNuevo11111);mostrarCoche(opcion);break;}
							else {
								System.out.println("ERROR!\nEl valor no es coherente con el parámetro a introducir.\nIntroduzca un valor numérico entre 0 y 1000");
								mostrarCoche(opcion);
								break;
							}
						}
						catch(Exception e) {System.out.println("No es un tipo de dato permitido");
						mostrarCoche(opcion);
						break;
						}
						
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
					if(valorNuevo1<=1000 && valorNuevo1>=0) {
		/**/				((Dron) vehiculoElegido).setAlturaMaxima(valorNuevo1)
						;mostrarDron(opcion); 
						break;}
					else {	System.out.println("ERROR!\nEl valor no es coherente con el parámetro a introducir.\nIntroduzca un valor numérico entre 0 y 1000");
						mostrarDron(opcion);
						break;
						}	
					}
				catch(Exception e) {System.out.println("No es un tipo de dato permitido");
				mostrarDron(opcion);
				break;
				}
					
					case 3: try { 
						Integer valorNuevo11 = utiles.LecturaTeclado.lecturaEntero("Dame el nuevo valor para la autonomia (Tipo Integer)");
						if(valorNuevo11<=10000000 && valorNuevo11>=0) {
					((Dron) vehiculoElegido).setKmAutonomia(valorNuevo11)
					;mostrarDron(opcion); 
					break;}
	/**/					else{System.out.println("ERROR!\nEl valor no es coherente con el parámetro a introducir.\nIntroduzca un valor numérico entre 0 y 10000000");
						mostrarDron(opcion);
						break;
						}	
					}
				catch(Exception e) {System.out.println("No es un tipo de dato permitido");
				mostrarDron(opcion);
				break;
				}
					
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
						if(valorNuevo1111<=50000 && valorNuevo1111>=10) {
	/**/				((Dron) vehiculoElegido).setPotencia(valorNuevo1111);
					mostrarDron(opcion);
					break;
					}else{
					System.out.println("ERROR!\nEl valor no es coherente con el parámetro a introducir.\nIntroduzca un valor numérico entre 10 y 50000");
					mostrarDron(opcion);
					break;
					}	
				}
					catch(Exception e) {System.out.println("No es un tipo de dato permitido");
					mostrarDron(opcion);
					break;
					}
					
					
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
						if(valorNuevo1111<=31000 && valorNuevo1111>=500) {
					((Camion) vehiculoElegido).setTara(valorNuevo1111);
		/**/			mostrarCamion(opcion);
					break;
					}else {	System.out.println("ERROR!\nEl valor no es coherente con el parámetro a introducir.\nIntroduzca un valor numérico entre 500 y 31000");
					mostrarCamion(opcion);
					break;
					}}
					catch(Exception e) {System.out.println("No es un tipo de dato permitido");
					mostrarCamion(opcion);
					break;
					}
					
					case 6:try { 
						Integer valorNuevo11111 = utiles.LecturaTeclado.lecturaEntero("Dame el nuevo valor del numero de ejes (Tipo Integer)");
					if(valorNuevo11111<=4 && valorNuevo11111>=1) {
							((Camion) vehiculoElegido).setNumEjes(valorNuevo11111);
							mostrarCamion(opcion);
							break;}
					else {
						System.out.println("ERROR!\nEl valor no es coherente con el parámetro a introducir.\nIntroduzca un valor numérico entre 1 y 4");
						mostrarCamion(opcion);
						break;
						}}
						
					catch(Exception e) {System.out.println("No es un tipo de dato permitido");
					mostrarCamion(opcion);
					break;
					}
					
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
						if(valorNuevo1<=12800 && valorNuevo1>=0) {
					((Avion) vehiculoElegido).setAlturaMaxima(valorNuevo1)
/**/					;mostrarAvion(opcion); break;}
						else {	System.out.println("ERROR!\nEl valor no es coherente con el parámetro a introducir.\nIntroduzca un valor numérico entre 0 y 12800");
						mostrarAvion(opcion);
						break;
				}
				}
				catch(Exception e) {System.out.println("No es un tipo de dato permitido");
				mostrarAvion(opcion);
				break;
				}
					
					case 3: try { 
						Integer valorNuevo11 = utiles.LecturaTeclado.lecturaEntero("Dame el nuevo valor para la autonomia (Tipo Integer)");
						if(valorNuevo11>0) {
	/**/				((Avion) vehiculoElegido).setKmAutonomia(valorNuevo11)
					;mostrarAvion(opcion); break;}
						else {	System.out.println("ERROR!\nEl valor no es coherente con el parámetro a introducir.\nIntroduzca un valor numérico positivo.");
						mostrarAvion(opcion);
						break;
				}
				}
				catch(Exception e) {System.out.println("No es un tipo de dato permitido");
				mostrarAvion(opcion);
				break;
				}
				
					case 4: try {
						Integer valorNuevo111 = utiles.LecturaTeclado.lecturaEntero("Dame el nuevo valor del máximo de pasajeros (Tipo Integer)");
/**/						if(valorNuevo111<=550 && valorNuevo111>=5) {
					((Avion) vehiculoElegido).setMaxPasajeros(valorNuevo111);mostrarAvion(opcion);break;}
						else {	System.out.println("ERROR!\nEl valor no es coherente con el parámetro a introducir.\nIntroduzca un valor numérico entre 5 y 550");
						mostrarAvion(opcion);
						break;
				}
				}
					catch(Exception e) {System.out.println("No es un tipo de dato permitido");
					mostrarAvion(opcion);
					break;
					}
				
					case 5: try {
						Integer valorNuevo1111 = utiles.LecturaTeclado.lecturaEntero("Dame el nuevo valor del número de turbinas (Tipo Integer)");
						if(valorNuevo1111<=6 && valorNuevo1111>=2) {
/**/					((Avion) vehiculoElegido).setNumTurbinas(valorNuevo1111);mostrarAvion(opcion);break;}
						else {	System.out.println("ERROR!\nEl valor no es coherente con el parámetro a introducir.\nIntroduzca un valor numérico entre 2 y 6");
						mostrarAvion(opcion);
						break;
				}
				}
					catch(Exception e) {System.out.println("No es un tipo de dato permitido");
					mostrarAvion(opcion);
					break;
					}
					
					}
		}while(opcion2>=0 ||opcion2<=5);}



public static void mostrarCoche(int opcion) {
	Vehiculo vehiculoElegido = utiles.GestList.lstVehiculos.get(opcion);
	 
	System.out.println("El elemento elegido es un coche y sus atributos son los siguientes \n " 
						+" 1 Numero de bastidor: "+ vehiculoElegido.getNumBastidor()+ "\n " 
						+" 2 Tipo de combustible: "+ ((Coche) vehiculoElegido).getTipoCombustible() + "\n "
						+" 3 Marca: "+ ((Coche) vehiculoElegido).getMarca() + "\n " 
						+" 4 Modelo: "+ ((Coche) vehiculoElegido).getModelo() + "\n " 
						+" 5 Número de puertas: "+ ((Coche) vehiculoElegido).getNumPuertas() + "\n "
						+" 6 Volumen de maletero: "+ ((Coche) vehiculoElegido).getVolumenMaletero() + "\n " 
						+" 7 Carnet: "+ ((Coche) vehiculoElegido).getCarnet() + "\n " );
	
	
}
public static void mostrarDron(int opcion) {
	Vehiculo vehiculoElegido = utiles.GestList.lstVehiculos.get(opcion);
	 
	System.out.println("El elemento elegido es un dron y sus atributos son los siguientes \n " 
						+" 1 Numero de bastidor: "+ vehiculoElegido.getNumBastidor()+ "\n " 
						+" 2 Altura máxima: "+ ((Dron) vehiculoElegido).getAlturaMaxima() + "\n "
						+" 3 Kms Autonomía: "+ ((Dron) vehiculoElegido).getKmAutonomia() + "\n " 
						+" 4 Tipo de cámara: "+ ((Dron) vehiculoElegido).getTipoCamara() + "\n " 
						+" 5 Potencia: "+ ((Dron) vehiculoElegido).getPotencia() + "\n "
						+" 6 Carnet: "+ ((Dron) vehiculoElegido).getCarnet() + "\n " );
	
	
}
public static void mostrarCamion(int opcion) {
	Vehiculo vehiculoElegido = utiles.GestList.lstVehiculos.get(opcion);
	 
	System.out.println("El elemento elegido es un camion y sus atributos son los siguientes \n " 
						+" 1 Numero de bastidor: "+ vehiculoElegido.getNumBastidor()+ "\n " 
						+" 2 Tipo de combustible: "+ ((Camion) vehiculoElegido).getTipoCombustible() + "\n "
						+" 3 Marca: "+ ((Camion) vehiculoElegido).getMarca() + "\n " 
						+" 4 Modelo: "+ ((Camion) vehiculoElegido).getModelo() + "\n " 
						+" 5 Tara: "+ ((Camion) vehiculoElegido).getTara() + "\n "
						+" 6 Número de ejes: "+ ((Camion) vehiculoElegido).getNumEjes() + "\n " 
						+" 7 Carnet: "+ ((Camion) vehiculoElegido).getCarnet() + "\n " );
	
	
}
public static void mostrarAvion(int opcion) {
	Vehiculo vehiculoElegido = utiles.GestList.lstVehiculos.get(opcion);
	 
	System.out.println("El elemento elegido es un avion y sus atributos son los siguientes \n " 
						+" 1 Numero de bastidor: "+ vehiculoElegido.getNumBastidor()+ "\n " 
						+" 2 Altura máxima: "+ ((Avion) vehiculoElegido).getAlturaMaxima() + "\n "
						+" 3 Kms Autonomía: "+ ((Avion) vehiculoElegido).getKmAutonomia() + "\n " 
						+" 4 Máximo pasajeros: "+ ((Avion) vehiculoElegido).getMaxPasajeros() + "\n " 
						+" 5 Número de turbinas: "+ ((Avion) vehiculoElegido).getNumTurbinas() + "\n ");
	
	
}

}
