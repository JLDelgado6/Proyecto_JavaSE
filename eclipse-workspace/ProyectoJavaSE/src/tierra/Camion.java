package tierra;

import interfaz.Interfaz;
import tipos.TpCOM;

/**
 * author: JLDelgado6
 */

public class Camion extends Traccion implements Interfaz {

	private Integer tara;
	private Integer numEjes;
	
	public Camion() {
		super();
	}
	
	public Camion(String numBastidor, String marca, String modelo, TpCOM tipoCombustible, Integer tara, Integer numEjes) {
		super(numBastidor, marca, modelo, tipoCombustible);
		this.tara = tara;
		this.numEjes = numEjes;
	}
	
	
	public Integer getTara() {
		return tara;
	}

	public void setTara(Integer tara) {
		this.tara = tara;
	}

	public Integer getNumEjes() {
		return numEjes;
	}

	public void setNumEjes(Integer numEjes) {
		this.numEjes = numEjes;
	}

	@Override
	public String toString() {
		return "Camion [Número de Bastidor: " + getNumBastidor() + ". Marca: " + getMarca() + ". Modelo: " + getModelo() + ". TARA: " + tara + ". Número de Ejes=" + numEjes 
				+ ". Tipo de Combustible: " + getTipoCombustible() + "]";
	}
	
	public Integer getPotencia() {
		return tara*numEjes;
	}
	
	public void getCarnet() {}
	public void setCarnet() {}
		
}
