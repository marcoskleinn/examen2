package ejer1;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Duenio duenio = new Duenio(null, null, 0, null);
		
		
		Mascota mascota = new Perros(null, 0, 0, duenio, false);
		
		
		Veterinaria vete = new Veterinaria(mascota, null, duenio);
		
		int opcion = 0;
		
		String [] opciones = {
			"Registrar vacunas", "llevar a la mascota", "veterinaria", "salir"	
		};
		
		do {
			
			opcion = JOptionPane.showOptionDialog(null, vete, null, opcion, opcion, null, opciones, opciones[0]);
			
			switch (opcion) {
			case 0:
				duenio.vacunas();
				break;
				
			case 1:
				vete.llevarMascota();
				break;	
				
			case 2:
				vete.examinarMascota(mascota);
				break;	
				
			case 3:
				JOptionPane.showMessageDialog(null, "Gracias por venir");
				break;		

			default :
				break;
			}
			
			
		} while (opcion != 3);

	}

}
