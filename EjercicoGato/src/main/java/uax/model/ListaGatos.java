package uax.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "gatos")
@XmlAccessorType(XmlAccessType.FIELD)
public class ListaGatos implements Serializable {

    @XmlElement(name = "gato")
    private List<Gato> gatos = new ArrayList<>();

    public List<Gato> getGatos(){
        return gatos;
    }

    public void setGatos(List<Gato> gatos) {
        this.gatos = gatos;
    }

    public void anadirGato(Gato gato){
        gatos.add(gato);
    }

}
