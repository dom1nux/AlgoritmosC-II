package ejercicio2;

public class Raiz extends Operador {
    public Raiz(double num1, double num2) {
        super(num1, num2);
    }

    @Override
    public double operacion() {
        return Math.pow(getNum1(), (1 / getNum2()));
    }
}
