import java.util.Random;

public class CardShuffler {
    // Deck: Mazo de cartas
    // Card: Carta
    public static void shuffleDeck(int[] deck) {
        Random rand = new Random();

        for (int i = deck.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            int temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
        }
    }

    public static void main(String[] args) {
        int[] deck = new int[52];
        int counter = 1;
        for (int i = 0; i < 52; i++) {
            deck[i] = counter;
            counter++;
            
            if (counter > 13) {
                counter = 1;
            }
        }
        shuffleDeck(deck);
        System.out.println("Mazo barajado:");
        for (int card : deck) {
            System.out.print(card + " ");
        }
    }
}
