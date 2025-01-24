// OK (L1) 8. Muestra la tabla de multiplicar de un número introducido por teclado.
import java.util.Scanner;

public class ejer6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println(numero*i);
        }
    }
}
