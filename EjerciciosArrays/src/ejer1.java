//Rellenar un vector de 10 posiciones con valores introducidos por teclado.
// Deberá de mostrar los mensajes: Introduce el numero 1º, Introduce el número 2º.... e Introduce el último número.
// Posteriormente los mostrará todos por pantalla en una misma línea separado por guiones
import java.util.Scanner;

public class ejer1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] vector = new double[10];
        for(int i=0; i<10; i++){
            System.out.println("Introduce el numero "+(i+1)+":");
            vector[i] = scanner.nextDouble();
        }

        for(int j=0; j<10; j++){
            System.out.print(vector[j]+" - ");
        }
    }
}
