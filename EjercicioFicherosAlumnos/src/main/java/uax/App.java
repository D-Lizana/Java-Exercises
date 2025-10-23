package EjercicioFicherosAlumnos.src.main.java.uax;

import java.util.Scanner;

public class App
{
    public static void main( String[] args ) {

        Scanner sc = new Scanner(System.in);
        int opcion;

        ListaDeAlumnos listaDeAlumnos = new ListaDeAlumnos();

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
                    System.out.println("Expediente: ");
                    int expediente = sc.nextInt();

                    System.out.println("Nombre y Apellidos: ");
                    String nombre = sc.nextLine();

                    Alumno alumno = new Alumno(expediente, nombre);

                    listaDeAlumnos.anadirAlumno(alumno);
                    break;

                case 2:
                    System.out.println("Expediente: ");
                    int expediente2 = sc.nextInt();

                    listaDeAlumnos.bajaAlumno(expediente2);
                    break;

                case 3:
                    System.out.println("Seleccione expediente: ");
                    int expediente3 = sc.nextInt();

                    System.out.println("Introduzca nota: ");
                    double nota3 = sc.nextDouble();

                    listaDeAlumnos.insertarNota(expediente3,nota3);

                    break;

                case 4:
                    System.out.println("Seleccione expediente: ");
                    int expediente4 = sc.nextInt();

                    System.out.println("Introduzca nueva nota: ");
                    double nota4 = sc.nextDouble();

                    listaDeAlumnos.insertarNota(expediente4,nota4);
                    break;

                case 5:
                    System.out.println("Expediente: ");
                    int expediente5 = sc.nextInt();

                    listaDeAlumnos.consultarNota(expediente5);
                    break;

                case 6:
                    listaDeAlumnos.consultarTodasNotas();
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
