package ejer3;

import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;

public class Main {
	
	public static void main(String[] args) {
		
		Habitacion habitacion1 = new HabitacionPresiedncial(null, 0, false);
		
		Huesped huesped1 = new Huesped(null, null, null, null);
		
		Hotel hotel = new Hotel(null, 0, null, 0, huesped1);
		
		int opcion = 0;
		
		String[] opciones = {
			"reservar", "verificar", "bienvenida", "Salir"	
		};
		
		
		do {
			
			opcion = JOptionPane.showOptionDialog(null, "Menu", null, opcion, opcion, null, opciones, opciones[0]);
			
			switch (opcion) {
			case 0:
				huesped1.reservarHabitacion();
				break;
				
			case 1:
				habitacion1.verificarDisponibilidad(habitacion1);
				break;	
				
			case 2:
				hotel.bienvenida();
				break;
				
			case 3:
				JOptionPane.showMessageDialog(null, "Gracias por pasar el tiempo con nosotros");
				break;		

			default:
				break;
			}
			
		} while (opcion != 3);
		
	}

}
