package Libros;


public class Libro {
    private String titulo;
    private Autor autor;
    private int annoPublicacion;

    public Libro(String titulo, Autor autor, int annoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.annoPublicacion = annoPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public int getAnnoPublicacion() {
        return annoPublicacion;
    }

    public void setAnnoPublicacion(int annoPublicacion) {
        this.annoPublicacion = annoPublicacion;
    }
}
