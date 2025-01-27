//Utiliza uno de los vectores anteriores y almacena en ese mismo vector el resto de la división de cada número por 13

import java.util.Arrays;

public class ejer3 {
    public static void main(String[] args) {
        int[] vector = new int[10];
        for(int i=0; i<10; i++){
            vector[i] = (int) (Math.random()*101);
        }
        System.out.println(Arrays.toString(vector));

        for(int i=0; i<10; i++){
            vector[i] = vector[i]%13;
        }
        System.out.println(Arrays.toString(vector));

    }
}
