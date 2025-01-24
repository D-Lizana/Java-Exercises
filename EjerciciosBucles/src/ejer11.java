//(L2) 1. Escribe un programa que calcule el factorial de un número entero leído por teclado.

import java.util.Scanner;

public class ejer11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero= teclado.nextInt();
        int contador = 1;

        for(int i=1; i<=numero; i++){
            contador = contador * i;
        }
        System.out.println(numero+"! = "+contador);

    }
}
