import java.util.ArrayList;

public class Curso {
    private String nombre;
    private String codigo;
    private int cupoMaximo;
    private ArrayList<String> estudiantes;

    public Curso(String nombre, String codigo, int cupoMaximo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.cupoMaximo = cupoMaximo;
        this.estudiantes = new ArrayList<>();
    }

    public void inscribirAlumno(String alumno){
        if(estudiantes.size()<cupoMaximo){
            estudiantes.add(alumno);
        }
        else{
            System.out.println("El curso ya está lleno.");
        }
    }

    public void eliminarAlumno(String alumno){
        for(String estudiante : estudiantes){
            if(alumno.equalsIgnoreCase(estudiante)){
                estudiantes.remove(estudiante);
                System.out.println("Alumno eliminado.");
            }
        }
    }

    public void mostrarLista(){
        System.out.println("Alumnos inscritos.");
        for(String estudiante : estudiantes){
                System.out.println(estudiante);
        }
    }

    public void verificarCupo(){
        if (estudiantes.size()<cupoMaximo){
            System.out.println("Aún quedan "+(cupoMaximo-estudiantes.size())+" plazas.");
        }
        else{
            System.out.println("El curso está completo.");
        }
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nombre='" + nombre + '\'' +
                ", codigo='" + codigo + '\'' +
                ", cupoMaximo=" + cupoMaximo +
                ", estudiantes=" + estudiantes +
                '}';
    }

}
