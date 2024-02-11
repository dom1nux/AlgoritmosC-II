import java.util.Scanner;

public class MatrixOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[3][3];
        System.err.println();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Ingrese un número: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.err.println();
        System.err.println("Presentacion:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.err.printf("[%d]", matrix[i][j]);
            }
            System.err.println();
        }
        scanner.close();
    }
}
