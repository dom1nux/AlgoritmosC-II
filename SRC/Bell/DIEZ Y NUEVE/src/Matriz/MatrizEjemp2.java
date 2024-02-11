package Matriz;

public class MatrizEjemp2 {
    public static void main(String[] args) {
        int n = 3;

        // Declarar e inicializar la matriz
        int[][] matriz = new int[n][n];

        // Llenar la matriz con números 0, 1 y 2
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                matriz[i][j] = (i + j) % 3; // Esto dará ciclos de 0, 1, 2
            }
        }

        // Imprimir la matriz
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // Nueva línea después de cada fila
        }
    }
}