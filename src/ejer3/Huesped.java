package ejer3;

import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;

public class Huesped {
	
	private String nombre;
	private String apellido;
	private String dni;
	private Habitacion habitacion;
	public Huesped(String nombre, String apellido, String dni, Habitacion habitacion) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.habitacion = habitacion;
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

		this.setNombre(JOptionPane.showInputDialog("Ingrese su nombre"));
		this.setApellido(JOptionPane.showInputDialog("Ingrese su apellido"));
		this.setDni(JOptionPane.showInputDialog("Ingrese su dni"));
		
		String[] habitacionn = {
			"Habitacion Presidencial", "Habitacion deluxe", "Habitacion Economica"	
		};
		
		
			JOptionPane.showMessageDialog(null, "Elija una habitacion");
			
			int opcion = JOptionPane.showOptionDialog(null, habitacionn, apellido, 0, 0, null, habitacionn, habitacionn[0]);
			
			if (opcion == 0) {
				this.habitacion.getHotel().setPrecioXNoche((int) (Math.random() * 100000000));
				
				JOptionPane.showMessageDialog(null, "El precio por Noche es de esta habitacion" + this.habitacion.getHotel().getPrecioXNoche());
				
				String desea = JOptionPane.showInputDialog("Desea adquirir esta habitacion?");
				
				if (desea.equalsIgnoreCase("si")) {
					
					int numero = (int) (Math.random()* 500);
					
					 habitacion.setNumeroHabitacion(numero);
					
					this.habitacion.getHabitaciones().add(habitacion.getNumeroHabitacion());
				}
			}
			return habitacion.getHabitaciones();
			
			
			
			
	
		
		
		
		
		
		
	}

}
