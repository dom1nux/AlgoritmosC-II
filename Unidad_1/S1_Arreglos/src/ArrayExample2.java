import java.util.Scanner;

public class ArrayExample2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la longitud del array: ");
        int arraySize = 0;
        while (arraySize <= 0) {
            arraySize = scanner.nextInt();
        }
        int[] pairNums = new int[arraySize];
        // int i = 0;
        int j = 2;
        // For loop implementation
        for (int i = 0; i != pairNums.length; i++) {
            pairNums[i] = j;
            System.out.printf("%d\n", pairNums[i]);
            j++;
        }
        scanner.close();
    }
}
