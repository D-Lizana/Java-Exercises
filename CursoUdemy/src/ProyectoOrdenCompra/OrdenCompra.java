package ProyectoOrdenCompra;

import java.util.Arrays;
import java.util.Date;

public class OrdenCompra {

    private int identificador;
    private static int ultimoid = 0;

    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private Producto[] productos;

    private int contadorProductos;

    public OrdenCompra(String descripcion){
        this.descripcion = descripcion;
        this.identificador = ++ultimoid;
        this.productos = new Producto[4];
    }

    public int getIdentificador() {
        return identificador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void getProductos() {
        for(Producto producto: productos){
            System.out.println("Fabricante: " + producto.getFabricante() + " ,Nombre: " + producto.getNombre()  + " ,Precio: " + producto.getPrecio());
        }
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void addProducto(Producto producto){
        if(contadorProductos < productos.length){
            productos[contadorProductos] = producto;
            contadorProductos++;
        }
        else{
            System.out.println("Solo se pueden agregar 4 productos.");
        }




    }
}
