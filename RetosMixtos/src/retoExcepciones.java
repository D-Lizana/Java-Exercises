// Importamos la parte de Scanner del paquete de java.util para poder usarlo
import java.util.Scanner;

public class retoExcepciones {
    public static void main(String[] args){

        // Primero creamos el Scanner para poder introducir datos por consola
        Scanner teclado = new Scanner(System.in);

        // Imprimimos un mensaje solicitando al usuario el correo electrónico que se va a validar
        System.out.println("Introduce tu correo electrónico:");

        // Usamos la variable email para almacenar el String con el correo que se introduce por Scanner
        String email = teclado.next();

        // a) Debe de tener el símbolo @

        /*
        Ahora tenemos que crear una nueva clase que incluya la excepcion personalizada que vamos a utilizar,
        en este caso se encuentra al final del programa:

           class ExcepcionEmail extends Exception{

                public ExcepcionEmail(String message){
                    super(message);
                }
            }
         */

        // Para analizar la primera condicion creamos un try catch
        try{
            // Ponemos como condicion que si no encuentra @ en ninguna parte del String lance la excepcion con un mensaje
            if(!email.contains("@")){
                throw new ExcepcionEmail("El correo debe contener '@'.");
        }
        }catch(ExcepcionEmail ex){
                ex.printStackTrace();
            }

        //b) Que acabe por un dominio válido, en nuestro caso será .com y .es
        // Para la segunda condicion seguimos el mismo metodo
        try{
            // En este caso la condicion es que el final del string contenga .com o .es
            // Sino es así, salta el mensaje correspondiente de la excepción
            if(!email.endsWith(".com") && !email.endsWith(".es")){
                throw new ExcepcionEmail("El correo tiene que terminar por un dominio válido (.com o .es).");
            }
        }catch(ExcepcionEmail ex){
            ex.printStackTrace();
        }


        // c) El correo electrónico debe empezar siempre por una letra, nunca por un número.
        // Repetimos el proceso de try-catch una ultima vez

        // En este caso creamos una variable que almacene el primer caracter del String, que es el que se va a analizar
        // No es necesario crear la variable, se podría escribir email.charAt(0) en el if
        char primerChar = email.charAt(0);

        try{
            // Si el caracter almacenado en la variable primerChar no es una letra, entonces lanza la excepción
            if(!Character.isLetter(primerChar)){
                throw new ExcepcionEmail("El primer caracter tiene que ser una letra.");
            }
        }catch(ExcepcionEmail ex){
            ex.printStackTrace();
        }

    }
}

// Esta es la clase que creamos para nuestra excepcion personalizada y a la que el programa principal recurre
class ExcepcionEmail extends Exception{

    public ExcepcionEmail(String message){
        super(message);
    }
}

// Una vez acabado el programa, si el correo no es válido, apareceran en la consola los mensajes de excepcion correspondientes