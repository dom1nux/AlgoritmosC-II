import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el número de datos: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        for (int a = 0; a < size; a++) {
            System.out.println("Ingrese un digito: ");
            int input = scanner.nextInt();
            array[a] = input;
        }

        for (int i = 0; i < size; i++) {
            int buffer1 = i;
            for (int k = i + 1; k < size; k++) {
                if (array[k] < array[buffer1]) {
                    buffer1 = k;
                }
            }
            int buffer2 = array[i];
            array[i] = array[buffer1];
            array[buffer1] = buffer2;
        }
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
        scanner.close();
    }
}
