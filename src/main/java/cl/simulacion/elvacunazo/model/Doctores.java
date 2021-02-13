package cl.simulacion.elvacunazo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DOCTORES")
public class Doctores {
	
	@Id
	@Column(name="IDDOCTOR")
	public int idDoctor;
	@Column(name="RUTDOCTOR")	
	public String rutDoctor;
	@Column(name="NOMBRE")
	public String nombre;
	@Column(name="APELLIDO")
	public String apellido;
	@Column(name="IDESPECIALIDAD")
	public int idEspecialidad;

	public Doctores() {
		
	}
	
	 

	public Doctores(int idDoctor, String rutDoctor, String nombre, String apellido, int idEspecialidad) {
		super();
		this.idDoctor = idDoctor;
		this.rutDoctor = rutDoctor;
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

	 

	public String getRutDoctor() {
		return rutDoctor;
	}



	public void setRutDoctor(String rutDoctor) {
		this.rutDoctor = rutDoctor;
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
