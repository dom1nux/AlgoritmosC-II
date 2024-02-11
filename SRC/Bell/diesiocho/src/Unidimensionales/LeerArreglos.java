package Unidimensionales;

import java.util.Scanner;

public class LeerArreglos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Numero de elementos: ");
        int n = sc.nextInt();
        int [] v = new int[n];

        //leer vector
        for (int i = 0; i < v.length; i ++) {
            System.out.println("[" + (i+1) + "]: ");
            v[i] = sc.nextInt();
        }

        //mostrar vector
        for (int g = 0; g < v.length; g ++) {
            System.out.print(v[g] + "\t");
    }
  }
}
