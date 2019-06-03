package tierra;

import interfaz.Interfaz;
import tipos.TpCAR;
import tipos.TpCOM;

/**Esta clase define el objeto coche
 * @author José Luis
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
	 * @param numBastidor El número de bastidor del coche
	 * @param marca La marca del coche
	 * @param modelo El modelo del coche
	 * @param tipoCombustible El combustible que usa el coche
	 * @param numPuertas El número de puertas que tiene el coche (entre 2 y 7)
	 * @param volumenMaletero El volumen del maletero del coche (se especificará en decímetros cúbicos)
	 * @param Carnet Tipo de carnet necesario para conducir el coche
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
		return "Coche [Número de Bastidor: " + getNumBastidor() + ". Marca: " + getMarca() + ". Modelo: " + getModelo() + "Número de Puertas: " + numPuertas  
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


