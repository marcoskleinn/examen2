package ejer3;

public class Hotel {
	
	private String nombre;
	private int estrellas;
	private String direccion;
	private int precioXNoche;
	public Hotel(String nombre, int estrellas, String direccion, int precioXNoche) {
		super();
		this.nombre = nombre;
		this.estrellas = estrellas;
		this.direccion = direccion;
		this.precioXNoche = precioXNoche;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEstrellas() {
		return estrellas;
	}
	public void setEstrellas(int estrellas) {
		this.estrellas = estrellas;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getPrecioXNoche() {
		return precioXNoche;
	}
	public void setPrecioXNoche(int precioXNoche) {
		this.precioXNoche = precioXNoche;
	}
	
	

}