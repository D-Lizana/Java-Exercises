package uax.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "coches")
public class Coche {
    @Column(name = "marca", length = 20, nullable = false)
    private String marca;

    @Column(name = "modelo")
    private String modelo;

    @Column(name = "anno_fabricacion")
    private int anno_fabricacion;

    @Column(name = "precio")
    private Double precio;

    @Override
    public String toString() {
        return marca + ", " + modelo + ", " + anno_fabricacion + ", " + precio + "€";
    }
}
