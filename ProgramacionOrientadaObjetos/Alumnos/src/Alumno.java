
public class Alumno {

    // Atributos
    private String matricula;
    private String nombre;
    private double nota1;
    private double nota2;
    private double nota3;

    // getters y setters
    public String getMatricula(){
        return matricula;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public double getNota1(){
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2(){
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3(){
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    // Constructores

     public Alumno(String matricula, String nombre, double nota1, double nota2, double nota3){
        this.matricula = matricula;
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
     }

     public void saberNota(){
        double notaMedia = (nota1+nota2+nota3)/3;
        notaMedia = Math.round(notaMedia * 100.0)/100.0;
        System.out.println("La nota media de "+nombre+" es: "+notaMedia);
     }

     public void saberInformacion(){
         System.out.println();
         System.out.println("Matrícula: "+matricula);
         System.out.println("Nombre: "+nombre);

         double notaMedia = (nota1+nota2+nota3)/3;
         if (notaMedia>=5){
             System.out.println("Asignatura aprobada.");
         }
         else {
             System.out.println("Asignatura suspensa.");
         }

     }

}
