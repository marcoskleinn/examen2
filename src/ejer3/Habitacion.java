package ejer3;

import java.util.ArrayList;

public class Habitacion {
	
	private Hotel hotel;
	private int numeroHabitacion;
	private ArrayList<Integer> habitaciones;
	public Habitacion(Hotel hotel, int numeroHabitacion, ArrayList<Integer> habitaciones) {
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
	
	
	
	
}
