package proyectogrupo4.grupo4.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import proyectogrupo4.grupo4.entities.Linea;

public interface LineaRepository extends CrudRepository<Linea, Long> {

    List<Linea> findAll();

}
