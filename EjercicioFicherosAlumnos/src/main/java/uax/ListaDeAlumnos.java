package EjercicioFicherosAlumnos.src.main.java.uax;

import java.util.ArrayList;

public class ListaDeAlumnos {

    private ArrayList<Alumno> alumnos;

    public ListaDeAlumnos() {
        this.alumnos = new ArrayList<Alumno>();
    }

    public void anadirAlumno(Alumno alumno){
        alumnos.add(alumno);
    }

    public void bajaAlumno(int expediente){
        Alumno alumnoBorrar = new Alumno();
        for(Alumno alumno: alumnos){
            if(alumno.getExpediente() == expediente){
                alumnoBorrar = alumno;
                break;
            }
        }
        alumnos.remove(alumnoBorrar);
    }

    public void insertarNota(int expediente, double nota){
        for(Alumno alumno: alumnos){
            if(alumno.getExpediente() == expediente){
                alumno.setNota(nota);
                break;
            }
        }
        System.out.println("Expediente no encontrado.");
    }

    public void modificarNota(int expediente, double nota){
        for(Alumno alumno: alumnos){
            if(alumno.getExpediente() == expediente){
                alumno.setNota(nota);
                break;
            }
        }
        System.out.println("Expediente no encontrado.");
    }

    public void consultarNota(int expediente){
        for(Alumno alumno: alumnos){
            if(alumno.getExpediente() == expediente){
                System.out.println("Nota: "+alumno.getNota());
                break;
            }
        }

        System.out.println("Expediente no encontrado.");
    }

    public void consultarTodasNotas(){
        if(!alumnos.isEmpty()){
            for(Alumno alumno: alumnos){
                System.out.println("Alumno: "+alumno.getNombreYApellidos()+", Nota: "+ alumno.getNota());
            }
        }
        else {
            System.out.println("No hay alumnos");
        }
    }





}
