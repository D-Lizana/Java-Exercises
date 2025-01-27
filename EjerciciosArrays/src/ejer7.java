// 1. Hacer un programa que calcule la letra de un DNI. Se pedirá el DNI por teclado y devolverá el DNI la letra.
// Para bus car la letra, se calcula el resto de dividir el dni entre 23, y con el resultado que estará entre 0 y 22,
// se busca en el array de caracteres la letra correspondiente. El orden de los caracteres es: (L1)

import java.util.Scanner;

public class ejer7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] letraDni = {"T","R","W","A","G","M","Y","F","P","D","X","B"

                ,"N","J","Z","S","Q","V","H","L","C","K","E"};

        System.out.println("Introduce DNI:");
        int dni = scanner.nextInt();

        System.out.println("La letra del DNI es: "+letraDni[dni%23]);
    }
}
