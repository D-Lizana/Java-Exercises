package uax.model;

import jakarta.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import uax.model.Moto;

@XmlRootElement(name = "motos")
@XmlAccessorType(XmlAccessType.FIELD) // Usa todos los campos
public class ListaMotos implements Serializable {

    @XmlElement(name = "moto")
    private List<Moto> motos = new ArrayList<>();

    public List<Moto> getMotos(){
        return motos;
    }

    public void addMotos(Moto moto){
        motos.add(moto);
    }

    public void setMotos(List<Moto> motos) {
        this.motos = motos;
    }


}
