//3. Hacer un programa que cree un array de 10 posiciones de números aleatorios entre 1 y 100.
// Posteriormente se pedirá por teclado una posición y se mostrara en pantalla que valor tiene esa posición. (L1)

import java.util.Scanner;

public class ejer9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] listaAleatoria = new int[10];
        for (int i=0; i< listaAleatoria.length; i++){
            listaAleatoria[i] = (int) (Math.random()*100);
            System.out.println(listaAleatoria[i]);

        }
        System.out.println("Introduce un número del 1 al 10: ");
        int numero = scanner.nextInt();

        System.out.println(listaAleatoria[numero-1]);

    }
}
