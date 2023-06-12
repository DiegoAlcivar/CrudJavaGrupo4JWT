package proyectogrupo4.grupo4.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proyectogrupo4.grupo4.entities.Programa;
import proyectogrupo4.grupo4.repository.ProgramaRepository;



@Service
public class ProgramaService {
    //atributo delimitador de acceso,tipo de dato,nombre del atributo
    @Autowired
    private ProgramaRepository programaRepository;

    //Crud
    //crear
    //metod delimitador de acceso,tipo de dato que retorna,nombre del metodo/funcion
    public Programa save( Programa entity){
        return programaRepository.save(entity);
    }

    //read
    public Programa findById(long id){
        return programaRepository.findById(id).orElse(null);
    }

    //delete
    public void deleteById(long id){
        programaRepository.deleteById(id);
    }

    //traer todo
   public List<Programa> findAll(){
       return programaRepository.findAll();
   }
} 