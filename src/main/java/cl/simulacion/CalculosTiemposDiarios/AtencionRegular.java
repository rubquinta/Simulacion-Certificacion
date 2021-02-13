package cl.simulacion.CalculosTiemposDiarios;

public class AtencionRegular extends Atencion{

	public int idEspecialidad;
	
	public String nombreEspecialidad;

	public int getIdEspecialidad() {
		return idEspecialidad;
	}

	public void setIdEspecialidad(int idEspecialidad) {
		this.idEspecialidad = idEspecialidad;
	}
	
	
	public String getNombreEspecialidad() {
		return nombreEspecialidad;
	}

	public void setNombreEspecialidad(String nombreEspecialidad) {
		this.nombreEspecialidad = nombreEspecialidad;
	}

	public AtencionRegular() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	 
	public AtencionRegular(int idEspecialidad, String nombreEspecialidad) {
		super();
		this.idEspecialidad = idEspecialidad;
		this.nombreEspecialidad = nombreEspecialidad;
	}

	public AtencionRegular(String paciente, String doctor, int duracion, int idEspecialidad, String nombreEspecialidad) {
		super(paciente, doctor, duracion);
		this.idEspecialidad = idEspecialidad;
		this.nombreEspecialidad = nombreEspecialidad;
	}

	@Override
	public int calcularTiempo() {		
		 
		
		if(nombreEspecialidad.equalsIgnoreCase("cardiologia") || nombreEspecialidad.equalsIgnoreCase("neurologia")) {
			
			duracion = 25;
			
		} else {
			if( nombreEspecialidad.equalsIgnoreCase("traumatologia") || nombreEspecialidad.equalsIgnoreCase("gastroenterologia")) {
				
				duracion = 20;
				
			}else {
				
				duracion = 15;
			}		
			
		} 
		
		return duracion;
	}
	
	
	
}
