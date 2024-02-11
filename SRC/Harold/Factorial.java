package Recursividad;

public class Factorial {
    public int Multiplicacion (int x){
        if (x>0){
            return x * Multiplicacion(x-1);
        }
        return 1;
    }

}
