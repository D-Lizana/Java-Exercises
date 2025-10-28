package uax;

import com.google.gson.Gson;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GestorJSON {

    private final String rutaJSON = "src/main/resources/coches.json";
    private final Gson gson = new Gson();

    public GestorJSON(){
        crearArchivo();
    }

    public void crearArchivo(){
        try{
            File file = new File(rutaJSON);
            File carpeta = file.getParentFile();

            if(!carpeta.exists()){
                boolean creada = carpeta.mkdirs();
                if(creada){
                    System.out.println("Carpeta creada: "+carpeta.getAbsolutePath());
                }
            }

            if(!file.exists()){
                boolean creado = file.createNewFile();
                if(creado){
                    try(Writer writer = new FileWriter(file)){
                        writer.write("[]");
                    }
                    System.out.println("Archivo creado: "+ file.getAbsolutePath());
                }
            }
        } catch (Exception e) {
            System.err.println("Error al crear el archivo o carpeta: "+e.getMessage());
        }
    }

    public List<Coche> leerCoches(){
        File file = new File(rutaJSON);

        if(!file.exists()){
            return new ArrayList<>();
        }

        try(Reader reader = new FileReader(file)){



        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }


}
