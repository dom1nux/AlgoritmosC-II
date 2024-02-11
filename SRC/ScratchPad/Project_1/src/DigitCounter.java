public class DigitCounter {
    public int digitCounter(int n) {
        if (Math.abs(n) < 10) {
            return 1;
        } else {
            return (1 + digitCounter(n / 10));
        }
    }

    public static void main(String[] args) {
        DigitCounter rec = new DigitCounter();
        System.out.println(rec.digitCounter(5874));
    }
}
