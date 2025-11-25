package uax;

import jakarta.transaction.SystemException;
import uax.dao.GestionBD;
import uax.model.Coche;

import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        GestionBD gestionBD = new GestionBD();

        do {
            System.out.println("\n===== MENÚ CONCESIONARIO UAX =====");
            System.out.println("1. Dar de alta un coche nuevo");
            System.out.println("2. Vender un coche a un cliente");
            System.out.println("3. Ver coches disponibles");
            System.out.println("4. Ver coches vendidos");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Introduce marca: ");
                    String marca = sc.nextLine();

                    System.out.println("Introduce modelo: ");
                    String modelo = sc.nextLine();

                    System.out.println("Introduce año de fabricación: ");
                    int anno = Integer.parseInt(sc.nextLine());

                    System.out.println("Introduce precio: ");
                    double precio = Double.parseDouble(sc.nextLine());

                    try{
                        Coche coche = new Coche(marca,modelo,anno,precio);
                        gestionBD.guardarCoche(coche);
                    } catch (SystemException e) {
                        System.out.println("Error del sistema." + e.getMessage());
                    }
                    break;

                case 2:
                    try{
                        gestionBD.venderCoche();
                    } catch (SystemException e) {
                        System.out.println("Error del sistema." + e.getMessage());
                    }
                    break;

                case 3:
                    gestionBD.mostrarCochesDisponibles();
                    break;

                case 4:
                    gestionBD.mostrarCochesVendidos();
                    break;

                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }

        } while(opcion != 5);
        sc.close();
    }
}
