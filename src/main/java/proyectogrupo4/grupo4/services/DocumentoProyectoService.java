package proyectogrupo4.grupo4.services;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proyectogrupo4.grupo4.entities.DocumentoProyecto;
import proyectogrupo4.grupo4.repository.DocumentoProyectoRepository;



@Service
public class DocumentoProyectoService {
    //atributo delimitador de acceso,tipo de dato,nombre del atributo
    @Autowired
    private DocumentoProyectoRepository documentoproyectoRepository;

    //Crud
    //crear
    //metod delimitador de acceso,tipo de dato que retorna,nombre del metodo/funcion
    public DocumentoProyecto save( DocumentoProyecto entity){
        return documentoproyectoRepository.save(entity);
    }

    //read
    public DocumentoProyecto findById(long id){
        return documentoproyectoRepository.findById(id).orElse(null);
    }

    //delete
    public void deleteById(long id){
        documentoproyectoRepository.deleteById(id);
    }

    //traer todo
   public List<DocumentoProyecto> findAll(){
       return documentoproyectoRepository.findAll();
   }
} 