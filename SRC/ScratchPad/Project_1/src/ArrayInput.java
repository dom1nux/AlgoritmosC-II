import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese longitud del array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 50);
        }
        for (int i : array) {
            System.out.print(i + "\t");
        }
        scanner.close();
    }
}
