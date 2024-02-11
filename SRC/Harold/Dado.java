package Arreglos;

import java.util.Scanner;

public class Dado {
    public static void main(String[] args) {
        int[] v = new int[6];
        for (int g = 0; g < v.length; g++) {
            v[g] = (int) (Math.random() * 6+1);
        }

        for (int j : v) {
            System.out.print(j + "\t");
        }


        //contador

        for (int i = 0; i < 7 ; i++) {
            int S = 0;
            for (int j = 0; j < v.length; j++) {

                if (v[j] == i) {
                    S = S + 1;
                }

            }
            System.out.println(S);
        }



    }
}
