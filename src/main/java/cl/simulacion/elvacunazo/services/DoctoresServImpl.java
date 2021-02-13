package cl.simulacion.elvacunazo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.simulacion.elvacunazo.model.Doctores;
import cl.simulacion.elvacunazo.repositorios.IDoctoresRepositorio;

@Service
public class DoctoresServImpl implements  IDoctoresService{

	
	@Autowired
	IDoctoresRepositorio doctoresRepositorio;
	
	@Override
	public List<Doctores> getAllDoctores() {
		// TODO Auto-generated method stub
		return doctoresRepositorio.findAll();
	}
	
	

}
