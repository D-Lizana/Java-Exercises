import java.io.*;

public class EjercicioSupermercado {

    public static void main(String[] args) {

        try{
            crearFichero("Supermercado");
            leerArchivo("Supermercado");
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

    public static void leerArchivo(String archivo){

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

    public static void escribirArchivo(String archivo, String texto){
        try{
            FileWriter fw = new FileWriter(archivo, true);
            fw.write(texto);
            fw.write((System.lineSeparator()));
            System.out.println("texto añadido correctamente.");


        }catch (IOException e){
            e.printStackTrace();
        }
    }


}
