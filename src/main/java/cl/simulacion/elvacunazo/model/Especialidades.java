package cl.simulacion.elvacunazo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Immutable;
import org.hibernate.annotations.Subselect;

@Entity
@Immutable
@Subselect("  select especialidades.idespecialidad, especialidades.descripcion from especialidades order by especialidades.descripcion asc")
public class Especialidades {
	
	@Id
	@Column(name="IDESPECIALIDAD")
	public int idEspecialidad;
	@Column(name="DESCRIPCION")
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
