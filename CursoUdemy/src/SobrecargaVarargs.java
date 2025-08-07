public class SobrecargaVarargs {

    public int sumar(int... argumentos){
        int total = 0;
        for(int i: argumentos){
            total+=i;
        }
        return total;
    }

    public float sumar(float a, int... argumentos){
        float total = a;
        for(int i: argumentos){
            total+=i;
        }
        return total;
    }

    public double sumar(double... argumentos){
        int total = 0;
        for(double i: argumentos){
            total+=i;
        }
        return total;
    }

}
