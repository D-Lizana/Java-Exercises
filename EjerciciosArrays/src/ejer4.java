//Utiliza uno de los vectores anteriores y multiplícalo entero por un número introducido por el usuario

import java.util.Arrays;
import java.util.Scanner;

public class ejer4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vector = new int[10];
        for(int i=0; i<10; i++){
            vector[i] = (int) (Math.random()*101);
        }
        System.out.println(Arrays.toString(vector));

        for(int i=0; i<10; i++){
            vector[i] = vector[i]%13;
        }
        System.out.println(Arrays.toString(vector));

        int numero = scanner.nextInt();

        for(int i=0; i<10; i++){
            vector[i] = vector[i]*numero;
        }
        System.out.println(Arrays.toString(vector));

    }
}
