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
import proyectogrupo4.grupo4.entities.DocumentoProyecto;
import proyectogrupo4.grupo4.services.DocumentoProyectoService;

@RestController
@RequestMapping("api/documentoproyecto")
@CrossOrigin("*")
@Tag(name = "Controlador documento proyecto (Tabla DocumentoProyecto)")
public class DocumentoProyectoController {

    @Autowired
    private DocumentoProyectoService documentoproyectoService;

    // crear
    // metod delimitador de acceso,tipo de dato que retorna,nombre del
    // metodo/funcion
    @PreAuthorize("hasAuthority('Documento_Crear')")
    @PostMapping("/create")
    @Operation(summary = "Crea los documentosProyectos, requiere el permiso Documento_Crear")
    public DocumentoProyecto save(@RequestBody DocumentoProyecto entity) {
        return documentoproyectoService.save(entity);
    }

    // traer por id
    @PreAuthorize("hasAuthority('Documento_Listaid')")
    @GetMapping("/lista/{id}")
    @Operation(summary = "Obtiene los documentosProyectos por id, requiere el permiso Documento_Listaid")

    public DocumentoProyecto findById(@PathVariable long id) {
        return documentoproyectoService.findById(id);
    }

    // traer todo
    @PreAuthorize("hasAuthority('Documento_LeerTodos')")
    @GetMapping("/listas")
    @Operation(summary = "Obtiene todos los documentosProyectos, requiere el permiso Documentos_LeerTodos")
    public List<DocumentoProyecto> findAll() {
        return documentoproyectoService.findAll();
    }

    // actualizar
    @PreAuthorize("hasAuthority('Documento_Actualizar')")
    @PutMapping("/actualizar")
    @Operation(summary = "Actualiza a los documentosProyectos, requiere el permiso Documentos_Actualizar")
    public DocumentoProyecto update(@RequestBody DocumentoProyecto entity) {
        return documentoproyectoService.save(entity);
    }

    // eliminar
    @PreAuthorize("hasAuthority('Documento_Eliminar')")
    @DeleteMapping("/eliminar/{id}")
    @Operation(summary = "Elimina a los documentosProyectos, requiere el permiso Documentos_Eliminar")
    public void deleteById(@PathVariable long id) {
        documentoproyectoService.deleteById(id);
    }

}