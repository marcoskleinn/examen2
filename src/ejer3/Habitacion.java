package ejer3;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Habitacion {
	
	private Hotel hotel;
	private int numeroHabitacion;
	private ArrayList<Integer> habitaciones;
	public Habitacion(Hotel hotel, int numeroHabitacion) {
		super();
		this.hotel = hotel;
		this.numeroHabitacion = numeroHabitacion;
		this.habitaciones = new ArrayList<>();
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
	
	public void verificarDisponibilidad(Habitacion habitacion) {
		
		for (int i = 0; i < habitaciones.size(); i++) {
			
			if (habitaciones.isEmpty()) {
				JOptionPane.showMessageDialog(null, "No hay habitaciones asignadas");
			} else {
				if (this.getNumeroHabitacion() == this.getNumeroHabitacion()) {
					JOptionPane.showMessageDialog(null, "ya hay una reserva a esa habitacion");
				} else {
					JOptionPane.showMessageDialog(null, "Puede adquirir la habitacion " + habitacion);
				}
			}
			
		}
		
	}
	
	
	
	
	
	
}
