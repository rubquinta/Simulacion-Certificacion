package cl.simulacion.elvacunazo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PACIENTES")
public class Pacientes {
	
	@Id
	@Column(name="IDPACIENTE")
	public int idPaciente;
	@Column(name="RUTPACIENTE")
	public String rutPaciente;
	@Column(name="NOMBRE")
	public String nombre;
	@Column(name="APELLIDO")
	public String apellido;
	
	public Pacientes() {
		
	}

	 

	public Pacientes(int idPaciente, String rutPaciente, String nombre, String apellido) {
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

	 

	public String getRutPaciente() {
		return rutPaciente;
	}



	public void setRutPaciente(String rutPaciente) {
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
