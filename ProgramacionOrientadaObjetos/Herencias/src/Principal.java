public class Principal {
    public static void main(String[] args) {
        Libro l1 = new Libro("El Nombre del Viento", "Patrick Rothfuss", 2007);

        LibroDeFiccion lf1 = new LibroDeFiccion("Dune", "Frank Herbert", 1061,"Ciencia Ficción");

        System.out.println(l1.visualizarLibro());

    }
}
