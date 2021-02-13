package cl.simulacion.CalculosTiemposDiarios;

import java.util.ArrayList;
import java.util.List;

public class DemoConsola {

	public static void main(String[] args) {

		System.out.println("-------------------------------------");
		System.out.println("Demostración algoritmo cálculo tiempo");
		System.out.println("-------------------------------------" + "\n");
		
		AtencionRegular atencion1 = new AtencionRegular(1, "Neurologia" );		
		AtencionRegular atencion2 = new AtencionRegular(2, "Proctologia");
		AtencionRegular atencion3 = new AtencionRegular(3, "Traumatologia");
		AtencionRegular atencion4 = new AtencionRegular(4, "Gastroenterologia");
		AtencionRegular atencion5 = new AtencionRegular(5, "Cardiologia");
		
  
		System.out.println("Atención regular 1: " + atencion1.nombreEspecialidad +
				"tiempo total: " + atencion1.calcularTiempo() + "\n");
		System.out.println("Atención regular 2: " + atencion1.nombreEspecialidad +
				"tiempo total: " + atencion2.calcularTiempo() + "\n");
		System.out.println("Atención regular 3: " + atencion1.nombreEspecialidad +
				"tiempo total: " + atencion3.calcularTiempo() + "\n");
		System.out.println("Atención regular 4: " + atencion1.nombreEspecialidad +
				"tiempo total: " + atencion4.calcularTiempo() + "\n");
		System.out.println("Atención regular 5: " + atencion1.nombreEspecialidad +
				"tiempo total: " + atencion5.calcularTiempo() + "\n");
		
		
		AtencionUrgencia atencionUrg1 = new AtencionUrgencia(5, 3);
		AtencionUrgencia atencionUrg2 = new AtencionUrgencia(10, 2);
		AtencionUrgencia atencionUrg3 = new AtencionUrgencia(24, 1);
		AtencionUrgencia atencionUrg4 = new AtencionUrgencia(5, 2);
		AtencionUrgencia atencionUrg5 = new AtencionUrgencia(15, 1);
		
		
		
		System.out.println("Atencion de urgencia 1: Espera de " + 
				atencionUrg1.tiempoEspera + " minutos, severidad tipo " +
				atencionUrg1.severidad + " " + atencionUrg1.nombreSeveridad() + "\n"	);
		
		System.out.println("Atencion de urgencia 2: Espera de " + 
				atencionUrg2.tiempoEspera + " minutos, severidad tipo " +
				atencionUrg2.severidad + " " + atencionUrg2.nombreSeveridad() + "\n"	);
		
		System.out.println("Atencion de urgencia 1: Espera de " + 
				atencionUrg3.tiempoEspera + " minutos, severidad tipo " +
				atencionUrg3.severidad + " " + atencionUrg3.nombreSeveridad() + "\n"	);
		
		System.out.println("Atencion de urgencia 1: Espera de " + 
				atencionUrg4.tiempoEspera + " minutos, severidad tipo " +
				atencionUrg4.severidad + " " + atencionUrg4.nombreSeveridad() + "\n"	);
		
		System.out.println("Atencion de urgencia 1: Espera de " + 
				atencionUrg5.tiempoEspera + " minutos, severidad tipo " +
				atencionUrg5.severidad + " " + atencionUrg5.nombreSeveridad()+ "\n");
		
		List<Integer> tiempos = new ArrayList<Integer>();
		
		tiempos.add(atencion1.calcularTiempo());
		tiempos.add(atencion2.calcularTiempo());
		tiempos.add(atencion3.calcularTiempo());
		tiempos.add(atencion4.calcularTiempo());
		tiempos.add(atencion5.calcularTiempo());
		tiempos.add(atencionUrg1.calcularTiempo());
		tiempos.add(atencionUrg2.calcularTiempo());
		tiempos.add(atencionUrg3.calcularTiempo());
		tiempos.add(atencionUrg4.calcularTiempo());
		tiempos.add(atencionUrg5.calcularTiempo());
		
		int tiempoAtenciones = 0;
		
		for(int tiempoAt : tiempos) {
			
			tiempoAtenciones += tiempoAt;
			
		}
		
		System.out.println("Tiempo total de atenciones en el día: " + tiempoAtenciones + " minutos \n");
		
		System.out.println(reglaGeneral(tiempoAtenciones));
	
		
		
		
	}
	
	public static String reglaGeneral(int tiempoAtenciones) {
		
		if(tiempoAtenciones < 300) {
			
			return "Las atenciones del día NO superan el umbral "
					+ "establecido por la clínica\n";
			
		} else {
			
			return "Las atenciones del día SI superan el umbral "
					+ "establecido por la clínica \n";
		}
		
		 
	}
	
	

}
