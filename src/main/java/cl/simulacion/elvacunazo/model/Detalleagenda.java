package cl.simulacion.elvacunazo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Immutable;
import org.hibernate.annotations.Subselect;

@Entity
@Immutable
@Subselect("select rownum as id, pacientes.nombre as nombreP, pacientes.apellido as apellidoP,\r\n"
		+ " doctores.nombre as nombreD, doctores.apellido as apellidoD,\r\n"
		+ " especialidades.descripcion as Especialidad, agendas.fecha,\r\n"
		+ " agendas.horadesde from pacientes \r\n"
		+ " INNER JOIN agendas \r\n"
		+ " ON pacientes.idPaciente = agendas.idpaciente\r\n"
		+ " INNER JOIN doctores\r\n"
		+ " ON agendas.idDoctor = doctores.iddoctor\r\n"
		+ " INNER JOIN especialidades\r\n"
		+ " ON doctores.idespecialidad = especialidades.idespecialidad\r\n"
		+ " ORDER BY pacientes.nombre asc")
public class Detalleagenda {
	
	@Id
	private int id;
	
	private String nombreP;
	
	private String apellidoP;
	
	private String nombreD;
	
	private String apellidoD;

	private String especialidad;
	
	private String fecha;
	
	private String horadesde;

	public Detalleagenda() {
		super();
	}

	public Detalleagenda(int id, String nombreP, String apellidoP, String nombreD, String apellidoD,
			String especialidad, String fecha, String horadesde) {
		super();
		this.id = id;
		this.nombreP = nombreP;
		this.apellidoP = apellidoP;
		this.nombreD = nombreD;
		this.apellidoD = apellidoD;
		this.especialidad = especialidad;
		this.fecha = fecha;
		this.horadesde = horadesde;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombreP() {
		return nombreP;
	}

	public void setNombreP(String nombreP) {
		this.nombreP = nombreP;
	}

	public String getApellidoP() {
		return apellidoP;
	}

	public void setApellidoP(String apellidoP) {
		this.apellidoP = apellidoP;
	}

	public String getNombreD() {
		return nombreD;
	}

	public void setNombreD(String nombreD) {
		this.nombreD = nombreD;
	}

	public String getApellidoD() {
		return apellidoD;
	}

	public void setApellidoD(String apellidoD) {
		this.apellidoD = apellidoD;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getHoradesde() {
		return horadesde;
	}

	public void setHoradesde(String horadesde) {
		this.horadesde = horadesde;
	}
	
	
}
