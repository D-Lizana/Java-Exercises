package ProyectoFacturaUdemy;

public class Carrito {
    private Producto producto;
    private int cantidad;

    public Carrito(Producto producto, int cantidad){
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public double calcularImporte(){
        return this.cantidad*this.producto.getPrecio();
    }

    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {
        return "Carrito{" +
                "producto=" + producto +
                ", cantidad=" + cantidad +
                '}';
    }
}
