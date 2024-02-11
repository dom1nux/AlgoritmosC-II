import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el límite de numeros: ");
        int n = teclado.nextInt();

        int contador = 0;
        int numero = 2;

        while (contador < n) {
            boolean esPrimo = true;
            for (int i = 2; i <= numero / 2; i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
            }

            if (esPrimo) {
                System.out.print(numero + " ");
                contador++;
            }

            numero++;
        }

        teclado.close();
    }
}
