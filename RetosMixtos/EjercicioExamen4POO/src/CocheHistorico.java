
public class CocheHistorico extends Coche{
    private double annos;
    private String paisOrigen;

    public CocheHistorico(){

    }

    public CocheHistorico(String marca, String modelo, double km, String combustible, String color, double precio, double annos, String paisOrigen) {
        super(marca, modelo, km, combustible, color, precio);
        this.annos = annos;
        this.paisOrigen = paisOrigen;
    }

    @Override
    public String toString() {
        return "CocheHistorico{" +
                "marca='" + super.getMarca() + '\'' +
                ", modelo='" + super.getModelo() + '\'' +
                ", km=" + super.getKm() +
                ", combustible='" + super.getCombustible() + '\'' +
                ", color='" + super.getColor() + '\'' +
                ", precio=" + super.getPrecio() + '\'' +
                "annos=" + annos + '\'' +
                ", paisOrigen='" + paisOrigen + '\'' +
                '}';
    }

    public double getAnnos(){
        return annos;
    }

    public void setAnnos(double annos){
        this.annos = annos;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }
}
