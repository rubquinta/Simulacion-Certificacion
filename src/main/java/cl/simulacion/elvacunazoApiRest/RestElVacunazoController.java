package cl.simulacion.elvacunazoApiRest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController; 
import cl.simulacion.elvacunazo.model.Detalleagenda;
import cl.simulacion.elvacunazo.repositorios.IDetalleAgenda; 
import cl.simulacion.elvacunazo.services.IDetalleAgendaService; 
import cl.simulacion.elvacunazo.services.IEspecialidadesService; 

@RestController
public class RestElVacunazoController {
	

	@Autowired
	IDetalleAgendaService detalleagendaServ; 
	
	@RequestMapping(value = "/api/agendas", method = RequestMethod.GET)
	public List<Detalleagenda> home(Model model) { 
		
		return detalleagendaServ.getAllAgenda();
	}

}
