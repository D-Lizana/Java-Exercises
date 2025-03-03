import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class Presencial1Reader {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileReader polla = new FileReader("correo.txt");
        BufferedReader ficheroCorreo = new BufferedReader(polla);
        String linea = "";

        while(linea!=null){
            linea = ficheroCorreo.readLine();
            if(linea.startsWith("From: ")){
                System.out.println(linea.substring(6));
                System.out.println(linea.replace("From: ",""));
            }
            else if(linea.startsWith("Subject: ")){
                System.out.println(linea.replace("Subject: ",""));
            }
            else if(linea.startsWith("To: ")){
                System.out.println(linea.replace("To: ",""));
            }
            else if(linea.startsWith("Message Body: ")){
                System.out.println(linea.replace("Message Body: ",""));
            }
        }
    }
}
