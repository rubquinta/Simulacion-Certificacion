package cl.simulacion.elvacunazo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.simulacion.elvacunazo.model.Agendas;
import cl.simulacion.elvacunazo.repositorios.IAgendasRepositorio;

@Service
public class AgendasServImpl implements IAgendasService{

	@Autowired
	IAgendasRepositorio agendasRepositorio;
	
	@Override
	public List<Agendas> getAllAgendas() {
		// TODO Auto-generated method stub
		return agendasRepositorio.findAll();
	}

}
