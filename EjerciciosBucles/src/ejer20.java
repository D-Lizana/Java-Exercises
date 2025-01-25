//(L2) 7. Realiza un programa que sume los 100 números siguientes a un número entero y positivo introducido por teclado.
// Se debe comprobar que el dato introducido es correcto (que es un número positivo).

import java.util.Scanner;

public class ejer20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();
        int sumatorio = numero;

        if(numero>0){
            for(int i=0; i<100; i++){
                sumatorio = sumatorio + (numero++);
                System.out.println(sumatorio);
            }
            System.out.println(sumatorio);
        }
        else{
            System.out.println("No es positivo");
        }

    }
}
