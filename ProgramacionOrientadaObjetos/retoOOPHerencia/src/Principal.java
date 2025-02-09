//a. Diseñar una clase que se llame Hora que va a representar un instante de tiempo por una hora y minutos.
//• Dispone del constructor por defecto: la hora y los minutos son 0
//• Dispone del constructor con horas y minutos: Hora (hora, minutos)
//o En este constructor se llamará al mé to do de setHora(hora) y setMinuto(minuto) para controlar los siguientes casos
// de que la hora y los minutos se pongan correctamente, hora del 0 al 23 y minutos de 0 a 59
//• Dispone de todos los métodos para acceder a los atributos
//• Dispone de un mtodo inc, que incrementa un minuto. Hay que controlar el paso de minutos a horas
//• Haz un overriding del mét odo toString, para que ponga hora : minutos
//
//b.  Realiza un programa principal donde se vea el funcionamiento de la clase, para ello introduce la hora de las 11:30 y repite el incremento 40 veces y muestra el resultado.
// Luego cambia solo la hora a 20
//
//c. Crear una clase Hora12, que funciona de una forma similar a Hora, con la diferencia de que las horas solo pueden tomar los valores de 1 al 12,
// y se distingue la mañana y la tarde con el String de am o pm. Haz un override de setHora(), inc() y el toString

class Hora{
    protected int hora;
    protected int minutos;

    public Hora(){
        hora = 0;
        minutos = 0;
    }

    public Hora(int hora, int minutos){
        setHora(hora);
        setMinutos(minutos);
    }

    public int getHora() {
        return hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setHora(int hora) {
        if(hora>=0 && hora<23){
            this.hora = hora;
        }
        else{
            System.out.println("La hora tiene que estar entre 0 y 23. Fijado en 0h por defecto.");
        }
    }

    public void setMinutos(int minutos) {
        if(minutos>=0 && minutos<60){
            this.minutos = minutos;
        }
        else{
            System.out.println("Los minutos tienen que estar entre 0 y 59. Fijado en 0 min por defecto.");
        }
    }

    public void inc(){
        minutos++;
        if(minutos==60){
            minutos = 0;
            hora++;
        }
        if(hora==24){
            hora = 0;
        }
    }

    @Override
    public String toString() {
        if(minutos>9 && hora<10){
            return "0"+hora+":"+minutos;
        }
        else if(minutos<10 && hora<10){
            return "0"+hora+":0"+minutos;
        }
        else if(minutos<10 && hora>9){
            return hora+":0"+minutos;
        }
        else{
            return hora+":"+minutos;
        }
    }


}


class Hora12 extends Hora{
    private String amPm;

    public Hora12(){
        super(12,0);
        this.amPm = "am";
    }

    public Hora12(int hora, int minutos, String amPm){
        setHora(hora);
        setMinutos(minutos);
        setAmPm(amPm);
    }

    public void setAmPm(String amPm){
        if(amPm.equalsIgnoreCase("am") || amPm.equalsIgnoreCase("pm")){
            this.amPm = amPm;
        }
        else{
            System.out.println("Solo se puede seleccionar am/pm. Fijado en am por defecto.");
            this.amPm = "am";
        }
    }

    @Override
    public void setHora(int hora) {
        if(hora>=1 && hora<13){
            super.setHora(hora);
        }
        else{
            System.out.println("La hora tiene que estar entre 1 y 12. Fijado en 12 por defecto.");
        }
    }


    @Override
    public void inc(){
        minutos++;
        if(minutos==60){
            minutos = 0;
            hora++;

        }if(hora==12 && amPm.equalsIgnoreCase("am")){
            amPm = "pm";
        }
        else if(hora==12 && amPm.equalsIgnoreCase("pm")){
            amPm = "am";
        }

        if(hora==13){
            hora = 1;
        }
    }

    @Override
    public String toString() {
        if(minutos>9 && hora<10){
            return "0"+hora+":"+minutos+amPm;
        }
        else if(minutos<10 && hora<10){
            return "0"+hora+":0"+minutos+amPm;
        }
        else if(minutos<10 && hora>9){
            return hora+":0"+minutos+amPm;
        }
        else{
            return hora+":"+minutos+amPm;
        }
    }
}


public class Principal {
    public static void main(String[] args) {
        Hora h1 = new Hora(11,30);
        for(int i=0; i<40; i++){
            h1.inc();
        }
        System.out.println(h1);

        h1.setHora(20);
        h1.setMinutos(0);

        System.out.println(h1);

        Hora12 h2 = new Hora12(11,30,"pm");

        System.out.println(h2);

        for(int i=0; i<40; i++){
            h2.inc();
        }

        System.out.println(h2);

        h2.setHora(10);
        h2.setMinutos(8);
        h2.setAmPm("pm");

        System.out.println(h2);

    }
}
