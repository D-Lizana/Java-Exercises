public class Reserva {
    private String nombreCliente;
    private String fechaReserva;
    private int numeroPersonas;
    private boolean estado;

    public Reserva(String nombreCliente, String fechaReserva, int numeroPersonas, boolean estado){
        this.nombreCliente = nombreCliente;
        this.fechaReserva = fechaReserva;
        this.numeroPersonas = numeroPersonas;
        this.estado = estado;
    }

    public void setFechaReserva(String nuevaFecha){
        this.fechaReserva = nuevaFecha;
    }

    public void cambiarFecha(String nuevaFecha){
        if(this.estado){
            this.fechaReserva = nuevaFecha;
        }
    }

    public String confirmar(){
        this.estado = true;
        return "Reserva confirmada";
    }

    public String cancelar(){
        this.estado = false;
        return "Reserva cancelada";
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "nombreCliente='" + nombreCliente + '\'' +
                ", fechaReserva='" + fechaReserva + '\'' +
                ", numeroPersonas=" + numeroPersonas +
                ", estado=" + estado +
                '}';
    }

}
