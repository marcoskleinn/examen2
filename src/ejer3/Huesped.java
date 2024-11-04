package ejer3;

import java.util.ArrayList;

import javax.print.DocFlavor.INPUT_STREAM;
import javax.print.attribute.standard.JobKOctetsProcessed;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;

public class Huesped {
	
	private String nombre;
	private String apellido;
	private String dni;
	private Habitacion habitacion;
	public Huesped(String nombre, String apellido, String dni) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.habitacion = new Habitacion(0, null);
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



	public String getDni() {
		return dni;
	}



	public void setDni(String dni) {
		this.dni = dni;
	}



	public Habitacion getHabitacion() {
		return habitacion;
	}



	public void setHabitacion(Habitacion habitacion) {
		this.habitacion = habitacion;
	}



	

	public ArrayList<Integer> reservarHabitacion() {
		
		
		int dias = 0;
		int precioNoche = 0;
		int total = 0;
		
		nombre = JOptionPane.showInputDialog("Ingrese su nombre");
		apellido = JOptionPane.showInputDialog("Ingrese su apellido");
		dni = JOptionPane.showInputDialog("Ingrese su dni");
		
		if (nombre.isEmpty() || nombre == null || apellido.isEmpty() || apellido == null || dni.isEmpty() || dni == null) {
			
		}
		
		precioNoche = (int) (Math.random() * 100000);
		
		
		dias = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantida de dias que va a estar"));
		
		total = precioNoche * dias;
		
		JOptionPane.showMessageDialog(null,"El total es de " + total);
		
		String desea = JOptionPane.showInputDialog("Desea reservar");
		
		if (desea.equalsIgnoreCase("si")) {
			
			int habitacion = (int) (Math.random() * 500);

			this.habitacion.getHabitaciones().add(habitacion);
		}
		return this.habitacion.getHabitaciones(); 
		
		
		
		
	}
}
