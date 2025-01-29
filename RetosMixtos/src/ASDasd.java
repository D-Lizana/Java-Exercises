import java.util.*;
public class ASDasd {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número hexadecimal de cuatro dígitos");
        String numeroIntroducido = teclado.next().toUpperCase();

        //Arr ay para separar cada caracter del scanner
        char[] caracteres = numeroIntroducido.toCharArray();

        //Aray dondde e van a guardar los caracteres en forma de String
        String[] numeroHexadecimal = new String[4];

        //Bucle para asignar cada caracter a un hueco del String[]
        for(int i=0; i<numeroHexadecimal.length; i++){
            numeroHexadecimal[i] = String.valueOf(caracteres[i]);
        }

        // Aqui ya tenemos numeroHexadecimal como nuestro array de String que vamos a usar para comparar
        // Ahor vamos a crear los arrays necesarios para comparar y convertir nuestro array a numero decimal

        String [] hexadecimal = {"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};
        int[] tablaEquivalenteDecimal = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int [] potencias ={4096,256,16,1};

        int[] numeroDecimal = new int[4];

        for(int i=0; i<numeroHexadecimal.length; i++){
            for(int j=0; j<hexadecimal.length; j++){
                if(numeroHexadecimal[i].equals(hexadecimal[j])){
                    numeroDecimal[i] = tablaEquivalenteDecimal[j];

                }
            }
        }


        int numeroDecimalFinal = 0;

        for(int i=0; i<numeroDecimal.length; i++){
            numeroDecimalFinal = numeroDecimalFinal + (numeroDecimal[i]*potencias[i]);
        }

        
        System.out.println(Arrays.toString(numeroHexadecimal));
        System.out.println("el número decimal resultante es  "+numeroDecimalFinal);


    }

}