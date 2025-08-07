package ProyectoFacturaUdemy;

public class MainFacturas {
    public static void main(String[] args) {

        Cliente c1 = new Cliente("Diego","0001");

        Producto p1 = new Producto(1,"Agua",2.2);
        Producto p2 = new Producto(2,"Luna",3000000);

        Carrito i1 = new Carrito(p1,13);
        Carrito i2 = new Carrito(p2,1);

        Factura f1 = new Factura(c1,"compra");
        f1.addCarrito(i1);
        f1.addCarrito(i2);
        System.out.println(f1.calcularTotal());

        System.out.println(f1);


    }
}
