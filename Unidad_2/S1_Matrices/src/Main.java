import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MatrixOperations operations = new MatrixOperations();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de filas: ");
        int rows = scanner.nextInt();

        System.out.print("Ingrese el número de columnas: ");
        int columns = scanner.nextInt();
        
        System.out.println();

        int[][] matrixOne = new int[rows][columns];
        int[][] matrixTwo = new int[rows][columns];

        System.out.println("Ingrese los elementos de la matriz 1: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.printf("[%d][%d]: ", i, j);
                matrixOne[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Matrix 1:");
        operations.print(matrixOne);
        
        System.out.println("Ingrese los elementos de la matriz 2: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.printf("[%d][%d]: ", i, j);
                matrixTwo[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Matrix 2:");
        operations.print(matrixTwo);

        int[][] sumMatrix = operations.add(matrixOne, matrixTwo);
        int[][] productMatrix = operations.multiply(matrixOne, matrixTwo);
        int[][] transposeMatrixOne = operations.transpose(matrixOne);
        int[][] transposeMatrixTwo = operations.transpose(matrixTwo);

        System.out.println("Suma de matrices:");
        operations.print(sumMatrix);
        System.out.println("Producto de matrices:");
        operations.print(productMatrix);
        System.out.println("Transpuesta de la matriz 1:");
        operations.print(transposeMatrixOne);
        System.out.println("Transpuesta de la matriz 2:");
        operations.print(transposeMatrixTwo);
        scanner.close();
    }
}