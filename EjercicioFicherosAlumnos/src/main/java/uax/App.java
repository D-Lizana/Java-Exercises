package uax;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class App {


    public static void main( String[] args ) {

        File archivo = new File("archivo.txt");
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

            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1:
                    System.out.println("Expediente: ");
                    int expediente = Integer.parseInt(sc.nextLine());

                    System.out.println("Nombre y Apellidos: ");
                    String nombre = sc.nextLine();

                    Alumno alumnoCreado = new Alumno(expediente, nombre);

                    listaDeAlumnos.anadirAlumno(alumnoCreado);

                    try(BufferedWriter bw = new BufferedWriter(new FileWriter("archivo.txt", true))){
                        bw.write(alumnoCreado.toString());

                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    break;

                case 2:
                    System.out.println("Expediente: ");
                    int expediente2 = Integer.parseInt(sc.nextLine());

                    listaDeAlumnos.bajaAlumno(expediente2);

                    try(BufferedWriter bw = new BufferedWriter(new FileWriter("archivo.txt"))){

                        for(Alumno alumno: listaDeAlumnos.getAlumnos()){
                            bw.write(alumno.toString());
                        }

                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }


                    break;

                case 3:
                    System.out.println("Seleccione expediente: ");
                    int expediente3 = Integer.parseInt(sc.nextLine());

                    System.out.println("Introduzca nota: ");
                    double nota3 = Double.parseDouble(sc.nextLine());

                    listaDeAlumnos.insertarNota(expediente3,nota3);



                    break;

                case 4:
                    System.out.println("Seleccione expediente: ");
                    int expediente4 = Integer.parseInt(sc.nextLine());

                    System.out.println("Introduzca nueva nota: ");
                    double nota4 = Double.parseDouble(sc.nextLine());

                    listaDeAlumnos.insertarNota(expediente4,nota4);
                    break;

                case 5:
                    System.out.println("Expediente: ");
                    int expediente5 = Integer.parseInt(sc.nextLine());

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

    public static void crearAlumno(){
        System.out.println("Expediente: ");
        int expediente = Integer.parseInt(sc.nextLine());

        System.out.println("Nombre y Apellidos: ");
        String nombre = sc.nextLine();

        Alumno alumnoCreado = new Alumno(expediente, nombre);

        listaDeAlumnos.anadirAlumno(alumnoCreado);
    }


}
