package com.motos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

// CON ESTO ESPECIFICAMOS QUE HACE REFERENCIA UNA TABLA EN LA BASE DE DATOS
// SI PONEMOS @TABLE PONEMOS ELEGIR EL NOMBRE, SI NO LA TABLA SE LLAMA POR DEFECTO COMO LA CLASE
// @Entity: marca la clase como una entidad persistente — corresponde a una tabla en la base de datos.
// Si quieres controlar el nombre de la tabla: @Table(name = "motos").
@Entity
public class Moto {

    @Id
    @GeneratedValue
    private int id;
    private String marca;
    private int cilindrada;
}
