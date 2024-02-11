package Unidimensionales;

import java.security.SecureRandom;

public class Dado {
    public static void main(String[] args) {
        SecureRandom r = new SecureRandom();
        int v [] = new int[7];
        for (int i=0; i <60000; i++);{
            v[1+ r.nextInt(6)]++;9*        }
        System.out.printf("%s%10%n","Cara","frecuencia");

        //Mostrar
        for (int cara=1; cara<v.length; cara++)
        {
            System.out.printf("%4d%12d%n", cara, v[cara]);
        }
    }
}
