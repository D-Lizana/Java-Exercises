//(L2) 6. Escribe un programa que diga si un número introducido por teclado es o no primo.
// Un número primo es aquel que sólo es divisible entre él mismo y la unidad.

import java.util.Scanner;

public class ejer19 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();
        boolean primo = true;

        for(int i=2; i<numero; i++){
            if(numero%i==0){
                primo = false;
                System.out.println("No es primo.");
                break;
            }
        }
        if(primo){
            System.out.println("Es primo.");
        }
    }
}
