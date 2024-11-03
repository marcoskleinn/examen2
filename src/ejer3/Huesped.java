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
	
	
	
	public Habitacion getHabitacionn() {
		return habitacion;
	}
	public void setHabitacionn(Habitacion habitacion) {
		this.habitacion = habitacion;
	}
	public ArrayList<Integer> reservarHabitacion() {
		
		
		String desea;

		this.setNombre(JOptionPane.showInputDialog("Ingrese su nombre"));
		this.setApellido(JOptionPane.showInputDialog("Ingrese su apellido"));
		this.setDni(JOptionPane.showInputDialog("Ingrese su dni"));

			JOptionPane.showMessageDialog(null, "Tenemos habitacion: Habitacion Presidencial \n"
					+ "Habitacion Deluxe \n"
					+ "Habitacion Economica");
			
			JOptionPane.showMessageDialog(null, "Elija en numero la siguiente habitacion:");
			int numeroo = Integer.parseInt(JOptionPane.showInputDialog("Numero:"));
			
			if (numeroo == 1) {
				Habitacion habitacion = new HabitacionPresiedncial(null, numeroo, true);
				habitacion.getHotel().setPrecioXNoche((int) (Math.random() * 100000000));
				
				JOptionPane.showMessageDialog(null, "El precio por Noche es de esta habitacion" + this.habitacion.getHotel().getPrecioXNoche());
				
				 desea = JOptionPane.showInputDialog("Desea adquirir esta habitacion?");
				
				if (desea.equalsIgnoreCase("si")) {
					
					int numero = (int) (Math.random()* 500);
					
					
					
					this.habitacion.getHabitaciones().add(numero);
				}
			} else if (numeroo == 2) {
				Habitacion habitacion = new HabitacionDeluxe(null, numeroo, false);
				habitacion.getHotel().setPrecioXNoche((int) (Math.random() * 100000000));
				
				JOptionPane.showMessageDialog(null, "El precio por Noche es de esta habitacion" + this.habitacion.getHotel().getPrecioXNoche());
				
				 desea = JOptionPane.showInputDialog("Desea adquirir esta habitacion?");
				
				if (desea.equalsIgnoreCase("si")) {
					
					int numero = (int) (Math.random()* 500);
					
					
					
					this.habitacion.getHabitaciones().add(numero);
				} 
			} else if (numeroo == 3) {
				Habitacion habitacion = new HabitacionEconomica(null, numeroo, false);
				habitacion.getHotel().setPrecioXNoche((int) (Math.random() * 100000000));
				
				JOptionPane.showMessageDialog(null, "El precio por Noche es de esta habitacion" + this.habitacion.getHotel().getPrecioXNoche());
				
				 desea = JOptionPane.showInputDialog("Desea adquirir esta habitacion?");
				
				if (desea.equalsIgnoreCase("si")) {
					
					int numero = (int) (Math.random()* 500);
					
					
					this.habitacion.getHabitaciones().add(numero);
					
					
				}
			}
			
			
				
			
				
		return habitacion.getHabitaciones();
		
		
	}
}
