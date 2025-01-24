//(L2) 2. Escribe un programa que muestre, cuente y sume los múltiplos de 3 que hay entre 1 y un número leído por teclado.

import java.util.Scanner;

public class ejer12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero= teclado.nextInt();
        int sumador = 0;
        int contador=0;

        for(int i=1; i<=numero; i++){
            if(i%3==0){
                System.out.println(i);
                sumador = sumador +i;
                contador ++;
            }
        }
        System.out.println("Total : "+contador);
    }
}
