package start;
/**Clase abstracta vehiculo de la que heredan traccion y volador
 * @author Alejandro
 * @version 02/06/2019 
 */

public class Vehiculo {
	private String numBastidor;
	private Integer tipoVeh;

	public Vehiculo(String numBastidor) {
		this.numBastidor = numBastidor;
	}
	

	public Vehiculo() {
		super();
	}

	public String getNumBastidor() {
		return numBastidor;
	}

	public void setNumBastidor(String numBastidor) {
		this.numBastidor = numBastidor;
	}

	public Integer getTipoVeh() {
		return tipoVeh;
	}


	public void setTipoVeh(Integer tipoVeh) {
		this.tipoVeh = tipoVeh;
	}


	@Override
	public String toString() {
		return "Vehiculo [numBastidor=" + numBastidor + "]";
	}
	
}