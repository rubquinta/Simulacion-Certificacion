package cl.simulacion.elvacunazo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import cl.simulacion.CalculosTiemposDiarios.AtencionRegular;
import cl.simulacion.CalculosTiemposDiarios.AtencionUrgencia;


public class TestClinicaELVacunazo {
	
	@Test
	public void test1() {
		
		 AtencionRegular atencionReg = new AtencionRegular(1, "Neurologia");
		
		assertEquals(25, atencionReg.calcularTiempo());
	}
	
	@Test
	public void test2() {
		
		 AtencionRegular atencionReg = new AtencionRegular(5, "gastroenterologia");
		
		assertEquals(20, atencionReg.calcularTiempo());
	}
	
	@Test
	public void tes3() {
		
		AtencionUrgencia atencionUrg = new AtencionUrgencia(5, 3);
		
		assertEquals(50, atencionUrg.calcularTiempo());
	}
	
	@Test
	public void tes4() {
		
		AtencionUrgencia atencionUrg = new AtencionUrgencia(20, 2);
		
		assertEquals(45, atencionUrg.calcularTiempo());
	}
	
	

}
