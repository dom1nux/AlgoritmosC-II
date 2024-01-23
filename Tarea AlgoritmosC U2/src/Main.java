public class Main {
    public static void main(String[] args) {
        int length = 5;
        int height = 5;
        int[][] matrixOne = new int[length][height];
        int[][] matrixTwo = new int[length][height];
        Matrix.matrixFill(matrixOne);
        Matrix.matrixPrint(matrixOne);
        System.out.println();
        Matrix.matrixFill(matrixTwo);
        Matrix.matrixPrint(matrixTwo);
        System.out.println();
        int[][] matrixOut = Matrix.matrixSum(matrixOne, matrixTwo);
        Matrix.matrixPrint(matrixOut);

    }
}