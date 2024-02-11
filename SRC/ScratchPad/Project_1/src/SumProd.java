public class SumProd {
    public int sumProd(int num1, int num2) {
        if (num2 == 0) {
            return 0;
        } else {
            return num1 + sumProd(num1, num2 - 1);
        }
    }

    public static void main(String[] args) {
        SumProd prod = new SumProd();
        System.out.println(prod.sumProd(7, 3));
    }
}
