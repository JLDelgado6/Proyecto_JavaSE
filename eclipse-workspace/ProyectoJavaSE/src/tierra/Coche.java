package tierra;

import interfaz.Interfaz;
import tipos.TpCOM;
import start.Vehiculo;

/**
 * author: JLDelgado6
 */

public class Coche extends Traccion {
	
	private Integer numPuertas;
	private Integer volumenMaletero;
	
	public Coche(String numBastidor) {
		super(numBastidor);
	}
	
	public Coche(String numBastidor, Integer numPuertas, Integer volumenMaletero) {
		super(numBastidor);
		this.numPuertas = numPuertas;
		this.volumenMaletero = volumenMaletero;
	}

	public Integer getNumPuertas() {
		return numPuertas;
	}

	public void setNumPuertas(Integer numPuertas) {
		this.numPuertas = numPuertas;
	}

	public Integer getVolumenMaletero() {
		return volumenMaletero;
	}

	public void setVolumenMaletero(Integer volumenMaletero) {
		this.volumenMaletero = volumenMaletero;
	}

	@Override
	public String toString() {
		return "Coche [N�mero de Bastidor: " + getNumBastidor() + ". Marca: " + getMarca() + ". Modelo: " + getModelo() + "N�mero de Puertas: " + numPuertas  
				+ ". Volumen del Maletero: " + volumenMaletero  + ". Tipo de Combustible: " + getTipoCombustible() + "]";
	}
	
	

}
