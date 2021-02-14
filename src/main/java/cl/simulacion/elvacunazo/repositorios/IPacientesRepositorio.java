package cl.simulacion.elvacunazo.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import cl.simulacion.elvacunazo.model.Pacientes;

public interface IPacientesRepositorio extends JpaRepository<Pacientes, Integer>{
	
	
	

}
