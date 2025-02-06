package Libros;
import Biblioteca.*;

public class Principal {
    public static void main(String[] args) {
        Autor autor1 = new Autor("Gabriel García Márquez", "Colombiano", "06/03/1927");
        Autor autor2 = new Autor("J.K. Rowling", "Británica", "31/07/1965");

        Libro libro1 = new Libro("Cien años de soledad", autor1, 1967);
        LibroDeFiccion libro2 = new LibroDeFiccion("Harry Potter y la piedra filosofal", autor2, 1997, "Fantasía");

        Biblioteca biblioteca = new Biblioteca("Biblioteca Central", "Ciudad Principal");
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);

        System.out.println("Mostrando libros por autor:");
        biblioteca.mostrarLibrosAutor(autor1);

        System.out.println("\nMostrando libros por género de ficción:");
        biblioteca.mostrarLibrosGeneroFiccion("Fantasía");
    }
}
