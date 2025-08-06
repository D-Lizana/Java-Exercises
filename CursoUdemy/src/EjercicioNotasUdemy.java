import java.util.Scanner;

public class EjercicioNotasUdemy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int notas = 20;
        double sumaTotalNotas = 0;
        int contadorSobre5 = 0;
        double sumaSobre5 = 0;
        int contadorMenor4 = 0;
        double sumaMenor4 = 0;
        int contadorNotasUno = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.print("Ingrese la nota #" + i + " (1.0 a 7.0): ");
            double nota = scanner.nextDouble();

            if (nota == 0) {
                System.out.println("Error: La nota no puede ser 0. Finalizando programa.");
                return;
            }

            if(nota >= 5){
                contadorSobre5++;
                sumaSobre5 += nota;
                sumaTotalNotas += nota;
            }

            if(nota < 4){
                contadorMenor4++;
                sumaMenor4 += nota;
                sumaTotalNotas += nota;
            }

            if(nota == 1){
                contadorNotasUno++;
                sumaTotalNotas += nota;
            }
        }

        System.out.println("Notas sobre 5: " +contadorSobre5+"/20");
        System.out.println("Promedio de notas sobre 5: " + (sumaSobre5/contadorSobre5));

        System.out.println("Notas bajo 4: " +contadorMenor4+"/20");
        System.out.println("Promedio de notas bajo 4: " + (sumaMenor4/contadorMenor4));

        System.out.println("Notas igual a 1: " +contadorNotasUno+"/20");

        System.out.println("Promedio de notas total: " + (sumaTotalNotas/notas));

    }
}
