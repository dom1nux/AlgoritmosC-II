import java.util.Arrays;
import java.util.Scanner;

    public class Obtenerarreglo {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario ingresar el número de elementos
            System.out.print("Ingrese el número de elementos (N): ");
            int n = scanner.nextInt();

        // Declarar un arreglo de tamaño N
            int[] arreglo = new int[n];

        // Leer los elementos del usuario
            for (int i = 0; i < n; i++) {
                System.out.print("N" + (i + 1) + ": ");
                arreglo[i] = scanner.nextInt();
            }

        // Ordenar el arreglo de mayor a menor
            Arrays.sort(arreglo);
            System.out.print("Ordenado de mayor a menor: ");
            for (int i = n - 1; i >= 0; i--) {
                System.out.print(arreglo[i]);
                if (i > 0) {
                    System.out.print(",");
                }
            }
            System.out.println();

        // Ordenar el arreglo de menor a mayor
            Arrays.sort(arreglo);
            System.out.print("Ordenado de menor a mayor: ");
            for (int i = 0; i < n; i++) {
                System.out.print(arreglo[i]);
                if (i < n - 1) {
                    System.out.print(",");
                }
            }
            System.out.println();

        // Cerrar el scanner
            scanner.close();
        }
    }