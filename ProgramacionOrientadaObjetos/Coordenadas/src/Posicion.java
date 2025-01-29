

public class Posicion {

    // atributos

    private int x;
    private int y;

    // getters y setters

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    // Constructores

    public Posicion(){
        this.x = 0;
        this.y = 0;
    }

    public Posicion(int x,int y){
        this.x = x;
        this.y = y;
    }

    // Usos

    public void incX(){
        this.x++;
    }

    public void incY(){
        this.y++;
    }

    public void desX(){
        this.x--;
    }

    public void desY(){
        this.y--;
    }

}

