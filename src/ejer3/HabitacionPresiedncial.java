package ejer3;

import java.util.ArrayList;

public class HabitacionPresiedncial extends Habitacion{
	
	private boolean aceptaMascotas;


	public HabitacionPresiedncial(Hotel hotel, int numeroHabitacion, boolean aceptaMascotas) {
		super( hotel, numeroHabitacion);
		this.aceptaMascotas = aceptaMascotas;
	}

	public boolean isAceptaMascotas() {
		return aceptaMascotas;
	}

	public void setAceptaMascotas(boolean aceptaMascotas) {
		this.aceptaMascotas = aceptaMascotas;
	}

	
	

}
