public class Ejercicio2POOPrincipal {
    public static void main(String[] args) {
        Alumno a1 = new Alumno("M00001","Manolito",8,9.5,7.3);
        Alumno a2 = new Alumno("M00002","Maricarmen",6,10,3.3);
        Alumno a3 = new Alumno("M00003","Adolfo",3,7,4);

        a1.saberNota();
        a2.saberNota();
        a3.saberNota();

        a1.saberInformacion();
        a2.saberInformacion();
        a3.saberInformacion();

    }
}
