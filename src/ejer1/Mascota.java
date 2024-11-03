package ejer1;

public class Mascota {

	private String nombre;
	private int edad;
	private double peso;
	private Duenio duenio;
	public Mascota(String nombre, int edad, double peso, Duenio duenio) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.duenio = duenio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public Duenio getDuenio() {
		return duenio;
	}
	public void setDuenio(Duenio duenio) {
		this.duenio = duenio;
	}
	
	
	
	
}
