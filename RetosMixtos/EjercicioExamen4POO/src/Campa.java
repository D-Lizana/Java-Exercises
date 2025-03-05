import java.util.ArrayList;

public class Campa {
    private String localizacion;
    private int capacidad;
    private ArrayList<Coche> coches;

    public Campa(String localizacion, int capacidad){
        this.localizacion = localizacion;
        this.capacidad = capacidad;
        this.coches = new ArrayList<>();
    }

    public void anadirCoche(Coche coche){
        if(coches.size()<capacidad){
            coches.add(coche);
        }
        else{
            System.out.println("Campa llena.");
        }
    }

    public void mostrarCoches(){
        System.out.println(coches);
    }


}
