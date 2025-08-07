package ArchivosYJDBC;

import java.io.*;

public class CrearArchivos {

    public void crear(String nombre){
        File archivo = new File(nombre);
        try{
            FileWriter escritor = new FileWriter(archivo, true);
            BufferedWriter bw = new BufferedWriter(escritor);

            System.out.println("El archivo se ha creado.");

            bw.append("Añadir texto al archivo");
            //bw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void crear2(String nombre){
        File archivo = new File(nombre);
        try(PrintWriter escritor = new PrintWriter(new FileWriter(archivo, true))){

            // En este caso podemos añadir el texto directamente usando .println y no append
            escritor.println("Escribiendo texto en el archivo. \n");

            System.out.println("El archivo se ha creado.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public String leerArchivos(String nombre){
        StringBuilder sb = new StringBuilder();
        File archivo = new File(nombre);

        try{

            BufferedReader br = new BufferedReader(new FileReader(archivo));
            String linea = br.readLine();
            while(linea != null){
                sb.append(linea);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return sb.toString();
    }

}
