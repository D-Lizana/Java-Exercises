// Escribe un programa en Java que solicite al usuario que ingrese un número y luego intente dividir 100 entre ese número.
// Maneja la excepción en caso de que el usuario ingrese un cero (evitando la división por cero) o un valor no numérico.


import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicioExcepcion {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Ingrese un número: ");
            int numero = scanner.nextInt();

            // Verificar si el número es cero
            if (numero == 0) {
                System.out.println("Error: No se puede dividir entre cero.");
            } else {
                int resultado = 100 / numero;
                System.out.println("Resultado: 100 / " + numero + " = " + resultado);
            }

        } catch (InputMismatchException e) {
            System.out.println("Error: No puedes introducir letras.");
        }
    }
}
