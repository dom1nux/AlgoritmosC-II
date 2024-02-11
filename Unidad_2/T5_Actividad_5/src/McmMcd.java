import java.util.Scanner;

public class McmMcd {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int num1 = teclado.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = teclado.nextInt();

        int mcm = calcularMCM(num1, num2);
        int mcd = calcularMCD(num1, num2);

        System.out.println("El Mínimo Común Múltiplo (MCM) de " + num1 + " y " + num2 + " es: " + mcm);
        System.out.println("El Máximo Común Divisor (MCD) de " + num1 + " y " + num2 + " es: " + mcd);

        teclado.close();
    }

    public static int calcularMCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int calcularMCM(int a, int b) {
        int mcd = calcularMCD(a, b);
        return (a * b) / mcd;
    }
}
