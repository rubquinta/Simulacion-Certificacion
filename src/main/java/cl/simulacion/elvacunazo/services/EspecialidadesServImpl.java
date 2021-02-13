package cl.simulacion.elvacunazo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.simulacion.elvacunazo.model.Especialidades;
import cl.simulacion.elvacunazo.repositorios.IEspecialidadesRepositorio;

@Service
public class EspecialidadesServImpl implements IEspecialidadesService{

	@Autowired
	IEspecialidadesRepositorio especialidadesRepo;
	
	
	@Override
	public List<Especialidades> getAllEspacilidades() {
		
		return especialidadesRepo.findAll();
	}
	
	

}
