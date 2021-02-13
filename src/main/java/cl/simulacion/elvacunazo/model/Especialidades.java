package cl.simulacion.elvacunazo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Especialidades {
	
	@Id
	public int idEspecialidad;
	
	public String descripcion;
	
	public Especialidades() {
		
	}

	public Especialidades(int idEspecialidad, String descripcion) {
		super();
		this.idEspecialidad = idEspecialidad;
		this.descripcion = descripcion;
	}

	public int getIdEspecialidad() {
		return idEspecialidad;
	}

	public void setIdEspecialidad(int idEspecialidad) {
		this.idEspecialidad = idEspecialidad;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	
	

}
