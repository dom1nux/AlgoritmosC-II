import java.security.SecureRandom;

public class Dice {
    public static void main(String[] args) {
        SecureRandom rand = new SecureRandom();
        int[] dice = new int[7];
        for (int i = 0; i < 6000; i++) {
            dice[1 + rand.nextInt(6)]++;
        }
        System.out.printf("%s%15s%n", "Cara", "Frecuencia");
        for (int side = 0; side < dice.length; side++) {
            System.out.printf("%4d%12d%n", side, dice[side]);
        }
    }
}
