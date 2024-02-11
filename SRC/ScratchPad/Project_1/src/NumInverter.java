public class NumInverter {
    public int numInverter(int n) {
        if (n < 10) {
            return n;
        } else {
            return (n % 10) * (int) Math.pow(10, (int) Math.log10(n)) + numInverter(n / 10);
        }
    }

    public static void main(String[] args) {
        NumInverter inv = new NumInverter();
        System.out.println(inv.numInverter(12345));
    }
}
