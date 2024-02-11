public class Factorial {
    public int factorial(int n) {
        if (n < 0) {
            return 0;
        } else if (n == 0) {
            return 1;
        } else {
            return (n * factorial(n - 1));
        }
    }

    public static void main(String[] args) {
        Factorial fac = new Factorial();
        System.out.println(fac.factorial(-5));
    }
}
