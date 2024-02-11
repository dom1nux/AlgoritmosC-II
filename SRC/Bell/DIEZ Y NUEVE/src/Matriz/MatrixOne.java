package Matriz;

import java.util.Scanner;

public class MatrixOne {
            public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int[][] matrix = new int[3][3];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix.length; j++) {
                    System.out.print("Ingrese un número: ");
                    matrix[i][j] = scanner.nextInt();
                }
            }
            System.err.println();
            System.err.println("Presentacion:");
                for (int[] ints : matrix) {
                    for (int j = 0; j < matrix.length; j++) {
                        System.err.print(ints[j]);
                    }
                    System.err.println();
                }
            scanner.close();
        }
    }