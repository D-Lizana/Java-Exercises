package OrientadaAObjetos;

public class EjemplyCoche {
    public static void main(String[] args) {

        Coche dacia = new Coche("Dacia","Duster",Color.AZUL,200.0);
        dacia.setTipo(Tipo.TODOTERRENO);

        System.out.println(dacia.detalles());
        dacia.calcularConsumo(500,40);

        System.out.println(Coche.V_MAX_CARRETERA);
        System.out.println(Tipo.TODOTERRENO.getDescripcion());

    }
}
