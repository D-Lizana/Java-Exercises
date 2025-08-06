package OrientadaAObjetos;

// Es como una clase pero para datos que siempre son constantes (Dias de la semana, nombres, colores...)
public enum Tipo {
    TODOTERRENO("Todoterreno", 5, "Coche Grande"),
    CAMIONETA("Camioneta", 4, "Grande"),
    FURGONETA("Furgoneta", 5, "Coche grande"),
    DESCAPOTABLE("Descapotable", 3, "Coche deportivo"),
    COMPACTO("Compacto", 3, "Coche pequeño");

    private final String nombre;
    private final int numeroPuertas;
    private final String descripcion;

    Tipo(String nombre, int numeroPuertas, String descripcion) {
        this.nombre = nombre;
        this.numeroPuertas = numeroPuertas;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
