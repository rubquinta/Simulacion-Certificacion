package cl.simulacion.elvacunazo.services;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;

import cl.simulacion.elvacunazo.model.Pacientes;
import cl.simulacion.elvacunazo.repositorios.IPacientesRepositorio;

public interface IPacientesService   {
	
	List<Pacientes> getAllPacientes();
	
	@Query(value = "SELECT PACIENTES.NOMBRE FROM PACIENTES ORDER BY PACIENTES.NOMBRE")
	List<Pacientes> findAllPacients();

}
