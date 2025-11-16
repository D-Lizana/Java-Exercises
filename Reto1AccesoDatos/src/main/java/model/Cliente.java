package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {
    public String nombre;
    public String apellido;
    public String DNI;

    @Override
    public String toString() {
        return nombre + " " + apellido + ", DNI: " + DNI;
    }
}
