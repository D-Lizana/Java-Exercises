import java.io.*;
import java.util.Scanner;

public class Escritura {
    public static void main(String[] args) throws IOException{
        FileWriter fichero = new FileWriter("partido.txt", true);
        fichero.write("Real Madrid vs Manchester City");
        Scanner scanner = new Scanner(System.in);

        String texto = scanner.next();
        fichero.write(texto);
        fichero.close();
    }
}
