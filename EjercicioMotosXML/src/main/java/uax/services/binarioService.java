package uax.services;

import uax.model.Moto;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class binarioService {
    private final String filePath;

    public binarioService(String filePath){
        this.filePath = filePath;
    }

    public void guardarBinario(List<Moto> motos){
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))){
            oos.writeObject(motos);
            System.out.println("Moto guardada correctamente.");

        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public List<Moto> leerBinario(){
        List<Moto> motos = new ArrayList<>();

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))){
            motos = (List<Moto>) ois.readObject();
            System.out.println("Fichero binario leido correctamente;");

        }catch (Exception e){
            e.printStackTrace();
        }

        return motos;
    }


}
