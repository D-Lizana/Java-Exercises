//Rellenar un vector de 10 posiciones con valores del 1 al 100

import java.util.Arrays;

public class ejer2 {
    public static void main(String[] args) {
        int[] vector = new int[10];
        for(int i=0; i<10; i++){
            vector[i] = (int) (Math.random()*101);
        }
        System.out.println(Arrays.toString(vector));
    }
}
