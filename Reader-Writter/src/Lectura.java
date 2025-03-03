import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Lectura {
    public static void main(String[] args) throws FileNotFoundException, IOException {

        BufferedReader fichero = new BufferedReader(new FileReader("partido.txt"));
        String linea = fichero.readLine();
        System.out.println(linea);
    }
}
