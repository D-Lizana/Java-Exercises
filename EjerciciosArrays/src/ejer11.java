// (L2) 5. Hacer un programa que pida un numero por teclado y después diga si el numero introducido es capicúa o no. (Mejora con String)

import java.util.Scanner;

public class ejer11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce numero: ");
        int numero = teclado.nextInt();

        String palabra = String.valueOf(numero);
        boolean esCapicua = true;

        for (int i=0; i<(palabra.length()/2); i++){
            if (palabra.charAt(i) != palabra.charAt((palabra.length()-1)-i)){
                esCapicua = false;
                break;
            }
        }

        if(esCapicua){
            System.out.println("El número es capicúa.");
        }
        else{
            System.out.println("El número no es capicúa.");
        }

    }
}
