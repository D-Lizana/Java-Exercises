package uax.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "coche")
public class Coche {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    private String marca;
    private String modelo;

    @Column(name = "anno_fabricacion")
    private int annoFabricacion;

    private Double precio;
    private boolean vendido = false;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    public Coche(String marca, String modelo, int annoFabricacion, Double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.annoFabricacion = annoFabricacion;
        this.precio = precio;
    }

    @Override
    public String toString() {
        if(!vendido){
            return "ID: "+ id + ", " + marca + ", " + modelo + ", " + annoFabricacion + ", " + precio + "€, Disponible.";
        }
        else{
            return marca + ", " + modelo + ", " + annoFabricacion + ", " + precio + "€, vendido a " + cliente;
        }
    }
}
