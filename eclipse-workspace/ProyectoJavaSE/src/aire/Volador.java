package aire;

import start.Vehiculo;
/**Clase abstracta volador de la que heredan drones y aviones
 * @author Alejandro
 * @version 02/06/2019 
 */
public abstract class Volador extends Vehiculo{
	private Integer alturaMaxima;
	private Integer kmAutonomia;
	/**
	 * Constructor completo de volador
	 * @param numBastidor n�mero de bastidor
	 * @param alturaMaxima es la altura m�xima del volador
	 * @param kmAutonomia kilometraje m�ximo que alcanza el volador
	 */
	public Volador(String numBastidor, Integer alturaMaxima, Integer kmAutonomia) {
		super(numBastidor);
		this.alturaMaxima = alturaMaxima;
		this.kmAutonomia = kmAutonomia;
	}
	/**
	 * Constructor por defecto de volador
	 */
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