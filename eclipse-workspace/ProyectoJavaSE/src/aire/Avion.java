package aire;

/**
 * @author Alejandro
 * Clase avion
 * @version 02/06/2019 
 *
 */
public class Avion extends Volador{
	private Integer maxPasajeros;
	private Integer numTurbinas;
	/**
	 * Constructor completo de avion
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
	
	
