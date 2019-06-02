package tierra;

import interfaz.Interfaz;
import tipos.TpCAR;
import tipos.TpCOM;

/**
 * @author Jos� Luis
 * Clase Coche
 * @version 03/06/2019 
 */

public class Coche extends Traccion implements Interfaz {
	
	private Integer numPuertas;
	private Integer volumenMaletero;
	private TpCAR Carnet;

	/**
	 * Constructor por defecto de Coche
	 */
	public Coche() {
		super();
	}
	
	/**
	 * Constructor completo de Coche
	 */
	public Coche(String numBastidor, String marca, String modelo, TpCOM tipoCombustible, Integer numPuertas, Integer volumenMaletero, TpCAR Carnet) {
		super(numBastidor, marca, modelo, tipoCombustible);
		this.numPuertas = numPuertas;
		this.volumenMaletero = volumenMaletero;
		this.Carnet = Carnet;
	
	
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
				+ ". Volumen del Maletero: " + volumenMaletero  + ". Tipo de Combustible: " + getTipoCombustible() + ". Carnet: " + Carnet  + "]";
	}

	public TpCAR getCarnet() {
		return this.Carnet;

		
	}

	public void setTipoCarnet(TpCAR Carnet) {
		this.Carnet= Carnet;
		
	}

	@Override
	public Integer getPotencia() {
		return volumenMaletero*500;
	}
	

	}


