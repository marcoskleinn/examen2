package ejer1;

public class Aves extends Mascota{
	
	private double tiempoVuelo;

	public Aves(String nombre, int edad, double peso, Duenio duenio, double tiempoVuelo) {
		super(nombre, edad, peso, duenio);
		this.tiempoVuelo = tiempoVuelo;
	}

	public double getTiempoVuelo() {
		return tiempoVuelo;
	}

	public void setTiempoVuelo(double tiempoVuelo) {
		this.tiempoVuelo = tiempoVuelo;
	}
	
	
	
}
