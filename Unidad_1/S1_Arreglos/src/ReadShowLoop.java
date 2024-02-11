public class ReadShowLoop {
    public static void main(String[] args) {
        int[] readShow = new int[10];
        for (int i = 0; i < 10; i++) {
            readShow[i] = i + 1;
        }

        for (int x = 0; x < 10; x++) {
            System.out.println(readShow[x] + "");
        }
    }
}
