package cl.simulacion.elvacunazo.services;

import java.util.List;

import cl.simulacion.elvacunazo.repositorios.IPacientesRepositorio;

public interface IPacientesService   {
	
	List<Pacientes> getAllPacientes();

}
