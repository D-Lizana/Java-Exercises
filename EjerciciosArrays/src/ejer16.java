//(L2) 3. Escribe un programa que genere aleatoriamente un array de 15 componentes y muestre los valores máximo
// y mínimo junto con las palabras “máximo” y “mínimo” al lado respectivamente.

import java.util.Arrays;

public class ejer16 {
    public static void main(String[] args) {
        int[] array = new int[15];
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;

        for(int i=0; i<array.length; i++){
            array[i] = (int) (Math.random()*100);
        }

        System.out.println(Arrays.toString(array));

        for(int i=0; i<array.length; i++){
            if(array[i] < minimo){
                minimo = array[i];
            }
            else if(array[i] > maximo){
                maximo = array[i];
            }
        }

        System.out.println("Máximo = "+maximo);
        System.out.println("Mínimo = "+minimo);
    }
}
