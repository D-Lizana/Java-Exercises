//OK (L2) 12. Realiza un programa que nos diga cuántos dígitos tiene un número introducido por teclado.

import java.util.Scanner;

public class ejer10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();
        String numeroMod = String.valueOf(numero);
        System.out.println(numeroMod.length());
    }
}
