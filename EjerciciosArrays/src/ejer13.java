// Build a pyramid-shaped tower, as an array/list of strings, given a positive integer number of floors. A tower block is represented with "*" character.

import java.util.Scanner;

public class ejer13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce numero: ");
        int numero = teclado.nextInt();
        StringBuilder linea = new StringBuilder();
        int k=0;
        String[] torre = new String[numero];

        // llena el string con el numero correcto de *
        for (int i=0; i<(2*numero)-1; i++){
            linea.append("*");
        }

        // llena cada string del array con el string de *
        for (int i=0; i<torre.length; i++){
            torre[i] = linea.toString();
        }

        for(int i=torre.length-2; i>=0; i--){

            int posicion = ((2*numero)-2)-k;
            linea.setCharAt(k, ' ');
            linea.setCharAt(posicion, ' ');

            torre[i] = linea.toString();
            k++;
        }

        for (int i=0; i<torre.length;i++){
            System.out.println(torre[i]);
        }
    }
}

