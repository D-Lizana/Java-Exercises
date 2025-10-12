import java.io.*;
import java.nio.file.*;
import java.util.List;
import java.util.Scanner;

public class WritersYReaders {

    public static void main(String[] args) {

        try{
            crearFichero("Supermercado.txt");
            escribirArchivoBufferedWriter("Supermercado.txt", "Martillo");
            leerArchivoBufferedReader("Supermercado.txt");
        }catch (IOException e){
            e.printStackTrace();
        }


    }

    public static void crearFichero(String nombre) throws IOException {
        File archivo = new File(nombre);

        if(archivo.createNewFile()){
            System.out.println("Fichero creado: " + archivo.getName());
        }
        else{
            System.out.println("El fichero ya existe.");
        }

    }

    public static void borrarFichero(String nombreArchivo){
        File archivo = new File(nombreArchivo);

        if(archivo.exists()){
            if(archivo.delete()){
                System.out.println("Archivo borrado.");
            }
            else{
                System.out.println("No se ha podido borrar el archivo.");
            }

        }
        else {
            System.out.println("El archivo no existe.");
        }
    }

    public static void copiarArchivo(String origen, String destino){
        File archivoOrigen = new File((origen));
        File archivoDestino = new File((destino));

        if(!archivoOrigen.exists() || !archivoOrigen.isFile()){
            System.out.println("El archivo de origen no existe o no es un archivo válido");
            return;
        }

        Path rutaOrigen = archivoOrigen.toPath();
        Path rutaDestino = archivoDestino.toPath();

        try{
            Files.copy(rutaOrigen,rutaDestino, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Archivo copiado con éxito.");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void leerArchivoFileReader(String archivo){

        try{
            FileReader fr = new FileReader(archivo);
            int character;

            while((character = fr.read()) != -1){
                System.out.println((char) character);
            }
            fr.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void leerArchivoBufferedReader(String archivo){

        try{
            BufferedReader br = new BufferedReader(new FileReader(archivo));
            String linea;

            while((linea = br.readLine()) != null){
                System.out.println(linea);
            }
            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void leerScanner(String archivo){

        try{
            Scanner scanner = new Scanner(new File(archivo));

            while(scanner.hasNextLine()){
                String linea = scanner.nextLine();
                System.out.println(linea);
            }
            scanner.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void escribirFileWriter(String archivo, String texto){
        try{
            FileWriter fw = new FileWriter(archivo); // Sobrescribe el archivo
            fw.write(texto);
            fw.write(System.lineSeparator());
            fw.close();
            System.out.println("Texto añadido correctamente.");
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void anadirFileWriter(String archivo, String texto){
        try{
            FileWriter fw = new FileWriter(archivo, true); // Sobrescribe el archivo
            fw.write(texto);
            fw.write(System.lineSeparator());
            fw.close();
            System.out.println("Texto añadido correctamente.");
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void escribirArchivoBufferedWriter(String archivo, String texto){
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter(archivo));
            bw.write(texto);
            bw.newLine();
            bw.close();
            System.out.println("Texto añadido correctamente.");


        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void anadirArchivoBufferedWriter(String archivo, String texto){
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter(archivo, true));
            bw.write(texto);
            bw.newLine();
            bw.close();
            System.out.println("Texto añadido correctamente.");


        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void anadirPrintWriter(String archivo, String texto){
        try{
            PrintWriter pw = new PrintWriter(new FileWriter(archivo, true));
            pw.println(texto);
            pw.println();
            pw.close();
            System.out.println("Texto añadido correctamente.");

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void escribirConFiles(String archivo, String texto){
        try{
            Files.write(Paths.get(archivo), texto.getBytes());
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void anadirConFiles(String archivo, String texto){
        try{
            Files.write(Paths.get(archivo), texto.getBytes(), StandardOpenOption.APPEND, StandardOpenOption.CREATE);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void anadirConFiles(String archivo, List<String> lineas){
        Path path = Paths.get(archivo);
        try{
            Files.write(path, lineas);
        }catch (IOException e){
            e.printStackTrace();
        }
    }



}
