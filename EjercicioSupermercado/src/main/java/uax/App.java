package EjercicioSupermercado.src.main.java.uax;

import java.io.*;
import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do{
            System.out.println("Seleccione número:");
            System.out.println();
            System.out.println("1: Crear archivo.");
            System.out.println("2: Leer archivo.");
            System.out.println("3: Añadir producto.");
            System.out.println("4: Salir.");

            opcion = Integer.parseInt(sc.nextLine());

            System.out.println("Seleccione nombre del archivo en csv. (Ejemplo: archivo.csv): ");
            String nombreArchivo = sc.nextLine().toLowerCase();

            switch (opcion){
                case 1:
                    try{
                        crearFichero(nombreArchivo);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    leerContenido(nombreArchivo);
                    break;
                case 3:
                    anadirProducto(nombreArchivo);
                    break;
            }
        }while(opcion!=4);
        System.out.println("Programa finalizado.");

    }


    public static void crearFichero(String nombre) throws IOException {
        File archivo = new File(nombre);

        if(archivo.createNewFile()){
            System.out.println("Fichero creado: "+ archivo.getName());
        }
        else{
            System.out.println("El fichero ya existe.");
        }
    }


    public static void leerContenido(String nombreArchivo){
        try(BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))){
            String linea;

            while((linea = br.readLine()) != null){
                String[] campos = linea.split(",");
                String nombre = campos[0];
                String precio = campos[1];
                String cantidad = campos[2];

                System.out.println("Nombre: "+nombre+", Precio: "+precio+", Cantidad: "+cantidad);
            }
            System.out.println("\n --------------------------------------- \n");

        }catch (Exception e){
            System.err.println("No se ha encontrado el archivo. "+e.getMessage());
        }
    }

    public static void anadirProducto(String nombreArchivo){
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce nombre del producto: ");
        String nombre = sc.next();

        System.out.println("Introduce precio del producto sin comas (Ej: 10.99): ");
        String precio = sc.next();

        System.out.println("Introduce cantidad del producto: ");
        String cantidad = sc.next();

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(nombreArchivo, true))){

            bw.write(nombre+","+precio+","+cantidad);
            bw.newLine();

            System.out.println("Producto añadido.");

        } catch (Exception e) {
            System.err.println("No se ha encontrado el archivo. "+e.getMessage());
        }

    }

}
