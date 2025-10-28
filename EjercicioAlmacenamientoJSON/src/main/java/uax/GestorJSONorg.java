package uax;


import org.json.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GestorJSONorg {

    private final String rutaJSON = "src/main/resources/coches.json";

    public GestorJSONorg(){
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
        List<Coche> coches = new ArrayList<>();

        if(!file.exists()){
            return coches;
        }

        try(BufferedReader br = new BufferedReader(new FileReader(file))){
            StringBuilder sb = new StringBuilder();
            String linea;
            while((linea = br.readLine()) != null){
                sb.append(linea);
            }
            JSONArray JSONArray = new JSONArray(sb.toString());
            for(int i = 0; i<JSONArray.length(); i++){
                JSONObject obj = JSONArray.getJSONObject(i);
                Coche coche = new Coche(
                        obj.getString("marca"),
                        obj.getString("modelo"),
                        obj.getString("tipo"),
                        obj.getDouble("precio")
                );
                coches.add(coche);
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return coches;
    }


    public void guardarCoches(List<Coche> coches){
        JSONArray jsonArray = new JSONArray();

        for(Coche coche: coches){
            JSONObject obj = new JSONObject();
            obj.put("marca", coche.getMarca());
            obj.put("modelo", coche.getModelo());
            obj.put("tipo", coche.getTipo());
            obj.put("precio", coche.getPrecio());
            jsonArray.put(obj);
        }

        try(Writer writer = new FileWriter(rutaJSON)){
            writer.write(jsonArray.toString(4)); // formato de indentacion

        }catch (IOException e){
            e.printStackTrace();
        }

    }

}
