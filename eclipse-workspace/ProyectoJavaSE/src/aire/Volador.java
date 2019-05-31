package aire;

import start.Vehiculo;

public abstract class Volador extends Vehiculo{
	private Integer alturaMaxima;
	private Integer kmAutonomia;
	
	public Volador(String numBastidor, Integer alturaMaxima, Integer kmAutonomia) {
		super(numBastidor);
		this.alturaMaxima = alturaMaxima;
		this.kmAutonomia = kmAutonomia;
	}
	
	public Volador(){
		super();
	}
	public Integer getAlturaMaxima() {
		return alturaMaxima;
	}
	public Integer getKmAutonomia() {
		return kmAutonomia;
	}
	public void setAlturaMaxima(Integer alturaMaxima) {
		this.alturaMaxima = alturaMaxima;
	}
	public void setKmAutonomia(Integer kmAutonomia) {
		this.kmAutonomia = kmAutonomia;
	}
	@Override
	public String toString() {
		return "Volador [alturaMaxima=" + alturaMaxima + ", kmAutonomia=" + kmAutonomia + "]";
	}
	
	
}