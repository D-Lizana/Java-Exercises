package uax.services;

import uax.model.Gato;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

// NO REQUIERE NINGUNA LIBRERIA O DEPENDENCIA
public class BinarioService {
    // REQUIERE LA RUTA DE DONDE SE VA A CREAR EL BINARIO
    private final String rutaBinario;
    // String rutaBinario = "src/main/resources/gatos.bin";

    public BinarioService(String rutaBinario){
        this.rutaBinario = rutaBinario;
    }

    public void guardarBinario(List<Gato> gatos){
        // CLASE QUE TENEMOS QUE UTILIZAR PARA GUARDAR Y LEER BINARIO
        // ObjectOutputStream y FileOutputStream para guardar los datos
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(rutaBinario))){

            // METODO PARA GUARDAR COSAS EN BINARIO
            oos.writeObject(gatos);
            System.out.println("Gato guardado correctamente.");

        }catch(IOException e){
            System.out.println("Error al guardar datos: "+ e.getMessage());
        }
    }

    public List<Gato> leerBinario(){
        List<Gato> gatos = new ArrayList<>();

        // ObjectInputStream y FileInputStream para guardar los datos
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(rutaBinario))){

            // METODO PARA RECUPERAR DATOS DEL BINARIO Y TRANSFORMARLOS EN UNA LISTA
            gatos = (List<Gato>) ois.readObject();
            System.out.println("Fichero leido correctamente");

        }catch (Exception e){
            System.out.println("Error al leer datos: "+ e.getMessage());
        }
        return gatos;
    }

}
