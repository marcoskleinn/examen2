package ejer1;

import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;

public class Veterinaria {
	
	private Mascota mascota;
	private String nombreDeLaProfesional;
	private Duenio duenio;
	
	
	public Veterinaria(Mascota mascota, String nombreDeLaProfesional, Duenio duenio) {
		super();
		this.mascota = mascota;
		this.nombreDeLaProfesional = nombreDeLaProfesional;
		this.duenio = duenio;
	}


	public Mascota getMascota() {
		return mascota;
	}


	public void setMascota(Mascota mascota) {
		this.mascota = mascota;
	}


	public String getNombreDeLaProfesional() {
		return nombreDeLaProfesional;
	}


	public void setNombreDeLaProfesional(String nombreDeLaProfesional) {
		this.nombreDeLaProfesional = nombreDeLaProfesional;
	}


	public Duenio getDuenio() {
		return duenio;
	}


	public void setDuenio(Duenio duenio) {
		this.duenio = duenio;
	}
	
	public Duenio llevarMascota() {
		
		JOptionPane.showMessageDialog(null, "Bienvenido a la veterinaria, su mascota sera atendida por el profesional " + this.getNombreDeLaProfesional());
		JOptionPane.showMessageDialog(null, "Por favor ingrese sus datos para llamarlo cuando su mascota este lista");
		this.duenio.setNombre(JOptionPane.showInputDialog("Nombre: "));
		this.duenio.setTelefono(Integer.parseInt(JOptionPane.showInputDialog("Telefono: ")));
		
		return duenio;
		
	}
	
	public void examinarMascota() {
		this.mascota.setNombre(JOptionPane.showInputDialog("Ingrese nombre de la mascota"));
		this.mascota.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Ingrese edad")));
		this.mascota.setPeso(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso")));
		
		
		
			
			for (String vacunas : duenio.getVacunas()) {
				if (duenio.getVacunas().isEmpty()) {
					JOptionPane.showMessageDialog(null, "No tiene vacunas");
				} else {
					JOptionPane.showMessageDialog(null, "las siguiente vacunas son " + vacunas + "\n");
					break;
				}
			}
			String bien = JOptionPane.showInputDialog(null, "Esta bien?");
			if (bien.equalsIgnoreCase("si")) {
				JOptionPane.showMessageDialog(null, "Esta Bien" + this.mascota.getNombre() + " traigalo en 6 meses para otro control");
			} else if (bien.equalsIgnoreCase("no")) {
				JOptionPane.showMessageDialog(null, "Le vamos a tener que hacer unos estudios, su peso que es de " + this.mascota.getPeso() + "no es normal");
			}
			
	}

}
