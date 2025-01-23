//OK (L1) 5. Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle for.

public class ejer3 {
    public static void main(String[] args) {
        int numero= 5;
        int contador=1;

        for(int i=0; contador<100; i++){
            contador = numero * i;
            System.out.println(contador);
        }
    }
}
