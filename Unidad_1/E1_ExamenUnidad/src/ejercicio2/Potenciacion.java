package ejercicio2;

public class Potenciacion extends Operador {

    public Potenciacion(double num1, double num2) {
        super(num1, num2);
    }

    @Override
    public double operacion() {
        super.operacion();
        return Math.pow(getNum1(), getNum2());
    }
}
