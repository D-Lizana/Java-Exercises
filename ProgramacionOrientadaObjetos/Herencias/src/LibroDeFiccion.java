


public class LibroDeFiccion extends Libro{
    private String genero;


    public LibroDeFiccion(String titulo, String autor, int anno, String genero){
        super(titulo, autor, anno);
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }


}

