public class CuentaBancaria {
    private int numeroCuenta;
    private String nombreTitular;
    private int saldo;
    private String tipo;

    public CuentaBancaria(int numeroCuenta, String nombreTitular, int saldo, String tipo) {
        this.numeroCuenta = numeroCuenta;
        this.nombreTitular = nombreTitular;
        this.saldo = saldo;
        this.tipo = tipo;
    }

    public void ingresarDinero(int dinero){
        saldo += dinero;
        System.out.println("Saldo: "+saldo);
    }

    public void retirarDinero(int dinero){
        if(dinero<=saldo){
            saldo-=dinero;
            System.out.println("Saldo restante: "+saldo);
        }
        else{
            System.out.println("Saldo insuficiente. Saldo actual: "+saldo);
        }
    }

    public void transferirDinero(int dinero, CuentaBancaria cuenta){
        if(dinero<=saldo){
            saldo-=dinero;
            cuenta.setSaldo(cuenta.getSaldo()+dinero);
            System.out.println("Tranferencia realizada.");
            System.out.println("Saldo restante: "+saldo);
        }
        else{
            System.out.println("Saldo insuficiente. Saldo actual: "+saldo);
        }
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "numeroCuenta=" + numeroCuenta +
                ", nombreTitular='" + nombreTitular + '\'' +
                ", saldo=" + saldo +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
