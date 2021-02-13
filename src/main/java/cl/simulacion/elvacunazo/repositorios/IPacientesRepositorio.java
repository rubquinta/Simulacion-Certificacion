package cl.simulacion.elvacunazo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.simulacion.elvacunazo.model.Pacientes;

public interface IPacientesRepositorio extends JpaRepository<Pacientes, Integer>{

}
