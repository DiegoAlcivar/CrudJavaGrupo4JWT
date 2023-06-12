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
import proyectogrupo4.grupo4.entities.Programa;
import proyectogrupo4.grupo4.services.ProgramaService;

@RestController
@RequestMapping("api/programa")
@CrossOrigin("*")
@Tag(name = "Controlador Programa (Tabla Programa)")
public class ProgramaController {

    @Autowired
    private ProgramaService programaService;

    // crear
    // metod delimitador de acceso,tipo de dato que retorna,nombre del
    // metodo/funcion
    @PreAuthorize("hasAuthority('Programa_Crear')")
    @PostMapping("/crear")
    @Operation(summary = "Crea el programa, requiere el permiso Programa_Crear")
    public Programa save(@RequestBody Programa entity) {
        return programaService.save(entity);
    }

    // traer por id
    @PreAuthorize("hasAuthority('Programa_Listaid')")
    @GetMapping("/listar/{id}")
    @Operation(summary = "Obtener el programa por id, requiere el permiso Programa_Listaid")
    public Programa findById(@PathVariable long id) {
        return programaService.findById(id);
    }

    // traer todo
    @PreAuthorize("hasAuthority('Programa_Lista')")
    @GetMapping("/listar")
    @Operation(summary = "Obtener todos los programas , requiere el permiso Programa_Lista")

    public List<Programa> findAll() {
        return programaService.findAll();
    }

    // actualizar
    @PreAuthorize("hasAuthority('Programa_Actualizar')")
    @PutMapping("/actualizar")
    @Operation(summary = "Actualizar el programa, requiere el permiso Programa_Actualizar")
    public Programa update(@RequestBody Programa entity) {
        return programaService.save(entity);
    }

    // eliminar
    @PreAuthorize("hasAuthority('Programa_Eliminar')")
    @DeleteMapping("/eliminar/{id}")
    @Operation(summary = "Elimina el programa, requiere el permiso Programa_Eliminar")
    public void deleteById(@PathVariable long id) {
        programaService.deleteById(id);
    }

}