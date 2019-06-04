package tierra;

import tipos.TpCOM;
import start.Vehiculo;

/**Clase abstracta Traccion de la que heredan coches y camiones
 * @author Jos� Luis
 * @version 03/06/2019 
 */

public abstract class Traccion extends Vehiculo {

		private String marca;
		private String modelo;
		private TpCOM tipoCombustible;

		/**
		 * Constructor por defecto de Traccion
		 */
		public Traccion() {
			super();
		}
		
		/**
		 * Constructor completo de Traccion
		 * @param numBastidor n�mero de bastidor
		 * @param marca es la marca del veh�culo de Tracci�n
		 * @param modelo es el modelo del veh�culo de Tracci�n
		 * @param tipoCombustible es el tipo de combustible del veh�culo de Tracci�n
		 */
		public Traccion(String numBastidor, String marca, String modelo, TpCOM tipoCombustible) {
			super(numBastidor);
			this.marca = marca;
			this.modelo = modelo;
			this.tipoCombustible = tipoCombustible;
		}
		

		public String getMarca() {
			return marca;
		}

		public void setMarca(String marca) {
			this.marca = marca;
		}

		public String getModelo() {
			return modelo;
		}

		public void setModelo(String modelo) {
			this.modelo = modelo;
		}

		public TpCOM getTipoCombustible() {
			return tipoCombustible;
		}

		public void setTipoCombustible(TpCOM tipoCombustible) {
			this.tipoCombustible = tipoCombustible;
		}
		
		

		@Override
		public String toString() {
			return "Traccion [Marca: " + marca + ". Modelo: " + modelo + ". Tipo de Combustible: " + tipoCombustible 
					+ ". Potencia: " + getPotencia() + ". N�mero de Bastidor: " + getNumBastidor() + "]";
		}

		public abstract Integer getPotencia();

}