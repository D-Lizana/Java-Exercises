package ProyectoFacturaUdemy;

import java.util.ArrayList;
import java.util.Date;

public class Factura {
    private Cliente cliente;
    private ArrayList<Carrito> carrito;
    private String descripcion;
    private Date fecha;

    public Factura(Cliente cliente, String descripcion){
        this.cliente = cliente;
        this.carrito = new ArrayList<>();
        this.descripcion = descripcion;
        this.fecha = new Date();
    }

    public void addCarrito(Carrito carrito){
        this.carrito.add(carrito);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public ArrayList<Carrito> getCarrito() {
        return carrito;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public double calcularTotal(){
        int sumaTotal = 0;
        for(Carrito items: carrito){
            sumaTotal += (items.getCantidad()*items.calcularImporte());
        }
        return sumaTotal;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "cliente=" + cliente +
                ", carrito=" + carrito +
                ", descripcion='" + descripcion + '\'' +
                ", fecha=" + fecha +
                '}';
    }
}
