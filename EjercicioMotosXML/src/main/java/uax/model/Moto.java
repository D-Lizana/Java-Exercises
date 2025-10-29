package uax.model;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.*;

import java.io.Serializable;

@Data
@XmlRootElement(name = "moto")
@XmlAccessorType(XmlAccessType.FIELD)
public class Moto implements Serializable {

    private String marca;
    private String modelo;
    private String cilindrada;

    public Moto() {} // Constructor vacío requerido por JAXB

    public Moto(String marca, String modelo, String cilindrada) {
        this.marca = marca;
        this.modelo = modelo;
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "Marca: " + marca + '\'' +
                ", Modelo: " + modelo + '\'' +
                ", Cilindrada: " + cilindrada + ".";
    }
}
