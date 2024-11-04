package ejer3;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Habitacion {
	
	private Hotel hotel;
	private int numeroHabitacion;
	private ArrayList<Integer> habitaciones;
	private Huesped huesped;
	public Habitacion(int numeroHabitacion, Huesped huesped) {
		super();
		this.hotel = hotel;
		this.numeroHabitacion = numeroHabitacion;
		this.habitaciones = new ArrayList<>();
		this.huesped = huesped;
	}
	public Hotel getHotel() {
		return hotel;
	}
	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
	public int getNumeroHabitacion() {
		return numeroHabitacion;
	}
	public void setNumeroHabitacion(int numeroHabitacion) {
		this.numeroHabitacion = numeroHabitacion;
	}
	public ArrayList<Integer> getHabitaciones() {
		return habitaciones;
	}
	public void setHabitaciones(ArrayList<Integer> habitaciones) {
		this.habitaciones = habitaciones;
	}
	
	
	
	public Huesped getHuesped() {
		return huesped;
	}
	public void setHuesped(Huesped huesped) {
		this.huesped = huesped;
	}
	public void verificarDisponibilidad(Habitacion habitacion) {
		
		
			
			for (Integer habita : habitaciones) {
				
				if (this.getHabitaciones().size() == habita) {
					JOptionPane.showMessageDialog(null, "ya hay una habitacion reservada");
					break;
					
				} else {
					JOptionPane.showMessageDialog(null, "Esta disponible la " + habitacion);
				}
				
			}
			
		
		
	}
	
	
	
	
	
	
}
