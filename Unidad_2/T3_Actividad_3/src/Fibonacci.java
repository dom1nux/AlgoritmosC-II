import java.util.Scanner;

public class Fibonacci {
    public int n_fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return n_fibonacci(n - 1) + n_fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Fibonacci fibonacci = new Fibonacci();
        System.out.print("Ingrese \"n\": ");
        int num = scanner.nextInt();
        int result = fibonacci.n_fibonacci(num);
        System.out.printf("El numero fibonacci \"%d\" es %d", num, result);
        scanner.close();
    }
}
