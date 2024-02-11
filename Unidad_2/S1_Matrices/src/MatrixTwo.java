import java.util.Scanner;

public class MatrixTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.err.print("Ingrese filas: ");
        int row = scanner.nextInt();
        while (row <= 0) {
            System.err.print("Ingrese un número valido: ");
            row = scanner.nextInt();
        }
        System.err.print("Ingrese columnas: ");
        int columns = scanner.nextInt();
        while (row <= 0) {
            System.err.print("Ingrese un número valido: ");
            columns = scanner.nextInt();
        }
        int[][] matrix = new int[row][columns];
        System.err.println();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
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
