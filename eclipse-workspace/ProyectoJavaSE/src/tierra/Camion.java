package tierra;

import interfaz.Interfaz;

/**
 * author: JLDelgado6
 */

public class Camion extends Traccion {

	private Integer tara;
	private Integer numEjes;
	
	public Camion(String numBastidor) {
		super(numBastidor);
	}
	
	public Camion(String numBastidor, Integer tara, Integer numEjes) {
		super(numBastidor);
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
	
	
	
	
	
	
	
}
