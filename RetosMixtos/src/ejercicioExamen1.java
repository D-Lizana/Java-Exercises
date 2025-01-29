import java.util.ArrayList;
import java.util.Arrays;

public class ejercicioExamen1 {
    public static void main(String[] args){

        int[] numero1 = {1,9,2,4,5,7,3,2,4};
        int[] numero2 = {9,5,1,5,1,9,1,3,2};

        ArrayList<Integer> resultado = new ArrayList();
        int acarreo = 0;
        for (int i=numero1.length-1; i>=0; i--){
            int suma=numero1[i]+numero2[i]+acarreo;
            if (suma>=10){
                resultado.add(0, (suma-10));
                // resultado.set(i, suma-10)
                // resultado.remove
                acarreo = 1;
            }
            else{
                resultado.add(0, suma);
                acarreo = 0;
            }
        }
        if(acarreo==1){
            resultado.add(0, 1);
        }

        System.out.println(Arrays.toString(numero1));
        System.out.println(Arrays.toString(numero2));
        System.out.println(resultado);






    }
}
