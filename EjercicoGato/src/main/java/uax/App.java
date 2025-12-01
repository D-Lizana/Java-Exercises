package uax;

import uax.services.BinarioService;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){

        String rutaBinario = "src/main/resources/gatos.bin";

        BinarioService gatosBinario = new BinarioService(rutaBinario);


    }
}
