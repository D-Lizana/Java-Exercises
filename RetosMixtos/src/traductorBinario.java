public class traductorBinario {
    public static void main(String[] args){

        int[] numeroBinario = {1,0,1,1,0,1,0,0};
        int[] valores = {128,64,32,16,8,4,2,1};
        int acumulador = 0;

        for (int i=0; i<numeroBinario.length; i++){
            if(numeroBinario[i]==1){
                acumulador = acumulador + valores[i];
            }
        }

        System.out.println(acumulador);

    }
}
