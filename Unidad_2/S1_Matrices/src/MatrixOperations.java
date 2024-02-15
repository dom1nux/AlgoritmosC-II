public class MatrixOperations {
    public int[][] add(int[][] matrixOne, int[][] matrixTwo) {
        int n = matrixOne.length;
        int m = matrixOne[0].length;

        if (n != matrixTwo.length || m != matrixTwo[0].length) {
            System.out.println("Error: No se pueden sumar las matrices, dimensiones inválidas");
            return new int[0][0];
        }

        int[][] sumMatrix = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sumMatrix[i][j] = matrixOne[i][j] + matrixTwo[i][j];
            }
        }

        return sumMatrix;
    }

    public int[][] multiply(int[][] matrixOne, int[][] matrixTwo) {
        int n1 = matrixOne.length;
        int m1 = matrixOne[0].length;
        int n2 = matrixTwo.length;
        int m2 = matrixTwo[0].length;

        if (m1 != n2) {
            System.out.println("Error: No se pueden multiplicar las matrices, dimensiones inválidas");
            return new int[0][0];
        }

        int[][] productMatrix = new int[n1][m2];

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < m2; j++) {
                for (int k = 0; k < m1; k++) {
                    productMatrix[i][j] += matrixOne[i][k] * matrixTwo[k][j];
                }
            }
        }

        return productMatrix;
    }

    public int[][] transpose(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        int[][] transposeMatrix = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                transposeMatrix[i][j] = matrix[j][i];
            }
        }

        return transposeMatrix;

    }

    public void print(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}