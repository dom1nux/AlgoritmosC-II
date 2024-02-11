import java.util.Random;

public class CardShuffler {
    public static void main(String[] args) {
        int[] mazo = new int[52];
        int counter = 1;
        for (int i = 0; i < 52; i++) {
            mazo[i] = counter;
            counter++;

            if (counter > 13) {
                counter = 1;
            }
        }
        deckShuffler(mazo);
        System.out.println("Mazo barajado:");
        for (int carta : mazo) {
            System.out.print(carta + " ");
        }
    }
    public static void deckShuffler(int[] mazo) {
        Random rand = new Random();

        for (int i = mazo.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            int temp = mazo[i];
            mazo[i] = mazo[j];
            mazo[j] = temp;
        }
    }
}
