class Vehiculo{
    private String marca;
    private String modelo;
    private int annoFabricacion;
    private String estado;
    private int kilometros;

    public Vehiculo(){
        this.estado = "Disponible";
        this.kilometros = 0;
    }

    public Vehiculo(String marca, String modelo, String estado, int annoFabricacion, int kilometros) {
        this.marca = marca;
        this.modelo = modelo;
        this.estado = estado;
        this.annoFabricacion = annoFabricacion;
        this.kilometros = kilometros;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnnoFabricacion() {
        return annoFabricacion;
    }

    public void setAnnoFabricacion(int annoFabricacion) {
        this.annoFabricacion = annoFabricacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getKilometros() {
        return kilometros;
    }

    public void setKilometros(int kilometros) {
        this.kilometros = kilometros;
    }

    public void alquilar(){
        if(estado.equalsIgnoreCase("Disponible")){
            System.out.println("Vehiculo alquilado.");
            estado = "Alquilado";
        }
        else{
            System.out.println("El vehiculo no está disponible.");
        }
    }

    public void devolver(){
        if(estado.equalsIgnoreCase("Alquilado")){
            System.out.println("Vehiculo devuelto.");
            estado = "Disponible";
        }
        else{
            System.out.println("El vehiculo está: "+estado);
        }
    }

    public void reparar(){
        if(estado.equalsIgnoreCase("Disponible")){
            System.out.println("Reparando vehículo.");
            estado = "En reparación";
        }
        else{
            System.out.println("El vehiculo está: "+estado);
        }
    }

    public void actualizarKm(int km){
        kilometros += km;
        System.out.println("Kilometros realizados: "+kilometros);
    }

    @Override
    public String toString() {
        return "vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", annoFabricacion=" + annoFabricacion +
                ", estado='" + estado + '\'' +
                ", kilometros=" + kilometros +
                '}';
    }
}


public class Principal {
    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo("Dacia","Duster","Disponible",2020,60000);

        v1.alquilar();
        v1.devolver();
        v1.reparar();
        v1.actualizarKm(5000);
    }
}
