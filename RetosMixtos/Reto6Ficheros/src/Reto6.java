import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Reto6 {
    // Nos aseguramos de que el programa lance IOException en caso de que no se encuentre el archivo .html que queremos analizar
    public static void main(String[] args) throws IOException{

        // Primero creamos el FileReader para poder abrir el archivo en cuestión. En este caso para analizar el código fuente de una página web abrimos un .html
        FileReader lector = new FileReader("web.html");
        // Usamos BufferedReader para poder acceder al texto del fichero y analizarlo linea a linea
        BufferedReader paginaWeb = new BufferedReader(lector);
        // Creamos un String y le asignamos como valor la primera linea del texto de la web
        String linea = paginaWeb.readLine();
        // He creado un boolean para que al finalizar el programa nos informe de si ha habido algo sospechoso o no.
        boolean codigoSospechoso = false;
        // Añadimos un contador para que nos diga en que parte del código encuentra elementos extraños.
        int contadorLineas = 1;

        // Ahora ejecutamos un bucle while para que vaya leyendo el texto linea a linea hasta que llegue a una linea vacia (el final)
        while(linea!=null){

            // El código va buscando linea a linea por elementos ocultos que podrían ser maliciosos, y si los encuenta, imprime un mensaje de error junto con el elemento encontrado y la linea del código
            if(linea.contains("style=\"display:none;\"")){
                System.err.println("En la linea "+contadorLineas+" se ha detectado un elemento oculto usando style=\"display:none;\".");
                codigoSospechoso = true;
            }
            if(linea.contains("style=\"font-size:0px;\"")){
                System.err.println("En la linea "+contadorLineas+" se ha detectado un elemento oculto usando style=\"font-size:0px;\".");
                codigoSospechoso = true;
            }
            if(linea.contains("style=\"visibility:hidden;\"")){
                System.err.print("En la linea "+contadorLineas+" se ha detectado un elemento oculto usando style=\"visibility:hidden;\".");
                codigoSospechoso = true;
                // En el caso de que encuentre un link asociado a la linea sospechosa tambien nos avisa.
                if(linea.contains("<a")){
                    System.err.println(" Además podría ser un link malicioso o de spam.");
                }
            }

            // Al final del bucle cambia a la linea siguiente.
            linea = paginaWeb.readLine();
            // El contador de linea se actualiza
            contadorLineas++;
        }

        // Si no encuentra ningún elemento oculto y sospechoso nos avisa de que la web parece limpia. Y si encuentra algo también nos avisa.
        if (!codigoSospechoso){
            System.out.println("No se han encontrado elementos sospechosos o maliciosos en el html de la página web.");
        }
        else{
            System.out.println("El archivo contiene elementos ocultos sospechosos, proceda con cuidado.");
        }
    }
}
