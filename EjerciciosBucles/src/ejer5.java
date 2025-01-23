//OK (L1) 7. Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle do-while.

public class ejer5 {
    public static void main(String[] args) {
        int numero= 5;
        int mult = 0;
        int contador;

        do{
            contador = numero * mult++;
            System.out.println(contador);
        }while(contador<100);

    }
}
