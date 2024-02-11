import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el límite: ");
        int limite = teclado.nextInt();
        int contador = 1;
        int num1 = 0;
        int num2 = 1;
        System.out.println(num1); // Imprimir el primer número de la secuencia

        while (contador < limite) {
            System.out.println(num2); // Imprimir el segundo número de la secuencia
            int siguienteNumero = num1 + num2;
            num1 = num2;
            num2 = siguienteNumero;
            ++contador;
        }

        teclado.close();
    }
}
