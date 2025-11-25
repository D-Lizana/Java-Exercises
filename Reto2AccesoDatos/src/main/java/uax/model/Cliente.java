package uax.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String apellido;
    private String dni;

    @OneToMany(mappedBy = "cliente")
    private List<Coche> cochesComprados;


    @Override
    public String toString() {
        return nombre + " " + apellido + ", " + dni;
    }
}
