// Utiliza uno de los vectores anteriores y calcula la media con los números que contiene

import java.util.Arrays;


public class ejer5 {
    public static void main(String[] args) {
        int[] vector = new int[10];
        int sumatorio = 0;
        for(int i=0; i<vector.length; i++){
            vector[i] = (int) (Math.random()*101);
            sumatorio = sumatorio + vector[i];
        }
        System.out.println(Arrays.toString(vector));

        System.out.println(sumatorio/vector.length);

    }
}
