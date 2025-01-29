public class ejercicio1POOPrincipal {
    public static void main(String[] args){
        Libro l1 = new Libro("El Nombre del Viento","Patrick Rothfuss",1000,true);
        Libro l2 = new Libro("Victoria","Paloma Sánchez Garnica", 457, true);
        Libro l3 = new Libro("Fray Perico y su borrico", "Juan Muñoz", 110, true);

        System.out.println("Contenido de la biblioteca: ");
        System.out.println(l1.toString());
        System.out.println(l2.toString());
        System.out.println(l3.toString());
        System.out.println();

        l1.prestar();
        l2.prestar();
        l3.prestar();

        l1.devolver();
        l1.prestar();

        l2.devolver();
        l3.devolver();
        l1.devolver();

    }
}
