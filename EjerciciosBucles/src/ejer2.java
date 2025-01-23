//OK (L2) 4. Leer valores por teclado y que te diga si es igual, menor o mayor que 25. La marca de fin de lectura será el número 12345678.

import java.util.Scanner;

public class ejer2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero=0;
        while (numero!=12345678){
            numero = teclado.nextInt();
            if(numero<25){
                System.out.println("Es menor que 25.");
            }
        }
    }
}
