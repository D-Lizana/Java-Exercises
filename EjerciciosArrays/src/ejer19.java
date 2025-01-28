//(L2) 6. Realiza un programa que pida la temperatura media que ha hecho en cada mes de un determinado año
// y que muestre a continuación un diagrama de barras horizontales con esos datos.
// Las barras del diagrama se pueden dibujar a base de asteriscos.

import java.util.Scanner;

public class ejer19 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] meses = new int[12];

        for(int i=0; i<meses.length; i++){
            System.out.println("Introduce la temperatura media del mes "+(i+1)+":");
            meses[i] = teclado.nextInt();
        }

        for(int i=0; i<meses.length; i++){
            System.out.print("Mes "+(i+1)+": ");
            for (int j=1; j<=meses[i]; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
