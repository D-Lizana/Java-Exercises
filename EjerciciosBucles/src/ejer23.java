//10. Realiza un programa que vaya pidiendo números hasta que se introduzca un número negativo y nos diga cuantos números se han introducido,
// la media de los impares y el mayor de los pares. El número negativo sólo se utiliza para indicar el final de la introducción de datos pero no se incluye en el cómputo.

import java.util.Scanner;

public class ejer23 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = 0;
        int contador = 0;
        float impares = 0;
        float mediaImpares = 0;
        int pares = 0;

        while(numero>=0){
            numero = teclado.nextInt();
            if(numero>=0){
                contador++;
                if(numero%2!=0){
                    impares++;
                    mediaImpares = mediaImpares + numero;

                }
                else{
                    if(numero>pares){
                        pares=numero;
                    }
                }
            }
        }
        System.out.println("Numero introducidos: "+contador);
        System.out.println("Media de los impares :"+(mediaImpares/impares));
        System.out.println("Numero par mayor: "+pares);
    }
}
