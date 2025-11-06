package uax.services;

import jakarta.xml.bind.*;
import uax.model.ListaMotos;
import java.io.File;

public class xmlService {

    private final String filePath;

    public xmlService(String filePath){
        this.filePath = filePath;
    }

    public void guardarXML(ListaMotos motos) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(ListaMotos.class);
        Marshaller marshaller = context.createMarshaller();

        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(motos, new File(filePath));
        System.out.println("Lista guardada en fichero XML "+filePath);

    }

    public ListaMotos leerXML() throws JAXBException{
        JAXBContext context = JAXBContext.newInstance(ListaMotos.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        ListaMotos motos = (ListaMotos) unmarshaller.unmarshal(new File(filePath));
        System.out.println("Lista leida desde fichero XML "+filePath);

        return motos;
    }


}
