import java.util.Scanner;

public class ArrayExample1 {
    public static void main(String[] args) {
        int j = 0;
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la longitud del array: ");
        int arraySize = 0;
        while (arraySize <= 0) {
            arraySize = scanner.nextInt();
        }
        int[] pairNums = new int[arraySize];
        while (i != pairNums.length) {
            pairNums[i] = j;
            System.out.printf("[%d] : %d\n", i + 1, pairNums[i]);
            i++;
            j = j + 2;
        }
    }
}
