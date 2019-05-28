package start;

public class Vehiculo {
	private String numBastidor;

	public Vehiculo(String numBastidor) {
		this.numBastidor = numBastidor;
	}

	public String getNumBastidor() {
		return numBastidor;
	}

	public void setNumBastidor(String numBastidor) {
		this.numBastidor = numBastidor;
	}

	@Override
	public String toString() {
		return "Vehiculo [numBastidor=" + numBastidor + "]";
	}
	
}