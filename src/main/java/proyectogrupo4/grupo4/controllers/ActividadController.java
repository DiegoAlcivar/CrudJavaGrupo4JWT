package proyectogrupo4.grupo4.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import proyectogrupo4.grupo4.entities.Actividad;
import proyectogrupo4.grupo4.services.ActividadService;

@RestController
@RequestMapping("api/actividad")
@CrossOrigin("*")
@Tag(name = "Controlador Actividad (Tabla Actividad)")
public class ActividadController {

    @Autowired
    private ActividadService actividadService;

    // crear
    // metod delimitador de acceso,tipo de dato que retorna,nombre del
    // metodo/funcion
    @PreAuthorize("hasAuthority('Actividad_Crear')")
    @PostMapping("/create")
    @Operation(summary = "Crear la actividad, requiere el permiso Actividad_Crear")
    public Actividad save(@RequestBody Actividad entity) {
        return actividadService.save(entity);
    }

    // traer por id
    @PreAuthorize("hasAuthority('Actividad_Listaid')")
    @GetMapping("/lista/{id}")
    @Operation(summary = "Obtener la actividad por id, requiere el permiso Actividad_Listaid")
    public Actividad findById(@PathVariable long id) {
        return actividadService.findById(id);
    }

    // traer todo
    @PreAuthorize("hasAuthority('Actividad_Lista')")
    @GetMapping("/lista")
    @Operation(summary = "Obtener todas las actividades, requiere el permiso Actividad_Lista")

    public List<Actividad> findAll() {
        return actividadService.findAll();
    }

    // actualizar
    @PreAuthorize("hasAuthority('Actividad_Actualizar')")
    @PutMapping("/actualizar")
    @Operation(summary = "Actualizar la actividad, requiere el permiso Actividad_Actualizar")
    public Actividad update(@RequestBody Actividad entity) {
        return actividadService.save(entity);
    }

    // eliminar
    @PreAuthorize("hasAuthority('Actividad_Eliminar')")
    @DeleteMapping("/eliminar/{id}")
    @Operation(summary = "Eliminar la Actividad, requiere el permiso Actividad_Eliminar")
    public void deleteById(@PathVariable long id) {
        actividadService.deleteById(id);
    }

}
