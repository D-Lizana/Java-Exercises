// L1) 2. Define tres arrays de 20 números enteros cada una, con nombres número, cuadrado y cubo.
// Carga el array numero con valores aleatorios entre 0 y 100. En el array cuadrado se deben almacenar los cuadrados de los valores que hay en el array número.
// En el array cubo se deben almacenar los cubos de los valores que hay en número. A continuación, muestra el contenido de los tres arrays dispuesto en tres columnas.

import java.util.Arrays;

public class ejer15 {
    public static void main(String[] args) {

        int[] arrayNumero = new int[20];
        int[] arrayCuadrado = new int[20];
        int[] arrayCubo = new int[20];

        for(int i=0; i<arrayNumero.length; i++){
            arrayNumero[i] = (int) (Math.random()*100);
        }
        System.out.println(Arrays.toString(arrayNumero));

        for(int i=0; i<arrayNumero.length; i++){
            arrayCuadrado[i] = arrayNumero[i]*arrayNumero[i];
        }
        System.out.println(Arrays.toString(arrayCuadrado));

        for(int i=0; i<arrayNumero.length; i++){
            arrayCubo[i] = arrayCuadrado[i]*arrayNumero[i];
        }
        System.out.println(Arrays.toString(arrayCubo));

    }
}
