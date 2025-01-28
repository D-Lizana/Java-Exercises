public class Principal {
    public static void main(String[] args) {
        Reserva r1 = new Reserva("Pepe","30 Enero 2025",4,false);

        r1.confirmar();
        r1.cambiarFecha("28 de Febrero 2025");

        System.out.println(r1);
    }
}
