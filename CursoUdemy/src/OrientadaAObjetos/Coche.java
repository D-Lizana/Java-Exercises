package OrientadaAObjetos;

public class Coche {

    private String fabricante;
    private String modelo;
    private String color;
    private double cilindrada;
    private int deposito = 60;

    public Coche(String fabricante, String modelo, String color, double cilindrada){
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.color = color;
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

    @Override
    public String toString() {
        return "Coche{" +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", cilindrada=" + cilindrada +
                '}';
    }

    public String detalles(){
        StringBuilder sb = new StringBuilder();
        sb.append("Fabricate = " + this.fabricante);
        sb.append("\nModelo = " + this.modelo);
        sb.append("\nColor= " + this.color);
        sb.append("\nCilindrada = " + this.cilindrada);

        return sb.toString();
    }

    public void calcularConsumo(int km, double litrosGastados){
        System.out.println("El gasto es de " + litrosGastados/(km/100) + " litros cada 100km");
    }


}
