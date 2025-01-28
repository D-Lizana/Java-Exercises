//(L3) 4. Escribe un programa que genere aleatoriamente un array de 20 componentes y rote los elementos del array,
// es decir, el elemento de la posición 0 debe pasar a la posición 1, el de la 1 a la 2, etc.
// El número que se encuentra en la última posición debe pasar a la posición 0. Finalmente, mostrar el contenido del array.

import java.util.Arrays;

public class ejer17 {
    public static void main(String[] args) {
        int[] array = new int[20];

        for(int i=0; i<array.length; i++){
            array[i] = (int) (Math.random()*100);
        }

        System.out.println(Arrays.toString(array));

        int ultimovalor = array[array.length-1];

        for(int i=array.length-1; i>=0; i--){
            if (i==0){
                array[i] = ultimovalor;
            }
            else{
                array[i] = array[i-1];
            }
        }
        System.out.println("Rotando a la derecha: ");
        System.out.println(Arrays.toString(array));

    }
}
