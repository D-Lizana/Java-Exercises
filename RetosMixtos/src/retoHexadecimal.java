// Primero importamos el paquete java.util para poder usar tanto Scanner como ArrayList is fuera necesario
import java.util.*;

public class retoHexadecimal {
    public static void main(String[] args){

        // Creamos el escaner para poder introducir datos por consola
        Scanner teclado = new Scanner(System.in);

        // Creamos un Array de caracteres donde se va a almacenar en cada posicion el numero introducido
        char[] numeroHexadecimal = new char[4];

        // Pedimos por consola el numero hexadecimal que se va a convertir a decimal
        System.out.println("Introduce número hexadecimal de tamaño 4: ");
        // Almacenamos el numero en una variable tipo String y nos aseguramos de que las letras esten en mayusculas para luego compararlas con el array de hexadecimal
        String numeroIntroducido = teclado.next().toUpperCase();

        // Ahora un bucle importante, con el que asignamos a cada hueco del array de caracteres el caracter correspondiente del numero introducido por teclado en forma de string
        for (int i=0; i<numeroHexadecimal.length; i++){
            numeroHexadecimal[i] = numeroIntroducido.charAt(i);
        }
        // ya tenemos nuestro numero hexadecimal en caracteres, ahora vamos a transformarlo poco a poco a decimal

        // Para ello creamos distintos arrays con los valores de conversion a decimal
        char[] hexadecimal = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        int[] tablaEquivalenteDecimal = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int[] potencias = {4096,256,16,1};

        // creamos tambien un array donde se va a almacenar en cada posicion el equivalente decimal de cada caracter de la variable numeroHexadecimal
        int[] equivalenteDecimal = new int[4];

        // con este bucle recorremos cada caracter de la variable numeroHexadecimal y lo comparamos con los datos almacenados en array hexadecimal
        for (int i=0; i<numeroHexadecimal.length; i++){
            for (int j=0; j<hexadecimal.length; j++){
                // cuando el caracter de ambas variables coincide, guardamos el equivalente decimal de la posicion correspondiente en el array equivalenteDecimal que hemos creado anteriormente
                if(numeroHexadecimal[i]==hexadecimal[j]){
                    equivalenteDecimal[i] = tablaEquivalenteDecimal[j];
                }
            }
        }

        // ahora creamos una variable donde se va a almacenar el numero decimal traducido
        int numeroDecimal = 0;

        // para traducir finalmente el numero creamos un bucle que revisa cada posicion del array de equivalenteDecimal y lo multiplica por la potencia correspondiente, sumando el resultado en cada iteracion a numeroDecimal
        for(int i=0; i<numeroHexadecimal.length; i++){
            numeroDecimal = numeroDecimal + (equivalenteDecimal[i]*potencias[i]);

        }

        // por ultimo representamos ambos datos, el numero introducido y la conversion a numero decimal final.
        // lo he puesto asi porque funciona imprimir el char[], pero no deberia
        System.out.print(numeroHexadecimal);
        System.out.println(" equivale al número decimal "+numeroDecimal);

        // Mismo print pero usando Arrays.toString()
        System.out.println(Arrays.toString(numeroHexadecimal)+" = "+numeroDecimal);

    }
}
