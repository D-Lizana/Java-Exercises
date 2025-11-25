package uax.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {
    private String nombre;
    private String apellido;
    private String dni;

    @Override
    public String toString() {
        return nombre + " " + apellido + ", " + dni;
    }
}
