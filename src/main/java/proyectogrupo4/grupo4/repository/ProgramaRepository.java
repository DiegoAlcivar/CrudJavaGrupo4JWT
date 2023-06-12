package proyectogrupo4.grupo4.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import proyectogrupo4.grupo4.entities.Programa;

public interface ProgramaRepository extends CrudRepository<Programa, Long> {

    List<Programa> findAll();

}
