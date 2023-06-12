package proyectogrupo4.grupo4.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "documentoproyecto")
public class DocumentoProyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombre;
    private String justificacion;
    private String antecedentes;

    @ManyToOne
    private Programa programa;

}
