public class Lindt {

    private String color;
    private Bombon bombon;

    public Lindt(String color, Bombon bombon) {
        this.color = color;
        this.bombon = bombon;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Bombon getBombon() {
        return bombon;
    }

    public void setBombon(Bombon bombon) {
        this.bombon = bombon;
    }

    public Lindt(String color, String sabor, double precio){
        this.color = color;
        bombon = new Bombon(sabor,precio);
    }

    public String getSaborBombon(){
        return bombon.getSabor();
    }




}
