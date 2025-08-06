package OrientadaAObjetos;

public class EjemplyCoche {
    public static void main(String[] args) {

        Coche dacia = new Coche("Dacia","Duster",Color.AZUL,200.0);

        System.out.println(dacia.detalles());
        dacia.calcularConsumo(500,40);

    }
}
