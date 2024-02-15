public class Main {
    public static void main(String[] args) {
        int length = 5;
        int height = 5;
        int[][] matrixOne = new int[length][height];
        int[][] matrixTwo = new int[length][height];
        MatrixOperations.matrixFill(matrixOne);
        MatrixOperations.matrixPrint(matrixOne);
        System.out.println();
        MatrixOperations.matrixFill(matrixTwo);
        MatrixOperations.matrixPrint(matrixTwo);
        System.out.println();
        int[][] matrixOut = MatrixOperations.matrixSum(matrixOne, matrixTwo);
        MatrixOperations.matrixPrint(matrixOut);
    }
}