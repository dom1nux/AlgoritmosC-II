public class MatrixExample {
    public static void main(String[] args) {
            int[][] arreglo = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };

    System.out.println("Imprimiendo el arreglo bidimensional: ");
            for (int i = 0; i < arreglo.length; i++) {
                for (int j = 0; j < arreglo[i].length; j++) {
                    System.out.print(arreglo[i][j]);
                }
                System.out.println();
            }
        }

}
