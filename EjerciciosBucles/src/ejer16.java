//(L3) 2. Escribe un programa que muestre los n primeros términos de la serie de Fibonacci.
// El primer término de la serie de Fibonacci es 1, el segundo es 1 y el resto se calcula sumando los dos anteriores,
// por lo que tendríamos que los términos son 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144… El número n se debe introducir por teclado.

import java.util.Scanner;

public class ejer16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();
        int b = 1;
        int a = 1;

        for(int i=0; i<numero; i++){
            if(i==0 || i==1){
                System.out.println(a);
            }
            else{
                int n = a + b;
                System.out.println(n);
                a = b;
                b = n;
            }
        }
    }
}
