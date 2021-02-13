package cl.simulacion.elvacunazo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Doctores {
	
	@Id
	public int idDoctor;
	
	public int rutDontor;
	
	public String nombre;
	
	public String apellido;
	
	public int idEspecialidad;

	public Doctores() {
		
	}
	
	public Doctores(int idDoctor, int rutDontor, String nombre, String apellido, int idEspecialidad) {
		super();
		this.idDoctor = idDoctor;
		this.rutDontor = rutDontor;
		this.nombre = nombre;
		this.apellido = apellido;
		this.idEspecialidad = idEspecialidad;
	}

	public int getIdDoctor() {
		return idDoctor;
	}

	public void setIdDoctor(int idDoctor) {
		this.idDoctor = idDoctor;
	}

	public int getRutDontor() {
		return rutDontor;
	}

	public void setRutDontor(int rutDontor) {
		this.rutDontor = rutDontor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getIdEspecialidad() {
		return idEspecialidad;
	}

	public void setIdEspecialidad(int idEspecialidad) {
		this.idEspecialidad = idEspecialidad;
	}
	
	
	
	
	

}
