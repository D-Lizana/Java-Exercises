package uax;

import jakarta.xml.bind.JAXBException;
import uax.model.ListaMotos;
import uax.model.Moto;
import uax.services.binarioService;
import uax.services.xmlService;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App
{
    public static void main( String[] args ) throws JAXBException {

       final String BIN_PATH = "src/main/resources/motos.bin";
       final String XML_PATH = "src/main/resources/motos.xml";

       List<Moto> motos = new ArrayList<>();
       ListaMotos motosXML = new ListaMotos();
       Scanner sc = new Scanner(System.in);

       int opcion;


       do{
           System.out.println("\n=== MENÚ DE GESTIÓN DE MOTOS ===");
           System.out.println("1. Crear moto");
           System.out.println("2. Guardar motos en binario");
           System.out.println("3. Leer motos desde binario y mostrar en pantalla");
           System.out.println("4. Guardar motos en XML");
           System.out.println("5. Leer motos desde XML y mostrar en pantalla");

           System.out.println("0. Salir");
           System.out.print("Seleccione una opción: ");

           opcion = Integer.parseInt(sc.nextLine());

           switch (opcion) {
               case 1:
                   System.out.println("Introduce marca: ");
                   String marca = sc.nextLine();

                   System.out.println("Introduce modelo: ");
                   String modelo = sc.nextLine();

                   System.out.println("Introduce cilindrada: ");
                   String cilindrada = sc.nextLine();

                   Moto moto = new Moto(marca,modelo,cilindrada);
                   motos.add(moto);
                   motosXML.addMotos(moto);

                   break;

               case 2:
                   binarioService binarioService = new binarioService(BIN_PATH);
                   binarioService.guardarBinario(motos);
                   System.out.println("Moto guardada en archivo Binario.");
                   break;

               case 3:
                   binarioService binarioService2 = new binarioService(BIN_PATH);
                   List<Moto> motosLeidas = binarioService2.leerBinario();
                   motosLeidas.forEach(System.out::println);
                   break;

               case 4:
                   xmlService xmlService = new xmlService(XML_PATH);
                   xmlService.guardarXML(motosXML);
                   System.out.println("Moto guardada en archivo XML.");
                   break;

               case 5:
                   xmlService xmlService2 = new xmlService(XML_PATH);
                   ListaMotos motosLeidas2 = xmlService2.leerXML();
                   for(Moto motoleida: motosLeidas2.getMotos()){
                       System.out.println(motoleida);
                   }
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
