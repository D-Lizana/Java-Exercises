//OK (L1) 3. Leer desde teclado una serie de números hasta que aparezca alguno menor que 1000.

import java.util.Scanner;

public class ejer1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        do{
            numero = teclado.nextInt();

        }while (numero>=1000);

    }
}
