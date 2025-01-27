// Utiliza uno de los vectores anteriores y dime cuál es el valor más alto y el más bajo

import java.util.Arrays;


public class ejer6 {
    public static void main(String[] args) {
        int[] vector = new int[10];
        int masAlto = 0;
        int masBajo = 100;
        for(int i=0; i<vector.length; i++){
            vector[i] = (int) (Math.random()*101);
            if (vector[i]>masAlto){
                masAlto = vector[i];
            }
            else if(vector[i]<masBajo){
                masBajo = vector[i];
            }
        }
        System.out.println(Arrays.toString(vector));
        System.out.println(masAlto);
        System.out.println(masBajo);

    }
}
