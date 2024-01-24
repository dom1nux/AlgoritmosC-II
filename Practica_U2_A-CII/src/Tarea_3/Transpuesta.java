package Tarea_3;

import java.util.Scanner;

public class Transpuesta {
    public static void Main_4() {
        Scanner Ss = new Scanner(System.in);
        int l2;
        int h2;
        int l1;
        int h1;
        int l3;
        int h3;

        System.out.println("Ingresa la filas de la primer matriz:");
        l1 = Ss.nextInt();
        System.out.println("Ingresa el columnas de la primer matriz:");
        h1 = Ss.nextInt();
        System.out.println("Ingresa la filas de la segunda matriz:");
        l2 = Ss.nextInt();
        System.out.println("Ingresa el columnas de la segunda matriz:");
        h2 = Ss.nextInt();
        System.out.println("Ingresa la filas de la tercera matriz:");
        l3 = Ss.nextInt();
        System.out.println("Ingresa el columnas de la tercera matriz:");
        h3 = Ss.nextInt();

        int[][] matrixOne = new int[l1][h1];
        int[][] matrixTwo = new int[l2][h2];
        int[][] matrixThree = new int[l3][h3];

        //matriz 1

        for (int i = 0; i < matrixOne.length; i++) {
            for (int j = 0; j < matrixOne[i].length; j++) {
                matrixOne[i][j] = (int) (Math.random() * 10);
                System.out.print(matrixOne[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        //matriz 2

        for (int i = 0; i < matrixTwo.length; i++) {
            for (int j = 0; j < matrixTwo[i].length; j++) {
                matrixTwo[i][j] = (int) (Math.random() * 10);
                System.out.print(matrixTwo[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        //matriz 3

        for (int i = 0; i < matrixThree.length; i++) {
            for (int j = 0; j < matrixThree[i].length; j++) {
                matrixThree[i][j] = (int) (Math.random() * 10);
                System.out.print(matrixThree[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        if (matrixOne[0].length != matrixTwo[0].length && matrixOne.length != matrixTwo.length) {
            System.out.println("Error: las matrices tienen longitudes distintas");
            return;
        }
        //suma
        int[][] matrixOut1 = new int[matrixOne[0].length][matrixOne.length];
        for (int i = 0; i < matrixOut1.length; i++) {
            for (int j = 0; j < matrixOut1[i].length; j++) {
                matrixOut1[i][j] = matrixOne[i][j] + matrixTwo[i][j];
            }
        }

        if (matrixOne[0].length != matrixTwo.length) {
            System.out.println("Error: Las matrices no pueden ser multiplicadas.");
            return;
        }
        //multiplicación
        int[][] matrixOut2 = new int[matrixOut1.length][matrixTwo[0].length];
        for (int i = 0; i < matrixOut1.length; i++) {
            for (int j = 0; j < matrixTwo[0].length; j++) {
                for (int k = 0; k < matrixTwo.length; k++) {
                    matrixOut2[i][j] += matrixOut1[i][k] * matrixTwo[k][j];
                }
            }
        }
        System.out.println();
        for (int i = 0; i < matrixOut2.length; i++) {
            for (int j = 0; j < matrixOut2[i].length; j++) {
                System.out.print(matrixOut2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
