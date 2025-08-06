package OrientadaAObjetos;

public class EjemploCocheSwitch {
    public static void main(String[] args) {

        Coche dacia = new Coche("Dacia","Duster",Color.AZUL,200.0);
        dacia.setTipo(Tipo.TODOTERRENO);

        System.out.println(dacia.detalles());
        dacia.calcularConsumo(500,40);

        System.out.println(Coche.V_MAX_CARRETERA);
        System.out.println(Tipo.TODOTERRENO.getNombre());

        Tipo tipo = dacia.getTipo();

        switch(tipo){
            case COMPACTO ->
                System.out.println("Un coche pequeño y útil para ciudad.");
            case TODOTERRENO ->
                System.out.println("Un coche grande y útil para caminos y campo.");
            case CAMIONETA ->
                System.out.println("Camión pequeño perfecto para transportar mercancias por ciudad.");
            case FURGONETA ->
                System.out.println("Un coche grande para llevar varios pasajeros o mercancias");
            case DESCAPOTABLE ->
                System.out.println("Un coche deportivo, rápido y elegante");
        }

    }
}
