// 4. Hacer un programa que cree un array cuyo tamaño se pedirá por teclado y cuyo contenido serán números aleatorios entre 1 y 300.
// Posteriormente se creara otro array que guardara aquellos números del primer array que acaben en un dígito que se i ndicara por teclado
// (se debe controlar que se introduce un numero correcto). Finalmente, mostrar por pantalla los dos arrays. (L2). (Mejora con ArrayList)

import java.util.Scanner;

public class ejer10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tamanoLista = scanner.nextInt();

        System.out.println("Elige tamaño de lista: ");
        int[] listaUno = new int[tamanoLista];

        for (int i=0; i<listaUno.length; i++){
            listaUno[i] = (int) (Math.random()*300);
            System.out.print(listaUno[i]+" ");
        }


    }
}
