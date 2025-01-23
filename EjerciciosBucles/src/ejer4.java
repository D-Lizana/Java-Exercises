//OK (L1) 6. Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle while.

public class ejer4 {
    public static void main(String[] args) {
        int numero= 5;
        int mult = 0;
        int contador=0;

        while(contador<100){
            contador  = numero * mult++;
            System.out.println(contador);
        }
    }
}
