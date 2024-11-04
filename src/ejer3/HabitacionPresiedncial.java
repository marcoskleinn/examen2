package ejer3;

import java.util.ArrayList;

public class HabitacionPresiedncial extends Habitacion{
	
	private boolean aceptaMascotas;


	

	

	public HabitacionPresiedncial(Hotel hotel, int numeroHabitacion, ArrayList<Integer> habitaciones, Huesped huesped,
			boolean aceptaMascotas) {
		super(numeroHabitacion, huesped);
		this.aceptaMascotas = aceptaMascotas;
	}

	public boolean isAceptaMascotas() {
		return aceptaMascotas;
	}

	public void setAceptaMascotas(boolean aceptaMascotas) {
		this.aceptaMascotas = aceptaMascotas;
	}

	
	

}
