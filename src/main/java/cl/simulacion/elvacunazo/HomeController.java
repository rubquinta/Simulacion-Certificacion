package cl.simulacion.elvacunazo;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cl.simulacion.elvacunazo.repositorios.IAgendasRepositorio;
import cl.simulacion.elvacunazo.services.IAgendasService;
import cl.simulacion.elvacunazo.services.IDoctoresService;
import cl.simulacion.elvacunazo.services.IEspecialidadesService;
import cl.simulacion.elvacunazo.services.IPacientesService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Autowired
	IEspecialidadesService especialidadesServ;
	
	@Autowired
	IAgendasService agendaServ;
	
	@Autowired
	IPacientesService pacientesServ;
	
	@Autowired
	IDoctoresService doctoresServ;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		
		model.addAttribute("agendas", agendaServ.getAllAgendas());
		
		/*
		 * Se hizo esta funcion similar pero intentando usar un Query que organice por nombre,
		 * no funcionó, falta reforzar querys específicas o uso de JPQL
		 */
		model.addAttribute("pacientes", pacientesServ.findAllPacients());
		
		model.addAttribute("doctores", doctoresServ.getAllDoctores());		
		
		model.addAttribute("especialidades", especialidadesServ.getAllEspacilidades() );
		
		return "listadocitas";
	}
	
}
