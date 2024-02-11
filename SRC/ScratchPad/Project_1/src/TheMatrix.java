public class TheMatrix {
    public static int[][] matrixSum(int[][] matrix1, int[][] matrix2) {
        if (matrix1[0].length != matrix2[0].length && matrix1.length != matrix2.length) {
            System.out.println("No se pueden sumar las matrices porque son de tamaño distinto");
            return new int[0][0];
        }
        int[][] matrixOut = new int[matrix1[0].length][matrix1.length];
        for (int i = 0; i < matrixOut.length; i++) {
            for (int j = 0; j < matrixOut[i].length; j++) {
                matrixOut[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return matrixOut;
    }    
}
