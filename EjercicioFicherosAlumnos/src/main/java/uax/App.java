package EjercicioFicherosAlumnos.src.main.java.uax;

import java.util.Scanner;

public class App
{
    public static void main( String[] args ) {

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== MENÚ DE GESTIÓN DE ALUMNOS ===");
            System.out.println("1. Dar de alta un alumno/a");
            System.out.println("2. Dar de baja un alumno/a");
            System.out.println("3. Insertar nota a un alumno/a");
            System.out.println("4. Modificar nota de un alumno/a");
            System.out.println("5. Consultar nota de un alumno/a");
            System.out.println("6. Consultar todas las notas");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Dar de alta un alumno/a...");
                    // darDeAltaAlumno();
                    break;

                case 2:
                    System.out.println("Dar de baja un alumno/a...");
                    // darDeBajaAlumno();
                    break;

                case 3:
                    System.out.println("Insertar nota a un alumno/a...");
                    // insertarNota();
                    break;

                case 4:
                    System.out.println("Modificar nota de un alumno/a...");
                    // modificarNota();
                    break;

                case 5:
                    System.out.println("Consultar nota de un alumno/a...");
                    // consultarNota();
                    break;

                case 6:
                    System.out.println("Consultar todas las notas...");
                    // consultarTodasLasNotas();
                    break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }

        } while (opcion != 0);
        sc.close();




    }
}
