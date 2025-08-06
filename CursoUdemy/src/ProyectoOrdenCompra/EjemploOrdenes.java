package ProyectoOrdenCompra;

import java.util.Date;

public class EjemploOrdenes {
    public static void main(String[] args) {

        Cliente juan = new Cliente("Juan","Martinez");
        Cliente margarita = new Cliente("Margarita", "Jodienda");
        Cliente efren = new Cliente("Efren", "Tato");

        Producto p1 = new Producto("Sony", "Auriculares", 300);
        Producto p2 = new Producto("Apple", "iPhone 14", 1200);
        Producto p3 = new Producto("Samsung", "Smart TV", 900);
        Producto p4 = new Producto("Dell", "Portátil", 1500);
        Producto p5 = new Producto("HP", "Impresora", 200);
        Producto p6 = new Producto("Logitech", "Ratón", 100);
        Producto p7 = new Producto("Microsoft", "Ordenador", 1100);
        Producto p8 = new Producto("Lenovo", "ThinkPad T14", 1300);
        Producto p9 = new Producto("Asus", "Monitor 4K", 400);
        Producto p10 = new Producto("Bose", "Altavoz Bluetooth", 150);
        Producto p11 = new Producto("Canon", "Cámara", 800);
        Producto p12 = new Producto("Acer", "Chromebook", 500);

        OrdenCompra o1 = new OrdenCompra("Pedido tecnología");
        o1.setCliente(juan);
        o1.setFecha(new Date());
        o1.addProducto(p1);
        o1.addProducto(p2);
        o1.addProducto(p3);
        o1.addProducto(p4);

        System.out.println(o1.getIdentificador());
        System.out.println(o1.getDescripcion());
        System.out.println(o1.getFecha());
        System.out.println(o1.getCliente());
        o1.getProductos();


        OrdenCompra o2 = new OrdenCompra("Pedido materiales");
        o2.setCliente(margarita);
        o2.setFecha(new Date());
        o2.addProducto(p5);
        o2.addProducto(p6);
        o2.addProducto(p7);
        o2.addProducto(p8);

        System.out.println(o2.getIdentificador());
        System.out.println(o2.getDescripcion());
        System.out.println(o2.getFecha());
        System.out.println(o2.getCliente());
        o2.getProductos();


        OrdenCompra o3 = new OrdenCompra("Pedido final");
        o3.setCliente(efren);
        o3.setFecha(new Date());
        o3.addProducto(p9);
        o3.addProducto(p10);
        o3.addProducto(p11);
        o3.addProducto(p12);

        System.out.println(o3.getIdentificador());
        System.out.println(o3.getDescripcion());
        System.out.println(o3.getFecha());
        System.out.println(o3.getCliente());
        o3.getProductos();


    }
}
