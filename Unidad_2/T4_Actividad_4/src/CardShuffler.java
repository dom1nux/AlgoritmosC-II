import java.util.Random;

public class CardShuffler {
    public static void cardShuffler(int[] mace) {
        Random rand = new Random();

        for (int i = mace.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            int temp = mace[i];
            mace[i] = mace[j];
            mace[j] = temp;
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

        cardShuffler(mazo);

        System.out.println("Mazo barajado:");
        for (int card : mazo) {
            System.out.print(card + " ");
        }
    }
}
