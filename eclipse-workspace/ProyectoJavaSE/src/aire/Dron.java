package aire;

import interfaz.Interfaz;
import tipos.TpCAM;

public class Dron extends Volador implements Interfaz{
	private TpCAM tipoCamara;
	private Integer potencia;
	public Dron(String numBastidor,Integer alturaMaxima, Integer kmAutonomia, TpCAM tipoCamara, Integer potencia) {
		super(numBastidor, alturaMaxima, kmAutonomia);
		this.tipoCamara = tipoCamara;
		this.potencia = potencia;
	}
	
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
	
	public void getCarnet() {
	}
	public void setCarnet() { 
	}

	@Override
	public String toString() {
		return "Dron [tipoCamara=" + tipoCamara + ", potencia=" + potencia + ", getAlturaMaxima()=" + getAlturaMaxima()
				+ ", getKmAutonomia()=" + getKmAutonomia() + ", getNumBastidor()=" + getNumBastidor() + "]";
	}

	}

	
	

