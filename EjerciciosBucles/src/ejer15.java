// (L2) 1. Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de los 5 primeros números enteros a partir de uno que se introduce por teclado.

import java.util.Scanner;

public class ejer15 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();

        for(int i=0; i<5; i++){
            int cuadrado = numero * numero;
            int cubo = numero * numero * numero;
            System.out.println(numero+ " || " +cuadrado+ " || "+cubo);
            numero++;
        }
    }
}
