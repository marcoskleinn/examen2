package ejer3;

import java.util.ArrayList;

public class HabitacionDeluxe extends Habitacion{
	
	private boolean camaMasaje;

	

	public HabitacionDeluxe(Hotel hotel, int numeroHabitacion, ArrayList<Integer> habitaciones, boolean camaMasaje) {
		super(hotel, numeroHabitacion, habitaciones);
		this.camaMasaje = camaMasaje;
	}

	public boolean isCamaMasaje() {
		return camaMasaje;
	}

	public void setCamaMasaje(boolean camaMasaje) {
		this.camaMasaje = camaMasaje;
	}
	
	
	

}
