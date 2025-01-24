// (L2) 4. Escribe un programa que permita ir introduciendo una serie indeterminada de números mientras su suma no supere el valor 10000.
// Cuando esto último ocurra, se debe mostrar el total acumulado, el contador de los números introducidos y la media.

import java.util.Scanner;

public class ejer14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        int sumador = 0;
        int contador=0;

        while(sumador<10000){
            numero= teclado.nextInt();
            sumador = sumador + numero;
            contador ++;

        }

        System.out.println(sumador);
        System.out.println(contador);
        System.out.println(sumador/contador);

    }
}
