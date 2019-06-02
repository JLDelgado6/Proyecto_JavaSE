package aire;

import interfaz.Interfaz;
import tipos.TpCAM;
import tipos.TpCAR;
/**
 * @author Alejandro
 * Clase Dron
 * @version 02/06/2019 
 *
 */

public class Dron extends Volador implements Interfaz{
	private TpCAM tipoCamara;
	private Integer potencia;
	private TpCAR Carnet;
	/**
	 * Constructor completo de dron
	 */
	public Dron(String numBastidor,Integer alturaMaxima, Integer kmAutonomia, TpCAM tipoCamara, Integer potencia, TpCAR Carnet) {
		super(numBastidor, alturaMaxima, kmAutonomia);
		this.tipoCamara = tipoCamara;
		this.potencia = potencia;
		this.Carnet = Carnet;
	
	}
	/**
	 * Constructor por defecto de dron
	 */
	public Dron() {
		super();
	}
	public TpCAM getTipoCamara() {
		return tipoCamara;
	}
	public Integer getPotencia() {
		return potencia;
	}
	public void setTipoCamara(TpCAM tipoCamara) {
		this.tipoCamara = tipoCamara;
	}
	public void setPotencia(Integer potencia) {
		this.potencia = potencia;
	}
	
	public TpCAR getCarnet() {
		return this.Carnet;	
	}

	public void setTipoCarnet(TpCAR Carnet) {
		this.Carnet= Carnet;
		
	}

	@Override
	public String toString() {
		return "Dron [tipoCamara=" + tipoCamara + ", potencia=" + potencia + ", Carnet=" + Carnet
				+ ", getAlturaMaxima()=" + getAlturaMaxima() + ", getKmAutonomia()=" + getKmAutonomia()
				+ ", getNumBastidor()=" + getNumBastidor() + "]";
	}
	}

	
	

