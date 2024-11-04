package ejer3;

import javax.swing.JOptionPane;

public class Hotel {
	
	private String nombre;
	private int estrellas;
	private String direccion;
	private int precioXNoche;
	private Huesped huesped;
	
	public Hotel(String nombre, int estrellas, String direccion, Huesped huesped) {
		super();
		this.nombre = nombre;
		this.estrellas = estrellas;
		this.direccion = direccion;
		this.precioXNoche = precioXNoche;
		this.huesped = huesped;
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
	
	
	public Huesped getHuesped() {
		return huesped;
	}
	public void setHuesped(Huesped huesped) {
		this.huesped = huesped;
	}
	public void bienvenida() {
		
		JOptionPane.showMessageDialog(null, "Bienvenido " + this.huesped.getNombre());
		
	}
	

}
