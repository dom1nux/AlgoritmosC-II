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

        System.out.print("Ingresa la filas de la matriz A: ");
        l1 = Ss.nextInt();
        System.out.print("Ingresa el columnas de la matriz A: ");
        h1 = Ss.nextInt();
        System.out.print("Ingresa la filas de la matriz B: ");
        l2 = Ss.nextInt();
        System.out.print("Ingresa el columnas de la matriz B: ");
        h2 = Ss.nextInt();
        System.out.print("Ingresa la filas de la matriz C: ");
        l3 = Ss.nextInt();
        System.out.print("Ingresa el columnas de la matriz C: ");
        h3 = Ss.nextInt();
        System.out.println();

        int[][] matrixOne = new int[l1][h1];
        int[][] matrixTwo = new int[l2][h2];
        int[][] matrixThree = new int[l3][h3];
        int[][] matrixOut1 = new int[matrixOne[0].length][matrixOne.length];
        int[][] matrixOut2 = new int[matrixOut1.length][matrixThree[0].length];


        //verificado Suma
        if (matrixOne[0].length != matrixTwo[0].length && matrixOne.length != matrixTwo.length) {
            System.out.println("Error: las matrices no pueden ser sumadas.");
            return;
        }
        //Vereficacion multi
        if (matrixOut1[0].length != matrixThree.length) {
            System.out.println("Error: Las matrices no pueden ser multiplicadas.");
            return;
        }

        //matriz 1
        System.out.println("Matriz A");
        for (int i = 0; i < matrixOne.length; i++) {
            for (int j = 0; j < matrixOne[i].length; j++) {
                matrixOne[i][j] = (int) (Math.random() * 10);
                System.out.print(matrixOne[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        //matriz 2
        System.out.println("Matriz B");
        for (int i = 0; i < matrixTwo.length; i++) {
            for (int j = 0; j < matrixTwo[i].length; j++) {
                matrixTwo[i][j] = (int) (Math.random() * 10);
                System.out.print(matrixTwo[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        //matriz 3
        System.out.println("Matriz C");
        for (int i = 0; i < matrixThree.length; i++) {
            for (int j = 0; j < matrixThree[i].length; j++) {
                matrixThree[i][j] = (int) (Math.random() * 10);
                System.out.print(matrixThree[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        //suma
        System.out.println("Matriz A + Matriz B = Matriz X");
        for (int i = 0; i < matrixOut1.length; i++) {
            for (int j = 0; j < matrixOut1[i].length; j++) {
                matrixOut1[i][j] = matrixOne[i][j] + matrixTwo[i][j];
            }
        }

        for (int[] ints : matrixOut1) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
        System.out.println();

        //multiplicación
        System.out.println("Matriz X * Matriz C = Matriz Y");
        for (int k = 0; k < matrixOut1.length; k++) {
            for (int l = 0; l < matrixThree[0].length; l++) {
                for (int p = 0; p < matrixThree.length; p++) {
                    matrixOut2[k][l] += matrixOut1[k][p] * matrixThree[p][l];
                }
            }
        }
        for (int i = 0; i < matrixOut2.length; i++) {
            for (int j = 0; j < matrixOut2[i].length; j++) {
                System.out.print(matrixOut2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        //Transpuesta
        System.out.println("Transpuesta de la Matriz Y:");
        int[][] matrixFinal = new int[matrixOut2[0].length][matrixOut2.length];
        for (int i = 0; i < matrixOut2.length; i++) {
            for (int j = 0; j < matrixOut2[0].length; j++) {
                matrixFinal[j][i] = matrixOut2[i][j];
            }
        }
        for (int i = 0; i < matrixFinal.length; i++) {
            for (int j = 0; j < matrixFinal[i].length; j++) {
                System.out.print(matrixFinal[i][j] + " ");
            }
            System.out.println();
        }
    }
}
