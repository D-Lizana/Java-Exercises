public class Principal {
    public static void main(String[] args) {
        Bombon b1 = new Bombon("Cereza",1.03);
        Lindt l1 = new Lindt("Rojo",b1);

        System.out.println("Color Lindt: "+l1.getColor());
        System.out.println("Sabor Lindt: "+l1.getBombon().getSabor());
        System.out.println("Precio Lindt: "+l1.getBombon().getPrecio());
    }
}
