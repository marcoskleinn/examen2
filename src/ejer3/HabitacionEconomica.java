package ejer3;

import java.util.ArrayList;

public class HabitacionEconomica extends Habitacion{
	
	private boolean tieneBalcon;

	

	public HabitacionEconomica(Hotel hotel, int numeroHabitacion, ArrayList<Integer> habitaciones,
			boolean tieneBalcon) {
		super(hotel, numeroHabitacion, habitaciones);
		this.tieneBalcon = tieneBalcon;
	}

	public boolean isTieneBalcon() {
		return tieneBalcon;
	}

	public void setTieneBalcon(boolean tieneBalcon) {
		this.tieneBalcon = tieneBalcon;
	}
	
	

}
