package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Coche {
    private String marca;
    private String modelo;
    private int anno_fabricacion;
    private Double precio;

    @Override
    public String toString() {
        return marca + ", " + modelo + ", " + anno_fabricacion + ", " + precio + "€";
    }
}
