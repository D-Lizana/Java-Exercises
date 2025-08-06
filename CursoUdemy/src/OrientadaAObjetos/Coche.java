package OrientadaAObjetos;

public class Coche {

    private int id;
    private String fabricante;
    private String modelo;
    private String color;
    private double cilindrada;

    private static String colorMatricula = "Rojigualda";
    private static int ultimoId;


    public Coche(){
        this.id = ++ultimoId;
    }

    public Coche(String fabricante, String modelo){
        this();
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public Coche(String fabricante, String modelo, String color){
        this(fabricante,modelo);
        this.color = color;
    }

    public Coche(String fabricante, String modelo, String color, double cilindrada){
        this(fabricante,modelo,color);
        this.cilindrada = cilindrada;
    }

    public void setFabricante(String fabricante){
        this.fabricante = fabricante;
    }

    public String getFabricante(){
        return this.fabricante;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Como son para el atributo que tiene static, tenemos que añadir static en el getter y setter también
    public static String getColorMatricula() {
        return colorMatricula;
    }

    public static void setColorMatricula(String colorMatricula) {
        // En este caso no podemos usar this porque static pertenece a la clase y no a la instancia, por eso llamamos directamente a la clase y la modificamos
        Coche.colorMatricula = colorMatricula;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", cilindrada=" + cilindrada +
                ", colorMatricula='" + colorMatricula + '\'' +
                '}';
    }

    public String detalles(){
        StringBuilder sb = new StringBuilder();
        sb.append("Fabricate = " + this.fabricante);
        sb.append("\nModelo = " + this.modelo);
        sb.append("\nColor= " + this.color);
        sb.append("\nCilindrada = " + this.cilindrada);
        sb.append("\nCilindrada = " + colorMatricula);

        return sb.toString();
    }

    public void calcularConsumo(int km, double litrosGastados){
        System.out.println("El gasto es de " + litrosGastados/(km/100) + " litros cada 100km");
    }


}
