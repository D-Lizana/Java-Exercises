package uax;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Coche {
    private String marca;
    private String modelo;
    private String tipo;
    private double precio;

    @Override
    public String toString() {
        return marca + " " + modelo + " (" + tipo + ") - " + precio + "€";
    }
}
