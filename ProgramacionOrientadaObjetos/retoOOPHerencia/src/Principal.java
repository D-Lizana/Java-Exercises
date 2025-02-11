//a. Diseñar una clase que se llame Hora que va a representar un instante de tiempo por una hora y minutos.
//• Dispone del constructor por defecto: la hora y los minutos son 0
//• Dispone del constructor con horas y minutos: Hora (hora, minutos)
// o En este constructor se llamará al mé to do de setHora(hora) y setMinuto(minuto) para controlar los siguientes casos
// de que la hora y los minutos se pongan correctamente, hora del 0 al 23 y minutos de 0 a 59
//• Dispone de todos los métodos para acceder a los atributos
//• Dispone de un metodo inc, que incrementa un minuto. Hay que controlar el paso de minutos a horas
//• Haz un overriding del metodo toString, para que ponga hora : minutos

class Hora{
    private int hora;
    private int minutos;

    // Creamos el constructor por defecto
    public Hora(){
        hora = 0;
        minutos = 0;
    }

    // Hacemos otro constructor y aseguramos que los datos introducidos sean válidos haciendolos pasar por los setter
    public Hora(int hora, int minutos){
        setHora(hora);
        setMinutos(minutos);
    }

    // Creamos los getter
    public int getHora() {
        return hora;
    }

    public int getMinutos() {
        return minutos;
    }

    // Para el setter de hora limitamos los numeros que se pueden introducir a entre 0 y 23, cualquier otro numero hará que se fije en 0h por defecto.
    public void setHora(int hora) {
        if(hora>=0 && hora<23){
            this.hora = hora;
        }
        else{
            System.out.println("La hora tiene que estar entre 0 y 23. Fijado en 0h por defecto.");
        }
    }

    // Hacemos lo mismo limitando el setter de minutos a numeros entre 0 y 59
    public void setMinutos(int minutos) {
        if(minutos>=0 && minutos<60){
            this.minutos = minutos;
        }
        else{
            System.out.println("Los minutos tienen que estar entre 0 y 59. Fijado en 0 min por defecto.");
        }
    }

    // En el metodo de incrementar hacemos que se incremente un minuto cada vez.
    // Tambien se controla que al llegar los  minutos a 60 se aumente una hora y los minutos pasen a 0.
    // Por ultimo controla tambien que si las horas llegan a 24 se pase de nuevo a 0.
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


    // Se hace el override de toString para poder poner la hora en formato 00:00
    @Override
    public String toString() {
        if(minutos>9 && hora<10){
            return "Hora: "+"0"+hora+":"+minutos;
        }
        else if(minutos<10 && hora<10){
            return "Hora: "+"0"+hora+":0"+minutos;
        }
        else if(minutos<10 && hora>9){
            return "Hora: "+hora+":0"+minutos;
        }
        else{
            return "Hora: "+hora+":"+minutos;
        }
        // Inicialmente lo hice de la manera anterior pero luego descubrí que la forma mas correcta y simple de hacerlo seria la siguiente:
        // return String.format("%02d:%02d",hora,minutos);
    }
}



//c. Crear una clase Hora12, que funciona de una forma similar a Hora, con la diferencia de que las horas solo pueden tomar los valores de 1 al 12,
// y se distingue la mañana y la tarde con el String de am o pm. Haz un override de setHora(), inc() y el toString

class Hora12 extends Hora{
    private String amPm;

    // Creamos primero un constructor por defecto llamando a los atributos heredados de la clase Hora
    public Hora12(){
        super(12,0);
        this.amPm = "am";
    }

    // Aqui creamos otro constructor, aunque en el caso de hora va a utilizar el nuevo setHora programado por el override
    // hacemos pasar los datos introducidos por los setter para asegurar que son validos
    public Hora12(int hora, int minutos, String amPm){
        setHora(hora);
        setMinutos(minutos);
        setAmPm(amPm);
    }

    // Creamos el setter para poner mañana o tarde, si se selecciona cualquier otra cosa se pone am por defecto.
    public void setAmPm(String amPm){
        if(amPm.equalsIgnoreCase("am") || amPm.equalsIgnoreCase("pm")){
            this.amPm = amPm;
        }
        else{
            System.out.println("Solo se puede seleccionar am/pm. Fijado en am por defecto.");
            this.amPm = "am";
        }
    }


    // Hacemos un override sobre el setter de hora y restringimos las horas que se pueden introducir, permitiendo solo entre 1 a 12, ambos incluidos.
    @Override
    public void setHora(int hora) {
        if(hora>=1 && hora<13){
            super.setHora(hora);
        }
        else{
            System.out.println("La hora tiene que estar entre 1 y 12. Fijado en 12 por defecto.");
        }
    }

    // ahora hacemos el override de incrementar minutos sin usar los atributos, solo llamandolos desde los metodos heredados.
    // Controlamos que al llegar a 60 minutos, se aumente una hora.
    // Tambien controlamos que al llegar a las 12 se pase de mañana a tarde o viceversa.
    @Override
    public void inc(){
        if(super.getMinutos()==59){
            super.setMinutos(0);
            super.setHora(super.getHora()+1);
        }
        else{
            super.setMinutos(super.getMinutos()+1);
        }

        if(super.getHora()==12 && amPm.equalsIgnoreCase("am")){
            amPm = "pm";
        }
        else if(super.getHora()==12 && amPm.equalsIgnoreCase("pm")){
            amPm = "am";
        }

        if(super.getHora()==13){
            super.setHora(1);
        }
    }

    // Por ultimo hacemos el override del toString de nuevo para mostrar las horas, minutos y si es mañana o tarde
    @Override
    public String toString() {
        return String.format("Hora12: "+"%02d:%02d",super.getHora(),super.getMinutos())+amPm;
        }
    }


//b.  Realiza un programa principal donde se vea el funcionamiento de la clase, para ello introduce la hora de las 11:30 y repite el incremento 40 veces y muestra el resultado.
// Luego cambia solo la hora a 20
//

public class Principal {
    public static void main(String[] args) {

        // Introducimos las 11:30
        Hora h1 = new Hora(11,30);

        // Realizamos un incremento de 1 minuto 40 veces
        for(int i=0; i<40; i++){
            h1.inc();
        }
        // Mostramos la hora actual
        System.out.println(h1);

        // Cambiamos la hora a las 20:00
        h1.setHora(20);
        h1.setMinutos(0);

        // Mostramos la hora
        System.out.println(h1);

        // Ahora trabajamos con la hora en formato Hora12
        // Ponemos las 11:30 de la noche
        Hora12 h2 = new Hora12(11,30,"pm");

        System.out.println(h2);

        // Realizamos 40 incrementos de 1 minuto
        for(int i=0; i<40; i++){
            h2.inc();
        }

        // Imprimimos la Hora actual
        System.out.println(h2);

        // Ponemos la hora de nuevo en las 20:00 (08:00pm)
        h2.setHora(8);
        h2.setMinutos(0);
        h2.setAmPm("pm");

        System.out.println(h2);

    }
}
