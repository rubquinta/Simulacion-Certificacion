package cl.simulacion.elvacunazo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pacientes {
	
	@Id
	public int idPaciente;
	
	public int rutPaciente;
	
	public String nombre;
	
	public String apellido;
	
	public Pacientes() {
		
	}

	public Pacientes(int idPaciente, int rutPaciente, String nombre, String apellido) {
		super();
		this.idPaciente = idPaciente;
		this.rutPaciente = rutPaciente;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public int getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}

	public int getRutPaciente() {
		return rutPaciente;
	}

	public void setRutPaciente(int rutPaciente) {
		this.rutPaciente = rutPaciente;
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
	
	
	
	
	
	

}
