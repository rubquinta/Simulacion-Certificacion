package cl.simulacion.CalculosTiemposDiarios;

public class AtencionUrgencia extends Atencion{
	
	public int tiempoEspera;
	
	public int severidad;
	
		
	
	public AtencionUrgencia() {
		
	}
	
	
	public AtencionUrgencia(int tiempoEspera, int severidad) {
		super();
		this.tiempoEspera = tiempoEspera;
		this.severidad = severidad;
	}


	

	public int getTiempoEspera() {
		return tiempoEspera;
	}

	public void setTiempoEspera(int tiempoEspera) {
		this.tiempoEspera = tiempoEspera;
	}

	public int getSeveridad() {
		return severidad;
	}

	public void setSeveridad(int severidad) {
		this.severidad = severidad;
	}
	
	public String nombreSeveridad() {
		
		String severity = "";
		
		if (severidad == 1) {
			
			severity = "(normal)";
			
		}else {
			
			if(severidad ==2) {
				
				severity = "(grave)";
				
			}else {
				if(severidad == 3) {
					
					severity = "(muy grave)";
					
				}
			}
		}
		return severity;
	}
		
	
	@Override
	public int calcularTiempo() {		
		
		
		if(severidad == 1) {
			
			duracion = 15 + 5 + tiempoEspera;
		} else {
			if(severidad == 2) {
				
				duracion = 15 + 10 + tiempoEspera;
			}else {
				
				if(severidad == 3) {
					
					duracion = 15 +30 + tiempoEspera;
				}
			}
		}
		
				
		
		
		return duracion;
	}
	
	

}
