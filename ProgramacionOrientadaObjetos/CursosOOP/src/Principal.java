

public class Principal {
    public static void main(String[] args) {

        Curso c1 = new Curso("Dragón","C17",3);

        c1.inscribirAlumno("Jaime");
        c1.inscribirAlumno("Diego");

        c1.verificarCupo();

        c1.inscribirAlumno("María");
        c1.eliminarAlumno("Diego");
        c1.mostrarLista();


    }
}
