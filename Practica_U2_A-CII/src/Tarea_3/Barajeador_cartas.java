package Tarea_3;

import java.util.Random;

public class Barajeador_cartas {
    public static void barajarMazo(int[] mazo) {
        Random rand = new Random();

        for (int i = mazo.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            int temp = mazo[i];
            mazo[i] = mazo[j];
            mazo[j] = temp;
        }

    }

    public static void Main_2() {
        int[] mazo = new int[52];
        int counter = 1;
        for (int i = 0; i < 52; i++) {
            mazo[i] = counter;
            counter++;

            if (counter > 13) {
                counter = 1;
            }
        }
        barajarMazo(mazo);
        System.out.println("Mazo barajado:");
        for (int carta : mazo) {
            System.out.print(carta + " ");
        }
    }
}
