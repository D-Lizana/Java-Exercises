public class Principal {
    public static void main(String[] args) {

        Producto p1 = new Producto("Camiseta",9.99,5,true);
        Producto p2 = new Producto("Pantalón",19.99,3,true);
        Producto p3 = new Producto("Calcetines",4.99,1,true);
        Producto p4 = new Producto("Bragas",4.99,0,false);

        p4.agregarStock(3);
        System.out.println(p4.verificarStock());

    }
}
