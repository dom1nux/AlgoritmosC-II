package product;
import java.util.Scanner;

public class MatrixProduct {
    public static void Main_3() {
        Scanner scanner = new Scanner(System.in);
        int l2;
        int h2;
        int l1;
        int h1;

        System.out.print("Ingresa la longitud: ");
        l1 = scanner.nextInt();
        System.out.print("Ingresa el ancho: ");
        h1 = scanner.nextInt();
        System.out.print("Ingresa la longitud: ");
        l2 = scanner.nextInt();
        System.out.print("Ingresa el ancho: ");
        h2 = scanner.nextInt();

        int[][] matrixOne = new int[l1][h1];
        int[][] matrixTwo = new int[l2][h2];
        for (int i = 0; i < matrixOne.length; i++) {
            for (int j = 0; j < matrixOne[i].length; j++) {
                matrixOne[i][j] = (int) (Math.random() * 10);
                System.out.print(matrixOne[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < matrixTwo.length; i++) {
            for (int j = 0; j < matrixTwo[i].length; j++) {
                matrixTwo[i][j] = (int) (Math.random() * 10);
                System.out.print(matrixTwo[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
        if (matrixOne[0].length != matrixTwo.length) {
            System.out.println("Error: Las matrices no pueden ser multiplicadas.");
            return;
        }
        
        int[][] matrixOut = new int[matrixOne.length][matrixTwo[0].length];
        for (int i = 0; i < matrixOne.length; i++) {
            for (int j = 0; j < matrixTwo[0].length; j++) {
                for (int k = 0; k < matrixTwo.length; k++) {
                    matrixOut[i][j] += matrixOne[i][k] * matrixTwo[k][j];
                }
            }
        }
        System.out.println();
        for (int i = 0; i < matrixOut.length; i++) {
            for (int j = 0; j < matrixOut[i].length; j++) {
                System.out.print(matrixOut[i][j] + " ");
            }
            System.out.println();
        }
    }
}
