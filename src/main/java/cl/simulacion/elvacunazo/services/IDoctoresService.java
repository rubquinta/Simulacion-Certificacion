package cl.simulacion.elvacunazo.services;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.simulacion.elvacunazo.model.Doctores;

public interface IDoctoresService {
	
	List<Doctores> getAllDoctores();

}
