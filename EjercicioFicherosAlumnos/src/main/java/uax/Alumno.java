package EjercicioFicherosAlumnos.src.main.java.uax;


public class Alumno {

    private int expediente;
    private String nombreYApellidos;
    private double nota;

    public Alumno() {
    }

    public Alumno(int expediente, String nombreYApellidos) {
        this.expediente = expediente;
        this.nombreYApellidos = nombreYApellidos;
    }

    public void setNota(double nota){
        this.nota = nota;
    }

    public int getExpediente() {
        return expediente;
    }

    public String getNombreYApellidos() {
        return nombreYApellidos;
    }

    public double getNota() {
        return nota;
    }
}
