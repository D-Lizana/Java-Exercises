import java.util.Scanner;

class ExcepcionPersonalizada extends Exception{

    public ExcepcionPersonalizada(String message){
        super(message);
    }

}

public class ejercicioExcepciones {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double numero = teclado.nextDouble();

        try{
            if(numero!=0){
                throw new ExcepcionPersonalizada("Eres gilipollas.");
            }

        }catch (ExcepcionPersonalizada ex){
            ex.printStackTrace();
        }
    }
}
