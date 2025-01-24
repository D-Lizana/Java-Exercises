//OK (L2) 11. Escribe un programa que calcule la media de un conjunto de números positivos introducidos por teclado.
// A priori, el programa no sabe cuántos números se introducirán. El usuario indicará que ha terminado de introducir los datos cuando meta un número negativo.

import java.util.Scanner;

public class ejer9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero=0;
        int media=0;
        int contador = 0;

        while (numero>=0){
            numero = teclado.nextInt();
            if(numero>=0){
                media = media + numero;
                contador ++;
            }
        }
        System.out.println(media/contador);
    }
}
