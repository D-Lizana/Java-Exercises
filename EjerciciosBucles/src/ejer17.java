//(L2) 3. Escribe un programa que lea una lista de diez números y determine cuántos son positivos, y cuántos son negativos.

import java.util.Scanner;

public class ejer17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int positivo = 0;
        int negativo = 0;

        for(int i=0; i<10; i++){
            System.out.println("Introduce un número: ");
            int numero = teclado.nextInt();
            if(numero<0){
                negativo++;
            }
            else{
                positivo++;
            }
        }
        System.out.println(positivo);
        System.out.println(negativo);

    }
}
