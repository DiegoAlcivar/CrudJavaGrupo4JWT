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
import proyectogrupo4.grupo4.entities.Linea;
import proyectogrupo4.grupo4.services.LineaService;

@RestController
@RequestMapping("api/lineainves")
@CrossOrigin("*")
@Tag(name = "Controlador Linea Investigacion (Tabla LineaInvestigacion)")
public class LineaController {

    @Autowired
    private LineaService lineaService;

    // crear
    // metod delimitador de acceso,tipo de dato que retorna,nombre del
    // metodo/funcion
    @PreAuthorize("hasAuthority('Linea_Crear')")
    @PostMapping("/create")
    @Operation(summary = "Crea las Lineas de investigacion, requiere el permiso Linea_Crear")
    public Linea save(@RequestBody Linea entity) {
        return lineaService.save(entity);
    }

    // traer por id
    @PreAuthorize("hasAuthority('Linea_Listaid')")
    @GetMapping("/lista/{id}")
    @Operation(summary = "obtiene las Lineas de investigacion por id, requiere el permiso Linea_Listaid")
    public Linea findById(@PathVariable long id) {
        return lineaService.findById(id);
    }

    // traer todo
    @PreAuthorize("hasAuthority('Linea_Lista')")
    @GetMapping("/lista")
    @Operation(summary = "Obtiene todas las Lineas de investigacion , requiere el permiso Linea_Lista")
    public List<Linea> findAll() {
        return lineaService.findAll();
    }

    // actualizar
    @PreAuthorize("hasAuthority('Linea_Actualizar')")
    @PutMapping("/actualizar")
    @Operation(summary = "Actualiza todas las Lineas de investigacion , requiere el permiso Linea_Actualizar")
    public Linea update(@RequestBody Linea entity) {
        return lineaService.save(entity);
    }

    // eliminar
    @PreAuthorize("hasAuthority('Linea_Eliminar')")
    @DeleteMapping("/eliminar/{id}")
    @Operation(summary = "Elimina las Lineas de investigacion , requiere el permiso Linea_Eliminar")
    public void deleteById(@PathVariable long id) {
        lineaService.deleteById(id);
    }

}