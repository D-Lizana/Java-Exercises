package uax;

import java.util.ArrayList;

public class ListaDeAlumnos {

    private ArrayList<Alumno> alumnos;

    public ListaDeAlumnos() {
        this.alumnos = new ArrayList<>();
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
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
        boolean existe = false;
        for(Alumno alumno: alumnos){
            if(alumno.getExpediente() == expediente){
                alumno.setNota(nota);
                existe = true;
            }
        }
        if(!existe){
            System.out.println("Expediente no encontrado.");
        }
    }

    public void modificarNota(int expediente, double nota){
        boolean existe = false;
        for(Alumno alumno: alumnos){
            if(alumno.getExpediente() == expediente){
                alumno.setNota(nota);
                existe = true;
            }
        }
        if(!existe){
            System.out.println("Expediente no encontrado.");
        }
    }

    public void consultarNota(int expediente){
        boolean existe = false;
        for(Alumno alumno: alumnos){
            if(alumno.getExpediente() == expediente){
                System.out.println("Nota: "+alumno.getNota());
                existe = true;
            }
        }

        if(!existe){
            System.out.println("Expediente no encontrado.");
        }
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
