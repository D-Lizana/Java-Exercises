package model;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class GestorJSON {

    private final String rutaJasonCoches = "src/main/resources/coches.json";
    private final Gson gson = new Gson();

    public GestorJSON(){
        crearArchivo();
    }

    private void crearArchivo(){
        try{
            File fichero = new File(rutaJasonCoches);
            File carpeta = fichero.getParentFile();

            if(!carpeta.exists()){
                boolean creada = carpeta.mkdir();
                if(creada){
                    System.out.println("Carpeta creada: "+carpeta.getAbsolutePath());
                }
            }
            if(!fichero.exists()){
                boolean creado = fichero.createNewFile();
                if(creado){
                    try(Writer writer = new FileWriter(fichero)){
                        writer.write("[]");
                    }
                    System.out.println("Archivo creado: "+ fichero.getAbsolutePath());
                }
            }

        }catch (Exception e){
            System.err.println("Error al crear archivo o carpeta: "+e.getMessage());
        }
    }

    private List<Coche> leerCoches(){
        File fichero = new File(rutaJasonCoches);

        if(!fichero.exists()){
            return new ArrayList<>();
        }

        try(Reader reader = new FileReader(rutaJasonCoches)){
            Type listType = new TypeToken<List<Coche>>(){}.getType();
            return gson.fromJson(reader, listType);

        }catch (IOException e){
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    public void guardarCochesNuevos(List<Coche> coches){
        try(Writer writer = new FileWriter(rutaJasonCoches)){
            gson.toJson(coches,writer);

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void insertarCocheNuevo(Coche cocheNuevo){
        List<Coche> cochesNuevos = leerCoches();
        cochesNuevos.add(cocheNuevo);
        guardarCochesNuevos(cochesNuevos);
        System.out.println("Nuevo coche añadido al catálogo.");
    }

    public void mostrarCochesNuevos(){
        List<Coche> cochesNuevos = leerCoches();
        if (cochesNuevos.isEmpty()){
            System.out.println("No hay coches a la venta.");
        }
        else{
            System.out.println("Lista de coches nuevos: ");
            for(int i=0; i<cochesNuevos.size(); i++){
                System.out.println((i+1)+": "+ cochesNuevos.get(i));
            }
        }
    }

    public Coche cogerCochePorOrden(int index){
        List<Coche> cochesNuevos = leerCoches();
        return cochesNuevos.get(index-1);
    }

    public void eliminarCoche(Coche cocheBorrar) {
        List<Coche> cochesNuevos = leerCoches();
        cochesNuevos.removeIf(coche -> coche.equals(cocheBorrar));
        guardarCochesNuevos(cochesNuevos);
    }


}
