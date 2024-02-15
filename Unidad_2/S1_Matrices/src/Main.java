import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MatrixOperations operations = new MatrixOperations();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de filas: ");
        int rows = scanner.nextInt();

        System.out.print("Ingrese el número de columnas: ");
        int columns = scanner.nextInt();

        int[][] matrixOne = new int[rows][columns];
        int[][] matrixTwo = new int[rows][columns];

        System.out.println("Ingrese los elementos de la matriz 1:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrixOne[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Ingrese los elementos de la matriz 2:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrixTwo[i][j] = scanner.nextInt();
            }
        }

        scanner.close();

        int[][] sumMatrix = operations.add(matrixOne, matrixTwo);
        int[][] productMatrix = operations.multiply(matrixOne, matrixTwo);
        int[][] transposeMatrix = operations.transpose(matrixOne);

        System.out.println("Suma de matrices:");
        operations.print(sumMatrix);
        System.out.println("Producto de matrices:");
        operations.print(productMatrix);
        System.out.println("Transpuesta de la matriz:");
        operations.print(transposeMatrix);
    }
}