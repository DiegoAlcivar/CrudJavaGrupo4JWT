package proyectogrupo4.grupo4.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import proyectogrupo4.grupo4.entities.DocumentoProyecto;

public interface DocumentoProyectoRepository extends CrudRepository<DocumentoProyecto, Long> {

    List<DocumentoProyecto> findAll();

}
