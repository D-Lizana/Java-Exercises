package uax.services;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import uax.model.Gato;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class GestorJSON {

    private final String rutaJSON = "src/main/resources/gatos.json";
    private final Gson gson = new Gson();

    public GestorJSON(){
        crearArchivoJSON();
    }

    public void crearArchivoJSON(){
        try{
            // BUSCAME EL ARCHIVO JSON EN LA RUTA SELECCIONADA
            File archivoJSON = new File(rutaJSON);

            // SI EL ARCHIVO NO EXISTE LO CREAS
            if(!archivoJSON.exists()){
                // SI HAS TENIDO EXITO AL CREAR EL ARCHIVO LO ABRES Y LE METES UNAS LLAVES
                boolean creado = archivoJSON.createNewFile();
                if(creado){
                    try(Writer writer = new FileWriter(archivoJSON)){
                        writer.write("[]");
                    }
                    System.out.println("Archivo creado: "+archivoJSON.getAbsolutePath());
                }
            }
        }catch (Exception e){
            System.out.println("Error al crear el archivo.");
        }
    }

    public void guardarJSON(List<Gato> gatos){
        // ABRIMOS EL ARCHIVO USANDO EL WRITER
        try(Writer writer = new FileWriter(rutaJSON)){
            // LA CLASE GSON QUE TOMAMOS DE LA DEPENDENCIA TRANSFORMA LOS DATOS EN JSON Y LOS METE CON EL WRITER
            gson.toJson(gatos, writer);

        } catch(IOException e){
            System.out.println("No se ha encontrado el archivo.");
        }
    }

    public List<Gato> leerJSON(){
        File archivoJSON = new File(rutaJSON);

        // SI NO EXISTE EL ARCHIVO HAY QUE DEVOLVER UNA LISTA VACIA
        if (!archivoJSON.exists()){
            return new ArrayList<>();
        }

        // CON EL READER ABRE EL ARCHIVO JSON
        try(Reader reader = new FileReader(archivoJSON)){

            // GSON.FROMJSON TRANSFORMA LOS OBJETOS JSON EN OBJETOS JAVA DE LA CLASE QUE FUERA
            Type listType = new TypeToken<List<Gato>>(){}.getType();
            return gson.fromJson(reader, listType);

        }catch(IOException e){
            System.out.println("Error al recuperar datos");
            // SI DA ALGUN ERROR HAY QUE SEGUIR RETORNANDO UNA LISTA AUNQUE ESTE VACIA
            return new ArrayList<>();
        }
    }










}
