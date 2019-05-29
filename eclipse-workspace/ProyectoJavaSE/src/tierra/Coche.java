package tierra;

import interfaz.Interfaz;
import tipos.TpCOM;

/**
 * author: JLDelgado6
 */

public class Coche extends Traccion implements Interfaz {
	
	private Integer numPuertas;
	private Integer volumenMaletero;

	public Coche() {
		super();
	}
	
	public Coche(String numBastidor, String marca, String modelo, TpCOM tipoCombustible, Integer numPuertas, Integer volumenMaletero) {
		super(numBastidor, marca, modelo, tipoCombustible);
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
		return "Coche [Número de Bastidor: " + getNumBastidor() + ". Marca: " + getMarca() + ". Modelo: " + getModelo() + "Número de Puertas: " + numPuertas  
				+ ". Volumen del Maletero: " + volumenMaletero  + ". Tipo de Combustible: " + getTipoCombustible() + "]";
	}
	
	public void getCarnet() {}
	public void setCarnet() {}

}
