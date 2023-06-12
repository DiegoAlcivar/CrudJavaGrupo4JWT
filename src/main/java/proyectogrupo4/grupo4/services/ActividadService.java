package proyectogrupo4.grupo4.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proyectogrupo4.grupo4.entities.Actividad;
import proyectogrupo4.grupo4.repository.ActividadRepository;


@Service
public class ActividadService {
    //atributo delimitador de acceso,tipo de dato,nombre del atributo
    @Autowired
    private ActividadRepository actividadRepository;

    //Crud
    //crear
    //metod delimitador de acceso,tipo de dato que retorna,nombre del metodo/funcion
    public Actividad save( Actividad entity){
        return actividadRepository.save(entity);
    }

    //read
    public Actividad findById(long id){
        return actividadRepository.findById(id).orElse(null);
    }

    //delete
    public void deleteById(long id){
        actividadRepository.deleteById(id);
    }

    //traer todo
   public List<Actividad> findAll(){
       return actividadRepository.findAll();
   }

public Actividad actualizarActividad(Actividad actividadExistente) {
	return null;
}
} 