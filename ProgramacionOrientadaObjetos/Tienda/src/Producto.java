public class Producto {

    private String nombre;
    private double precio;
    private int cantidad;
    private boolean estado;

    public Producto(String nombre, double precio, int cantidad, boolean estado){
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.estado = estado;

    }
    public Producto(){
        this.nombre = "Producto sin nombre";
        this.precio = 0.0;
        this.cantidad = 0;
        this.estado = false;
    }

    public void agregarStock(int cantidadAgregar){
        if(cantidadAgregar > 0){
            this.cantidad += cantidadAgregar;
            this.estado = true;
        }
    }

    public void reducirStock(int cantidadReducir){
        if(cantidadReducir > 0 && cantidad >= cantidadReducir){
            this.cantidad -= cantidadReducir;
        }
        if(this.cantidad == 0){
            this.estado = false;
        }
    }

    public String verificarStock(){
        if(this.estado){
            return "Producto disponible.";
        }
        else{
            return "Producto agotado.";
        }
    }

    @Override
    public String toString(){
        return "Producto: " + nombre + "\n" +
                "Precio: $" + precio + "\n" +
                "Cantidad en stock: " + cantidad + "\n" +
                "Estado: " + (estado ? "Disponible" : "Agotado");
    }
}
