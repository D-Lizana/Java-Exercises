// Importamos la parte de ArrayList del paquete de java.util para poder usarlo
import java.util.ArrayList;

public class datosMeteorologicos {
    public static void main(String[] args){
        // a) Declara los arrays
        // Un array de Strings para el nombre de los meses y arrays de double para las temperaturas y probabilidad de lluvia con decimales.
        String[] mes = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        double[] temperatura = {1.0,3.2,6.2,12.2,20.1,19.7,21.2,29.3,20.2,10.3,6.3,2.2};
        double[] lluvia = {10.3,3.2,99.0,97.2,34.8,24.8,5.3,1.2,20.3,28.0,30.2,10.3};

        //b) ¿Cúal es el mes más lluvioso?

        // la variable "mesLluvioso" almacena el dato del mes con mas probablididad de lluvia del bucle
        int mesLluvioso = 0;
        // la variable "masLluvia" la uso para comparar la probabilidad de lluvia con la del mes anterior en cada iteración del bucle
        double masLluvia = 0;

        // un bucle for que recorre la longitud del array
        for (int i=0; i<mes.length; i++){
            if(lluvia[i]>masLluvia){
                //si el valor de lluvia es superior al almacenado en "masLluvia" entonces lo sustituye
                masLluvia = lluvia[i];
                // además guarda "mesLluvioso" como el mes con mas probabilidad de lluvia hasta el momento
                mesLluvioso = i;
            }
        }
        // al final imprime el mes en la posicion del array guardada en "mesLluvioso"
        System.out.println("El mes más lluvioso es: "+mes[mesLluvioso]);

        //c) Media de temperaturas:

        // variable para acumular la suma de todos los valores del array
        double acumulador = 0;

        // bucle for para sumar todas las temperaturas del array
        for (int i=0; i<temperatura.length; i++){
            acumulador += temperatura[i];
        }

        // calculamos la media dividiendo el acumulador por el numero de meses
        double tempMedia = acumulador/mes.length;
        //redondeamos el resultado del double
        double redondeador = Math.round(tempMedia * 100.0)/100.0;
        // imprimimos el resultado
        System.out.println("La media de temperaturas en 2022 fue: "+ redondeador+"ºC.");

        //d) Calcular meses con lluvia entre 0 y 25, y temperatura entre 10 y 25 grados:

        // Un ArrayList de String donde se van a guardar los meses que cumplan las condiciones
        ArrayList<String> mesesBuenos = new ArrayList();

        // Un bucle for para que recorra las caracteristicas de cada mes
        for (int i=0; i<mes.length; i++){
            // Ponemos las condiciones de lluvia y temperatura que nos interesan dentro del mismo if (pensé en hacerlo con booleans pero esto me parecio lo mas rapido y facil)
            if(lluvia[i]>0 && lluvia[i]<25 && temperatura[i]>10 && temperatura[i]<25){
                //Si se cumplen todas las condiciones se añade el mes desde el array "mes" al ArrayList "mesesBuenos"
                mesesBuenos.add(mes[i]);
            }
        }
        //Por ultimo imprimimos los resultados que han quedado guardados en "mesesBuenos"
        System.out.println("Los meses con mejores condiciones para ir son: "+mesesBuenos);

    }
}
