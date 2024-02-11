import java.util.Scanner;

public class ReadShowEnhanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el número de variables");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Ingresa el numero " + (i + 1) + ":");
            int input = scanner.nextInt();
            array[i] = input;
        }
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);

        }
        scanner.close();
    }
}
