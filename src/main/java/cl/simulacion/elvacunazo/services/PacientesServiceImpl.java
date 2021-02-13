package cl.simulacion.elvacunazo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.simulacion.elvacunazo.model.Pacientes;
import cl.simulacion.elvacunazo.repositorios.IPacientesRepositorio;

@Service
public class PacientesServiceImpl implements IPacientesService{

	@Autowired
	IPacientesRepositorio pacientesRepo;
	
	
	@Override
	public List<Pacientes> getAllPacientes() {
		// TODO Auto-generated method stub
		return pacientesRepo.findAll();
	}

}
