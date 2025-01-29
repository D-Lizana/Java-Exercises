
import java.util.*;
public class Ahorcado {
    public static void main(String[] args) {
        /*
        Adivinar una palabra a traves de introducir letras
        Numero de intentos definido
        El usuario sabe el numero de letras y posicion
        El usuario ve las letras que ha acertado
         */

        Scanner teclado = new Scanner(System.in);

        String palabra = "murcielago";
        //array de string del tamaño de la palabra a adivinar
        String[] palabraAdivininar = new String[palabra.length()];

        String[] palabraAdivinada = new String[palabra.length()];
        for (int j=0; j<palabra.length(); j++){
            palabraAdivinada[j] = String.valueOf(palabra.charAt(j));
        }

        // rellenar los huecos del string con -
        //Arrays.fill(palabraAdivininar, "-");
        //System.out.println(Arrays.toString(palabraAdivininar));

        // lo mismo
        for (int i=0; i<palabraAdivininar.length; i++){
            palabraAdivininar[i] = "-";
        }
        int intentos = 5;

        do {

            System.out.println("Introduce una letra: ");
            String letra = teclado.next();

            if (!palabra.contains(letra)){
                intentos --;
                System.out.println("Intentos restantes: "+intentos);
            }
            else{
                System.out.println("La letra "+letra+" está en la palabra.");
                for (int i=0; i<palabra.length(); i++){
                    String letraString = String.valueOf(palabra.charAt(i));
                    if(letra.equalsIgnoreCase(letraString)){
                        palabraAdivininar[i] = letra;
                    }
                }
                System.out.println(Arrays.toString(palabraAdivininar));
            }

        }while(intentos!=0 && (!Arrays.equals(palabraAdivininar, palabraAdivinada)));
        // si la palabra no contiene la letra elegida se reduce el contador de intentos
        if (intentos==0){
            System.out.println("Has perdido.");
        }
        else{
            System.out.println("Has ganado.");
        }
    }
}
