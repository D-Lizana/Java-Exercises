// 2. Hacer un programa que rellene un array con los 100 primeros números enteros y los muestre en pantalla en orden inverso a como se han introducido (orden inverso). (L1)

public class ejer8 {
    public static void main(String[] args) {
        int[] lista = new int[100];
        for (int i = 0; i<lista.length; i++ ){
            lista[i] = i+1;
        }

        for (int j = lista.length-1; j>=0; j--){
            System.out.println(lista[j] + "");
        }
    }
}
