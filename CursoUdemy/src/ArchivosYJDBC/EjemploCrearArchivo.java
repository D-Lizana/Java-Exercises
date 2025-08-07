package ArchivosYJDBC;

public class EjemploCrearArchivo {
    public static void main(String[] args) {

        String nombreArchivo = "Loquesea";

        CrearArchivos crearArchivo = new CrearArchivos();
        crearArchivo.crear(nombreArchivo);

        crearArchivo.crear2(nombreArchivo);

    }
}
