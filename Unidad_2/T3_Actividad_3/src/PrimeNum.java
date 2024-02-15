import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el límite de numeros: ");
        int n = scanner.nextInt();

        int counter = 0;
        int num = 2;

        while (counter < n) {
            boolean isPrime = true;
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
                counter++;
            }

            num++;
        }

        scanner.close();
    }
}
