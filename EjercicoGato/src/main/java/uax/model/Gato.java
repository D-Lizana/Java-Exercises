package uax.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor

// ETIQUETAS OBLIGATORIAS PARA EL XML y CLASE SERIALIZABLE
@XmlRootElement(name = "gato")
@XmlAccessorType(XmlAccessType.FIELD)

// ETIQUETAS PARA EL MAPEO DE HIBERNATE
@Entity
@Table(name = "gato")
public class Gato implements Serializable {

    // @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    // private int id;

    // HIBERNATE SABE POR DEFECTO QUE LOS ATRIBUTOS SON COLUMNAS PERO SE PUEDEN PERSONALIZAR
    @Column(name = "chip")
    private int chip;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "raza")
    private String raza;
}
