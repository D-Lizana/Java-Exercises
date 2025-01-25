// (L2) 4. Escribe un programa que pida una base y un exponente (entero positivo) y que calcule la potencia.

import java.util.Scanner;

public class ejer18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int base = teclado.nextInt();
        int exponente = teclado.nextInt();
        int numero = base;

        if(exponente>0){
            for (int i=1; i<exponente; i++){
                numero = numero * base;
            }
        }
        System.out.println(numero);

    }
}
