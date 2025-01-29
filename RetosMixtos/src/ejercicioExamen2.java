import java.util.ArrayList;

public class ejercicioExamen2 {
    public static void main(String[] args){

        String[] productos = {"Lápiz","Bolígrafo","Sacapuntas","Borrador","Tiza"};
        double[] precio = {1.95,9.99,0.99,0.89,4.99};
        int[] cantidad = {200,145,300,500,1000};
        double[] nuevoPrecio = new double[5];


        for(int i=0; i<productos.length; i++){
            System.out.println(productos[i]+" PVP: "+precio[i]+" Cantidad: "+cantidad[i]);
        }


        double ventaTotal = 0;

        for(int i=0; i<cantidad.length; i++){
            double ventas = precio[i]*cantidad[i];
            ventaTotal = ventaTotal + ventas;
        }

        System.out.println("Si se vendiera todo la suma ascenderia a: "+ventaTotal);

        for(int i=0; i<cantidad.length; i++){
            if(cantidad[i]<250){
                System.out.println(productos[i]+" tiene menos de 250 unidades en stock.");
            }
        }

        System.out.print("Nuevo precio: ");
        for(int i=0; i<nuevoPrecio.length; i++){
            nuevoPrecio[i] = precio[i]+(precio[i]*0.10);
            System.out.print(nuevoPrecio[i]+" ");
        }
        System.out.println();

        ArrayList<Double> masDinero = new ArrayList();
        for(int i=precio.length-1; i>=0; i--){
            masDinero.add(0, precio[i]+(precio[i]*0.10) );
            System.out.println(masDinero);
        }


    }
}
