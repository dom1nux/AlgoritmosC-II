import java.util.Random;
import java.util.Scanner;

public class Combinatory {
    public static int combinatory(int[] array, int x) {
        if (array.length < x) {
            return 0;
        }
        if (array.length == x) {
            return 1;
        }
        if (x == 1) {
            return array.length;
        }
        return combinatory(array, x - 1) * (array.length - x + 1) / x;
    } 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = rand.nextInt(100) + 1;
        }
        System.out.print("Ingrese el tamaño de los grupos: ");
        int x = scanner.nextInt();
        System.out.printf("El número combinatorio es: %d\n", combinatory(array, x));
        scanner.close();
    }    
}
