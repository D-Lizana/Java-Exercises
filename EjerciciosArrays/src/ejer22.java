// Almacenar los nombres, notas y estados (Aprobado/Reprobado) de los estudiantes en tres arrays paralelos.
//Permitir al usuario ingresar la cantidad de estudiantes y sus respectivos datos.
//Determinar automáticamente si un estudiante ha aprobado (nota ≥ 5) o reprobado (nota < 5).
//Mostrar los datos en formato de tabla.

import java.util.Scanner;

public class ejer22 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce número de alumnos");
        int numero = teclado.nextInt();


        String[] alumnos = new String[numero];
        int[] notas = new int[numero];
        String[] resultado = new String[numero];

        for(int i=0; i<alumnos.length; i++){
            System.out.println("Introduce alumno: ");
            alumnos[i] = teclado.next();

            System.out.println("Introduce nota: ");
            notas[i] = teclado.nextInt();

            if(notas[i]>=5){
                resultado[i] = "Aprobado";
            }
            else{
                resultado[i] = "Suspenso";
            }

            System.out.println(alumnos[i] +" | "+ notas[i] +" | "+ resultado[i]);
        }

        for(int i=0; i<alumnos.length; i++){
            System.out.println(alumnos[i] +" | "+ notas[i] +" | "+ resultado[i]);
        }
    }
}
