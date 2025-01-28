//(L2) 5. Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los muestre por pantalla separados por espacios.
// El programa pedirá entonces por teclado dos valores y a continuación cambiará todas las ocurrencias del primer valor por el segundo en la lista generada anteriormente.
// Los números que se han cambiado deben aparecer entrecomillados.

import java.util.Scanner;

public class ejer18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] array = new int[100];

        for(int i=0; i<array.length; i++){
            array[i] = (int) (Math.random()*21);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Introduce el número que quieres cambiar (del 0 al 20): ");

        int valorUno = teclado.nextInt();

        System.out.println("Introduce por cúal quieres cambiarlo: ");
        int valorDos = teclado.nextInt();

        for(int i=0; i<array.length; i++){
            if(array[i]==valorUno){
                array[i] = valorDos;
                System.out.print("'"+array[i]+"'"+" ");
            }
            else{
                System.out.print(array[i]+" ");
            }
        }
    }
}
