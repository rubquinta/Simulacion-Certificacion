package cl.simulacion.elvacunazoApiRest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cl.simulacion.elvacunazo.model.Agendas;
import cl.simulacion.elvacunazo.services.IAgendasService;
import cl.simulacion.elvacunazo.services.IDoctoresService;
import cl.simulacion.elvacunazo.services.IEspecialidadesService;
import cl.simulacion.elvacunazo.services.IPacientesService;

@RestController
public class RestElVacunazoController {
	

	@Autowired
	IEspecialidadesService especialidadesServ;
	
	@Autowired
	IAgendasService agendaServ;
	
	@Autowired
	IPacientesService pacientesServ;
	
	@Autowired
	IDoctoresService doctoresServ;
	
	@RequestMapping(value = "/api/agendas", method = RequestMethod.GET)
	public List<Agendas> home(Model model) {
		
		model.addAttribute("agendas", agendaServ.getAllAgendas());
		
		model.addAttribute("pacientes", pacientesServ.getAllPacientes());
		
		model.addAttribute("doctores", doctoresServ.getAllDoctores());		
		
		model.addAttribute("especialidades", especialidadesServ.getAllEspacilidades() );
		
		return agendaServ.getAllAgendas();
	}

}
