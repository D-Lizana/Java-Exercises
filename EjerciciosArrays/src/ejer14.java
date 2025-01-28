// (L1) 1. Escribe un programa que lea 10 números por teclado y que luego los muestre en orden inverso, es decir,
// el primero que se introduce es el último en mostrarse y viceversa.

import java.util.Scanner;

public class ejer14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] array = new int[10];

        for(int i=0; i<array.length; i++){
            System.out.println("Introduce un numero: ");
            array[i] = teclado.nextInt();
        }

        for (int i=9; i>=0; i--){
            System.out.print(array[i] + " ");
        }
    }
}
