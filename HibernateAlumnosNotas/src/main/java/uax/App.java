package uax;

import jakarta.transaction.SystemException;
import uax.controller.AppController;

public class App {
    public static void main( String[] args ) throws SystemException {

        AppController ac = new AppController();
        ac.mostrarMenu();
    }
}
