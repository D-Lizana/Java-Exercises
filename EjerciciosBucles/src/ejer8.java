// OK (L1) 10. Calcular y escribir los cuadrados de una serie de números hasta que se introduzca el 0 desde el teclado

import java.util.Scanner;

public class ejer8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = 1;
        while (numero!=0){
            numero = teclado.nextInt();
            if(numero!=0){
                System.out.println(numero*numero);
            }
        }
    }
}
