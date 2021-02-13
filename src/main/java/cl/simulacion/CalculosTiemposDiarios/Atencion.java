package cl.simulacion.CalculosTiemposDiarios;

public class Atencion implements InterfaceAtencion{

	public String paciente;
	
	public String doctor;
	
	public int duracion;
	
	public Atencion() {
		
	} 
	
	public Atencion(String paciente, String doctor, int duracion) {
		 
		this.paciente = paciente;
		this.doctor = doctor;
		this.duracion = duracion;
	}

	public String getPaciente() {
		return paciente;
	}

	public void setPaciente(String paciente) {
		this.paciente = paciente;
	}

	public String getDoctor() {
		return doctor;
	}


	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}


	@Override
	public int calcularTiempo() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public int tiempoTotal() {
		
		int total=0;
		
		return total;
	}

}
