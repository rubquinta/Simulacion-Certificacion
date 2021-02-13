package cl.simulacion.elvacunazo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="AGENDAS")
public class Agendas {

	@Id
	@Column(name="IDPACIENTE")
	public int idPaciente;
	@Column(name="IDDOCTOR")
	public int idDoctor;
	@Column(name="IDAGENDA")
	public int idAgenda;
	@Column(name="FECHA")
	public String fecha;
	@Column(name="HORADESDE")
	public String horadesde;
	@Column(name="DURACION")
	public int duracion;

	public Agendas() {
	}
	
	public Agendas(int idPaciente, int idDoctor, int idAgenda, String fecha, String horadesde, int duracion) {
		super();
		this.idPaciente = idPaciente;
		this.idDoctor = idDoctor;
		this.idAgenda = idAgenda;
		this.fecha = fecha;
		this.horadesde = horadesde;
		this.duracion = duracion;
	}

	public int getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}

	public int getIdDoctor() {
		return idDoctor;
	}

	public void setIdDoctor(int idDoctor) {
		this.idDoctor = idDoctor;
	}

	public int getIdAgenda() {
		return idAgenda;
	}

	public void setIdAgenda(int idAgenda) {
		this.idAgenda = idAgenda;
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

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	
	
	
	
}
