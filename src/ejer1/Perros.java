package ejer1;

public class Perros extends Mascota{
	
	private boolean tieneGarrapatas;

	public Perros(String nombre, int edad, double peso, Duenio duenio, boolean tieneGarrapatas) {
		super(nombre, edad, peso, duenio);
		this.tieneGarrapatas = tieneGarrapatas;
	}
	

	
}
