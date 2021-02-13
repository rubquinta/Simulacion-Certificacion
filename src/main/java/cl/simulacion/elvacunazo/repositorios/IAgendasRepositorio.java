package cl.simulacion.elvacunazo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.simulacion.elvacunazo.model.Agendas;

public interface IAgendasRepositorio extends JpaRepository<Agendas, Integer>{

}
