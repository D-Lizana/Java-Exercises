package uax;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.*;

import java.lang.reflect.Type;
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
            // lee la lista de coches
            Type listType = new TypeToken<List<Coche>>(){}.getType();
            // retorna la lista obtenida del reader
            return gson.fromJson(reader,listType);

        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }







}
