
public class Libro {
    // Atributos
    private String titulo;
    private String autor;
    private int numPaginas;
    private boolean estado;

    // Métodos a nivel de diseño
    // getters y setters

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

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    // Constructores

    public Libro(String titulo, String autor, int numPaginas, boolean estado) {
            this.titulo = titulo;
            this.autor = autor;
            this.numPaginas = numPaginas;
            this.estado = estado;
    }

    // Lógica de negocio
    public void prestar(){
        if(!estado){
            System.out.println("El libro "+titulo+" no está en la biblioteca, no se puede prestar.");
        }
        else{
            System.out.println("Libro prestado: "+titulo);
            estado=false;
        }
    }

    public void devolver(){
        if(estado){
            System.out.println("El libro "+titulo+" ya está en la biblioteca.");
        }
        else{
            System.out.println("Libro devuelto: "+titulo);
            estado = true;
        }
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", numPaginas=" + numPaginas +
                ", estado=" + estado +
                '}';
    }

}
