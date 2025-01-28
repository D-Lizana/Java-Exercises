// 8. Escribe un programa que muestre por pantalla un array de 10 números enteros generados al azar entre 0 y 100.
// A continuación, el programa debe pedir un número al usuario. Se debe comprobar que el número introducido por teclado se encuentra dentro del array,
// en caso contrario se mostrará un mensaje por pantalla y se volverá a pedir un número; así hasta que el usuario introduzca uno correctamente.
// A continuación, el programa rotará el array hacia la derecha las veces que haga falta hasta que el número introducido quede situado en la posición0 del array.
// Por último, se mostrará el array rotado por pantalla.

import java.util.Arrays;
import java.util.Scanner;

public class ejer21 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] array = new int[10];
        boolean numeroArray = false;
        int numero =-1;

        for(int i=0; i<array.length; i++){
            array[i] = (int)(Math.random()*101);
        }
        System.out.println(Arrays.toString(array));

        while(numeroArray==false){
            System.out.println("Introduce un numero: ");
            numero = teclado.nextInt();
            for (int i=0; i<array.length; i++){
                if(numero==array[i]){
                    numeroArray = true;
                    break;
                }
            }
            if(numeroArray==false){
                System.out.println("Numero incorrecto.");
            }
        }

        for(int i=0; i<array.length; i++){
            if (array[0]==numero){
                break;
            }
            else{
                int primerValor = array[0];
                for (int j=0; j<array.length; j++){
                    if(j==array.length-2){
                        array[j] = array[j+1];
                        array[j+1] = primerValor;
                        break;
                    }
                    else {
                        array[j] = array[j+1];
                    }
                }
            }
        }

        System.out.println(Arrays.toString(array));

    }
}
