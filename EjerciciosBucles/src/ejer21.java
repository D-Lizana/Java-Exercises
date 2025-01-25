// (L2) 8. Escribe un programa que obtenga los números enteros comprendidos entre dos números introducidos por teclado y validados como distintos,
// el programa debe empezar por el menor de los enteros introducidos e ir incrementando de 7 en 7.

import java.util.Scanner;

public class ejer21 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeroUno = teclado.nextInt();
        int numeroDos = teclado.nextInt();

        if(numeroUno!=numeroDos){
            if(numeroUno<numeroDos){
                for(int i=numeroUno; i<numeroDos; i+=7){
                    System.out.println(i);
                }
            }
            else{
                for(int i=numeroDos; i<numeroUno; i+=7){
                    System.out.println(i);
                }
            }
        }
    }
}
