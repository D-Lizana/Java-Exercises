public class Libro {
    private String titulo;
    private String autor;
    private int anno;

    public Libro(String titulo, String autor, int anno){
        this.titulo = titulo;
        this.autor = autor;
        this.anno = anno;
    }

    public Libro(){

    }

    public String visualizarLibro(){
        return this.titulo;
    }

    public String MostrarAutor(){
        return this.autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anno=" + anno +
                '}';
    }
}
