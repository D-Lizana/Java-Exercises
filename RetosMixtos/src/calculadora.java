import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String decision = "si";
        do{
            int numeroUno = teclado.nextInt();
            String operando = teclado.next();
            int numeroDos = teclado.nextInt();

            switch(operando){
                case "+":
                    System.out.println(numeroUno+" + "+numeroDos+ " = "+(numeroUno+numeroDos));
                    break;
                case "-":
                    System.out.println(numeroUno+" - "+numeroDos+ " = "+(numeroUno-numeroDos));
                    break;
                case "*":
                    System.out.println(numeroUno+" * "+numeroDos+ " = "+(numeroUno*numeroDos));
                    break;
                case "/":
                    System.out.println(numeroUno+" / "+numeroDos+ " = "+(numeroUno/numeroDos));
                    break;
                case "**":
                    int solucion = numeroUno;
                    for (int i=1; i<numeroDos; i++)
                        solucion*=numeroUno;
                    System.out.println(numeroUno+" ** "+numeroDos+ " = "+(solucion));
                    break;
            }

            System.out.println("Quieres realizar otra operación? (si/no)");
            decision = teclado.next().toLowerCase();
        }while(decision.equals("si"));

    }
}
