package Tarea_3;

import java.util.Scanner;

public class Suma_Matr_Main {
    public static void Main_1() {
        Scanner Ss = new Scanner(System.in);
        int l2;
        int h2;
        int l1;
        int h1;

        System.out.println("Ingresa la longitud de la primer matriz:");
        l1 = Ss.nextInt();
        System.out.println("Ingresa el ancho de la primer matriz:");
        h1 = Ss.nextInt();
        System.out.println("Ingresa la longitud de la segunda matriz:");
        l2 = Ss.nextInt();
        System.out.println("Ingresa el ancho de la segunda matriz:");
        h2 = Ss.nextInt();

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

        System.out.println();

        int[][] matrixOut = Suma_Matr.matrixSum(matrixOne, matrixTwo);
        for (int[] ints : matrixOut) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
