package Arreglos;

import java.util.Scanner;

public class MatrizEjem {
    public static void main(String[] args) {
    Scanner Ss = new Scanner(System.in);
        xnfcv2(Ss);
    }

    public void x2() {
        int[][] m = new int[2][2];

        m[0][0] = 2;
        m[1][0] = 8;
        m[0][1] = 10;
        m[1][1] = 12;

        System.out.print("[" + m[0][0] + "]");
        System.out.println("[" + m[0][1] + "]");
        System.out.print("[" + m[1][0] + "]");
        System.out.println("[" + m[1][1] + "]");

        System.out.println();

    }

    public void x3() {
        //Matriz 3x3
        int[][] n = new int[3][3];
        int contador = 1;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                n[i][j] = contador;
                contador++;

                System.out.print("[" + n[i][j] + "] ");
            }
            System.out.println();
        }

    }

    public void xnfc(Scanner Ss) {
        //Matriz con ingreso de datos (filas, columnas) por consola

        int cm = 1;

        System.out.println("Ingresar el numero de filas: ");
        int f = Ss.nextInt();
        System.out.println("Ingresar el numero de columnas: ");
        int c = Ss.nextInt();

        int[][] V = new int[f][c];

        for (int p = 0; p < f; p++) {
            for (int d = 0; d < c; d++) {
                V[p][d] = cm;
                cm++;

                System.out.print("[" + V[p][d] + "] ");
            }
            System.out.println();
        }

    }

    public static void xnfcv(Scanner Ss) {
        //Matriz con ingreso de datos (valores de la matriz) por consola

        System.out.println("Ingresar el numero de filas: ");
        int l = Ss.nextInt();
        System.out.println("Ingresar el numero de columnas: ");
        int k = Ss.nextInt();

        int[][] array = new int[l][k];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Ingresa el valor de la matriz " + "[" + i + "]" + "[" + j + "]");
                array[i][j] = Ss.nextInt();

            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("[" + array[i][j] + "] ");
            }
            System.out.println();
        }
    }
    public static void xnfcv2(Scanner Ss){
        System.out.println("Ingresa el numero de matrices: ");
        int g = Ss.nextInt();
        int x=0;
        while (g > x){
            System.out.println("Ingresar el numero de filas: ");
            int l = Ss.nextInt();
            System.out.println("Ingresar el numero de columnas: ");
            int k = Ss.nextInt();

            int[][] array = new int[l][k];

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    System.out.println("Ingresa el valor de la matriz " + "[" + i + "]" + "[" + j + "]");
                    array[i][j] = Ss.nextInt();

                }
            }

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    System.out.print("[" + array[i][j] + "] ");
                }
                System.out.println();
            }
            System.out.println();
            x++;
        }
    }
}
