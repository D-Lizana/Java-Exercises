import java.util.*;
public class ejercicioUnidad5 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        boolean salir = false;
        ArrayList<Double> temperaturas = new ArrayList();

        while(!salir){

            System.out.println("Introduce la opción deseada");
            System.out.println("1 - Añadir temperatura");
            System.out.println("2 - Mostrar temperatura media");
            System.out.println("3 - Mostrar temperaturas extremas");
            System.out.println("4 - Salir");
            System.out.println("Introduce la opción deseada");

            int opcion = teclado.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Introduce temperatura: ");
                    double temperatura = teclado.nextDouble();
                    temperaturas.add(temperatura);
                    break;

                case 2:
                    int total = 0;
                    for (int i=0; i<temperaturas.size(); i++){
                        total+=temperaturas.get(i);
                    }
                    System.out.println("Temperatura media: "+(total/temperaturas.size()));
                    break;

                case 3:
                    double tempMax = Double.MIN_VALUE;
                    double tempMin = Double.MAX_VALUE;
                    for (int i=0; i<temperaturas.size(); i++){
                        if(temperaturas.get(i)<tempMin){
                            tempMin=temperaturas.get(i);
                        }
                        else if(temperaturas.get(i)>tempMax){
                            tempMax=temperaturas.get(i);
                        }
                    }
                    
                    if(tempMin == Double.MAX_VALUE){
                        tempMin = tempMax;
                    }
                    else if(tempMax == Double.MIN_VALUE){
                        tempMax = tempMin;
                    }

                    System.out.println("Temperatura máxima: "+tempMax);
                    System.out.println("Temperatura mínima: "+tempMin);
                    break;

                case 4:
                    salir = true;
                    break;

            }

        }

        System.out.println("Programa finalizado.");

    }
}
