package uax.io;

import uax.model.Gato;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FicheroCSV {

    private final File archivo;

    // CREAMOS EL ARCHIVO SI NO EXISTE
    public FicheroCSV(String rutaFichero) {
        this.archivo = new File(rutaFichero);
        crearArchivoCSV();
    }

    private void crearArchivoCSV() {
        try {
            if (!archivo.exists()) {
                archivo.createNewFile();
            }
        } catch (IOException e) {
            System.out.println("No se ha podido crear el archivo. " + e.getMessage());
        }
    }

    public void guardarCSV(List<Gato> gatos) {
        // ABRIMOS EL ARCHIVO PARA ESCRITURA Y RECORREMOS LA LISTA ESCRIBIENDO LINEA A LINEA EN EL TXT
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo))) {
            for (Gato gato : gatos) {
                bw.write(gato.getChip() + "," + gato.getNombre() + "," + gato.getRaza());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("No se ha encontrado el archivo.");
        }
    }

    public List<Gato> leerCSV(){
        List<Gato> gatos = new ArrayList<>();

        // ABRIMOS EL ARCHIVO PARA LECTURA Y RECORREMOS EL TXT COGIENDO DE CADA LINEA UN ELEMENTO
        try(BufferedReader br = new BufferedReader(new FileReader(archivo))){
            String linea;
            // ME VAS A LEER LA LINEA HASTA QUE LLEGUE A UNA LINEA VACIA
            while((linea = br.readLine()) != null){
                // LO QUE HAY EN LA LINEA ME LO ROMPES EN PARTES
                String[] partes = linea.split(",");
                if(partes.length == 3){
                    // CON CADA PARTE CREO EL GATO
                    Gato gato = new Gato(Integer.parseInt(partes[0]), partes[1], partes[2]);
                    // UNA VEZ TENGO EL GATO LO METO EN LA LISTA
                    gatos.add(gato);
                }
                // EL BUCLE SE REPITE HASTA QUE NO HAYA NINGUN GATO SIN METER
            }
        }catch(IOException e){
            System.out.println("No se ha encontrado el archivo.");
        }

        // DEVUELVE LA LISTA DE GATOS
        return gatos;
    }
}
