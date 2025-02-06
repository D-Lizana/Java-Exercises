package Biblioteca;

import Libros.*;

import java.util.ArrayList;

public class Biblioteca {
    private String nombre;
    private String ubicacion;
    private ArrayList<Libro> libros;

    public Biblioteca(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void mostrarLibrosAutor(Autor autor) {
        System.out.println("Libros de " + autor.getNombre() + ":");
        for (Libro libro : libros) {
            if (libro.getAutor().getNombre().equals(autor.getNombre())) {
                libro.visualizarLibro();
            }
        }
    }

    public void mostrarLibrosGeneroFiccion(String genero){
        System.out.println("Libros de ficción del género " + genero + ":");
        for (Libro libro : libros) {
            if (libro instanceof LibroDeFiccion && libro.getGenero().equalsIgnoreCase(genero)) {
                libro.visualizarLibro();
            }
        }
    }
}

