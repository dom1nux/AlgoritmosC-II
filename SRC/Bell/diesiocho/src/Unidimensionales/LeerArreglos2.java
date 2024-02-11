package Unidimensionales;

import java.util.Scanner;

public class LeerArreglos2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Numero de elementos: ");
        int n = sc.nextInt();
        sc.close();
        int[] v = new int[n];

        //random
        for (int i = 0; i < v.length; i++) {
            v[i] = (int)(Math.random() * 50);
        }

        //mostrar vector
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + "\t");
        }
    }
}