package ejer1;

public class Gatos extends Mascota{
	
	private boolean visionNocturna;

	public Gatos(String nombre, int edad, double peso, Duenio duenio, boolean visionNocturna) {
		super(nombre, edad, peso, duenio);
		this.visionNocturna = visionNocturna;
	}
	
	

}
