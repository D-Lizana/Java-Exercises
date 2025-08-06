import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PracticaReader {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedReader texto = new BufferedReader(new FileReader("texto.txt"));
        String linea = texto.readLine();;

        while(linea!=null){

            if(linea.contains("lo que sea")){
                System.out.println("dale");
            }


            linea = texto.readLine();
        }
    }
}
