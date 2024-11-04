package ejer3;

import java.util.ArrayList;

public class HabitacionEconomica extends Habitacion{
	
	private boolean tieneBalcon;


	

	public HabitacionEconomica(Hotel hotel, int numeroHabitacion, Huesped huesped, boolean tieneBalcon) {
		super(numeroHabitacion, huesped);
		this.tieneBalcon = tieneBalcon;
	}

	public boolean isTieneBalcon() {
		return tieneBalcon;
	}

	public void setTieneBalcon(boolean tieneBalcon) {
		this.tieneBalcon = tieneBalcon;
	}
	
	

}
