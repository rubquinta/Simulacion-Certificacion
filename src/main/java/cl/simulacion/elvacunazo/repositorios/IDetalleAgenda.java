package cl.simulacion.elvacunazo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.simulacion.elvacunazo.model.Detalleagenda;

public interface IDetalleAgenda extends JpaRepository<Detalleagenda, Integer>{

}
