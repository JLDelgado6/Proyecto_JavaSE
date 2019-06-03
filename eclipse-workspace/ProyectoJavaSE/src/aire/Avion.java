package aire;

/**Esta clase define el objeto avion
 * @author Alejandro
 * @version 02/06/2019 
 */
public class Avion extends Volador{
	private Integer maxPasajeros;
	private Integer numTurbinas;
	/**
	 * Constructor completo de avion
	 * @param numBastidor El número de bastidor del avion
	 * @param alturaMaxima La altura máxima que alcanza el avion
	 * @param kmAutonomia La autonomía que tiene el avion
	 * @param maxPasajeros Los pasajeros maximos del avion
	 * @param numTurbinas Las turbinas que incluye el avion
	 */
	public Avion(String numBastidor,Integer alturaMaxima, Integer kmAutonomia, Integer maxPasajeros, Integer numTurbinas) {
		super(numBastidor, alturaMaxima, kmAutonomia);
		this.maxPasajeros = maxPasajeros;
		this.numTurbinas = numTurbinas;
	}
	/**
	 * Constructor por defecto de avion
	 */
	public Avion() {
		super();
	}
	public Integer getMaxPasajeros() {
		return maxPasajeros;
	}
	public Integer getNumTurbinas() {
		return numTurbinas;
	}
	public void setMaxPasajeros(Integer maxPasajeros) {
		this.maxPasajeros = maxPasajeros;
	}
	public void setNumTurbinas(Integer numTurbinas) {
		this.numTurbinas = numTurbinas;
	}
	@Override
	public String toString() {
		return "Avion [maxPasajeros=" + maxPasajeros + ", numTurbinas=" + numTurbinas + ", getAlturaMaxima()="
				+ getAlturaMaxima() + ", getKmAutonomia()=" + getKmAutonomia() + ", getNumBastidor()="
				+ getNumBastidor() + "]";
	}
			
	}
	
	
