package ejer1;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Duenio {
	
	private String nombre;
	private String apellido;
	private int telefono;
	private Mascota mascota;
	private ArrayList<String> vacunas;
	public Duenio(String nombre, String apellido, int telefono, ArrayList<String> vacunas) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.vacunas = new ArrayList<>();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public Mascota getMascota() {
		return mascota;
	}
	public void setMascota(Mascota mascota) {
		this.mascota = mascota;
	}
	
	
	public ArrayList<String> getVacunas() {
		return vacunas;
	}
	public void setVacunas(ArrayList<String> vacunas) {
		this.vacunas = vacunas;
	}
	
	
	public ArrayList<String> vacunas() {
		String vacuna;
		
		while (true) {
		
			vacuna = JOptionPane.showInputDialog("Ingrese vacunas (fin para terminar)");
			if (vacuna == null || vacuna.equalsIgnoreCase("fin")) {
				
				break;
				
			} else {
				
			}
			
			vacunas.add(vacuna);
			
		}
		return vacunas;
		
		

		
	}

}
