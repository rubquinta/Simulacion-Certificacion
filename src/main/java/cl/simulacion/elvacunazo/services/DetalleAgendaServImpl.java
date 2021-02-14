package cl.simulacion.elvacunazo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.simulacion.elvacunazo.model.Detalleagenda;
import cl.simulacion.elvacunazo.repositorios.IDetalleAgenda;

@Service
public class DetalleAgendaServImpl implements IDetalleAgendaService{

	@Autowired
	IDetalleAgenda detalleagendaRepo;
	
	
	@Override
	public List<Detalleagenda> getAllAgenda() {
		return detalleagendaRepo.findAll();
	}

}
