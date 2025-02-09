// Crear una clase alumno con nombre.
//Crear clase aula con número de aula y una lista de alumnos.
// Tiene otra lista de alumnos que tiene esos mismo alumnos pero desordenados aleatoriamente para que expongan un tema cada uno una semana.
// Habrá que meter al menos 10 alumnos y primero ordenarlos por orden alfabético. Seguidamente, cuando ya estén todos, realizar el sorteo

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Alumno{
    private String nombre;

    public Alumno(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}

class Aula{
    private int numeroAula;
    private ArrayList<Alumno> alumnos;
    private ArrayList<Alumno> alumnosSorteo;


    public Aula(int numeroAula){
        this.numeroAula = numeroAula;
        this.alumnos = new ArrayList<>();
        this.alumnosSorteo = new ArrayList<>();
    }

    public void anadirAlumno(Alumno alumno){
        alumnos.add(alumno);

    }

    public void ordenar(){
        alumnos.sort(Comparator.comparing(Alumno::getNombre));
    }

    public void mostrarAlumnos(){
        for(Alumno alumno : alumnos){
            System.out.println(alumno);
        }
    }

    public void sorteo(){
        for(Alumno alumno : alumnos){
            alumnosSorteo.add(alumno);
        }
        Collections.shuffle(alumnosSorteo);
        System.out.println("El orden de exposición es el siguiente: ");
        System.out.println(alumnosSorteo);
    }


}



public class Principal {
    public static void main(String[] args) {

    }
}
