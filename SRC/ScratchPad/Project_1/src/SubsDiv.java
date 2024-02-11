public class SubsDiv {
    public int subsDiv(int num, int den) {
        if (num < den) {
            return 0;
        } else {
            return 1 + subsDiv(num - den, den);
        }
    }

    public static void main(String[] args) {
        SubsDiv div = new SubsDiv();
        System.out.println(div.subsDiv(17, 4));
    }
}
