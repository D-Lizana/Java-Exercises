import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Coche c1 = new Coche("Dacia","Duster",60000,20000);
        CocheHistorico c2 = new CocheHistorico("Renault","4",350000,"Gasolina","Rojo",50000,40,"España");

        Campa garaje = new Campa("Salamanca",5);

        Coche c3 = new Coche();
        c3.setMarca(scanner.next());
        c3.setModelo(scanner.next());

        garaje.anadirCoche(c1);
        garaje.anadirCoche(c2);
        garaje.anadirCoche(c3);

        garaje.mostrarCoches();


    }
}
