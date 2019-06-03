package tierra;

import interfaz.Interfaz;
import tipos.TpCAR;
import tipos.TpCOM;

/**Esta clase define el objeto camion
 * @author Jos� Luis
 * @version 03/06/2019 
 */

public class Camion extends Traccion implements Interfaz {

	private Integer tara;
	private Integer numEjes;
	private TpCAR Carnet;
	
	/**
	 * Constructor por defecto de Camion
	 */
	public Camion() {
		super();
	}
	
	/**
	 * Constructor completo de Camion
	 * @param numBastidor El n�mero de bastidor del cami�n
	 * @param marca La marca del cami�n
	 * @param modelo El modelo del cami�n
	 * @param tipoCombustible El combustible que usa el cami�n
	 * @param tara El peso que tiene el cami�n (vac�o)
	 * @param numEjes El n�mero de ejes que tiene el cami�n
	 * @param Carnet Tipo de carnet necesario para conducir el cami�n
	 */
	public Camion(String numBastidor, String marca, String modelo, TpCOM tipoCombustible, Integer tara, Integer numEjes, TpCAR Carnet) {
		super(numBastidor, marca, modelo, tipoCombustible);
		this.tara = tara;
		this.numEjes = numEjes;
		this.Carnet = Carnet;
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
		return "Camion [N�mero de Bastidor: " + getNumBastidor() + ". Marca: " + getMarca() + ". Modelo: " + getModelo() + ". TARA: " + tara + ". N�mero de Ejes: " + numEjes 
				+ ". Tipo de Combustible: " + getTipoCombustible() + ". Carnet: " + Carnet + "]";
	}
	
	public Integer getPotencia() {
		return tara*numEjes;
	}
	public TpCAR getCarnet() {
		return this.Carnet;

		
	}

	public void setTipoCarnet(TpCAR Carnet) {
		this.Carnet= Carnet;
		
	}
		
}
