package ejercicio2;

public class Division extends Operador {

    public Division(double num1, double num2) {
        super(num1, num2);
    }

    @Override
    public double operacion() {
        super.operacion();
        double temp = 0;
        if (getNum2() == 0) {
            System.out.println("División entre cero no es válida");
        } else {
            temp = getNum1() / getNum2();
        }
        return temp;
    }
}
