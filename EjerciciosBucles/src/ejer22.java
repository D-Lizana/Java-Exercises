// 9. Realiza un programa que pinte una pirámide por pantalla.
// La altura se debe pedir por teclado. El carácter con el que se pinta la pirámide también se debe pedir por teclado.

import java.util.Scanner;

public class ejer22 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce altura: ");
        int numero = teclado.nextInt();
        System.out.println("Introduce caracter: ");
        String simbolo = teclado.next();

        for(int i=1; i<=numero; i++){
            for(int k=0; k<(numero-i); k++){
                System.out.print(" ");
            }

            for(int j=0; j<(2*i-1); j++){
                System.out.print(simbolo);
            }
            System.out.println();
        }
    }
}
