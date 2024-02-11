package ejercicio2;

public class Multiplicacion extends Operador {
    public Multiplicacion(double num1, double num2) {
        super(num1, num2);
    }

    @Override
    public double operacion() {
        super.operacion();
        return getNum1() * getNum2();
    }
}
