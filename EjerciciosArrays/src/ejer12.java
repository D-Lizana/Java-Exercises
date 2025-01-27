//(L2) 6. Hacer un programa que lea 100 números aleatorios entre 0 y10 y genere un histograma con las frecuencias de cada numero.
// Para representar las barras del histograma se utilizara secuencias ‘*’.

public class ejer12 {
    public static void main(String[] args) {
        int[] resultados = new int[100];

        for (int i=0; i<100; i++){
            resultados[i] = (int) (Math.random()*11);
        }
        for (int j=0; j<=10; j++){
            System.out.print(j+": ");
            for (int k=0; k<resultados.length; k++){
                if(resultados[k] == j){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
