package uax.controller;

import uax.model.Coche;

import java.util.Scanner;

public class AppController {
    Scanner sc = new Scanner(System.in);
    int opcion;
    GestionDB gestionBD = new GestionDB();


        do {
        System.out.println("\n===== MENÚ CONCESIONARIO UAX =====");
        System.out.println("1. Dar de alta un coche nuevo");
        System.out.println("2. Vender un coche a un cliente");
        System.out.println("3. Ver coches disponibles");
        System.out.println("4. Ver coches vendidos");
        System.out.println("5. Salir");
        System.out.print("Elige una opción: ");

        opcion = sc.nextInt();
        sc.nextLine(); // Limpiar buffer

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

                Coche coche = new Coche(marca,modelo,anno,precio);
                gestorJSON.insertarCocheNuevo(coche);
                break;

            case 2:
                gestorJSON.mostrarCochesNuevos();
                System.out.println("Introduce el número del coche que quieres vender: ");
                int index = Integer.parseInt(sc.nextLine());

                Coche cocheVender = gestorJSON.cogerCochePorOrden(index);

                System.out.println("Introduce el nombre del cliente: ");
                String nombreCliente = sc.nextLine();

                System.out.println("Introduce el apellido del cliente: ");
                String apellidoCliente = sc.nextLine();

                System.out.println("Introduce el DNI del cliente: ");
                String dniCliente = sc.nextLine();

                Cliente cliente = new Cliente(nombreCliente,apellidoCliente,dniCliente);

                gestorJSON.eliminarCoche(cocheVender);
                gestionBD.insertarCocheVendido(cocheVender,cliente);

                break;

            case 3:
                gestorJSON.mostrarCochesNuevos();
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
    } while (opcion != 5);
        sc.close();
}
