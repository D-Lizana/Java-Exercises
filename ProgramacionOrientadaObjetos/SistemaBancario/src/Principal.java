public class Principal {
    public static void main(String[] args) {
        CuentaBancaria c1 = new CuentaBancaria(1,"Diego", 1000, "Ahorro");
        CuentaBancaria c2 = new CuentaBancaria(2,"Jaime", 1000, "Ahorro");

        c1.ingresarDinero(500);
        c1.transferirDinero(1500,c2);
        System.out.println(c2.getSaldo());
    }
}
