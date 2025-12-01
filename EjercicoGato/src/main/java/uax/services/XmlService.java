package uax.services;


import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;
import uax.model.ListaGatos;

import java.io.File;

// PARA XML HAY QUE UTILIZAR LA DEPENDENCIA JAXB
public class XmlService {

    private final String rutaXML;
    // String rutaXML = "src/main/resources/gatos.xml";

    public XmlService(String rutaXML){
        this.rutaXML = rutaXML;
    }

    public void guardarXML(ListaGatos gatos) throws JAXBException{
        // CREAMOS EL CONTEXTO XML CON LA CLASE QUE HEMOS ETIQUETADO
        JAXBContext context = JAXBContext.newInstance(ListaGatos.class);
        // CLASE MARSHALLER Y METODO PARA XML
        Marshaller marshaller = context.createMarshaller();

        // TRANSFORMA LOS DATOS A XML Y LOS GUARDA EN LA RUTA ESPECIFICADA
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(gatos, new File(rutaXML));

        System.out.println("Lista de gatos guardada en el fichero xml");
    }

    public ListaGatos leerXML() throws JAXBException{
        // CREAMOS EL MISMO CONTEXTO QUE PARA GUARDAR
        JAXBContext context = JAXBContext.newInstance(ListaGatos.class);

        // ESTA CLASE DESEMPAQUETA EL XML
        Unmarshaller unmarshaller = context.createUnmarshaller();

        // CREAMOS LA LISTA DE GATOS QUE VAMOS A DEVOLVER Y LA LLENAMOS CON LOS DATOS TRANSFORMADOS DEL XML POR EL UNMARSHALLER
        ListaGatos gatos = (ListaGatos) unmarshaller.unmarshal(new File(rutaXML));
        System.out.println("Lista leida desde el fichero XML");

        return gatos;
    }


}
