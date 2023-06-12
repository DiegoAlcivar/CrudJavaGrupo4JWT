package proyectogrupo4.grupo4.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import proyectogrupo4.grupo4.entities.Actividad;

public interface ActividadRepository extends CrudRepository<Actividad, Long> {

    List<Actividad> findAll();

}