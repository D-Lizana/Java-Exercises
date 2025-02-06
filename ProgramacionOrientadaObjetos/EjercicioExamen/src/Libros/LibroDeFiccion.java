package Libros;

public class LibroDeFiccion extends Libro{

    private String genero;

    public LibroDeFiccion(String titulo, Autor autor, int annoPublicacion, String genero){
        super(titulo,autor,annoPublicacion);
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

}
