
public class Coche {
    private String marca;
    private String modelo;
    private double km;
    private String combustible;
    private String color;
    private double precio;

    public Coche(){

    }

    public Coche(String marca, String modelo, double km, double precio){
        this.marca = marca;
        this.modelo = modelo;
        this.km = km;
        this.precio = precio;
    }

    public Coche(String marca, String modelo, double km, String combustible, String color, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.km = km;
        this.combustible = combustible;
        this.color = color;
        this.precio = precio;
    }

    public void pasarITV(){
        precio+=60;
    }

    public void pagarAveria(double precioAveria){
        precio+=precioAveria;
    }

    public String bitCoin(){
        return "El precio del coche en Bitcoin es: "+(precio/94550.82)+" Bitcoin";
    }

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", km=" + km +
                ", combustible='" + combustible + '\'' +
                ", color='" + color + '\'' +
                ", precio=" + precio +
                '}';
    }

    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
