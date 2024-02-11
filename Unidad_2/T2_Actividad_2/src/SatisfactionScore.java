

public class SatisfactionScore {
    public static void main(String[] args) {
        int[] storage = new int[20];
        String[] score = new String[6];
        score[0]= "Pésimo";
        score[1]= "Muy Malo";
        score[2]= "Malo";
        score[3]= "Bueno";
        score[4]= "Muy Bueno";
        score[5]= "Excelente";

        storage[0] = 1;
        storage[1] = 1;
        storage[2] = 2;
        storage[3] = 4;
        storage[4] = 1;
        storage[5] = 3;
        storage[6] = 5;
        storage[7] = 3;
        storage[8] = 2;
        storage[9] = 3;
        storage[10] =1;
        storage[11] = 5;
        storage[12] = 3;
        storage[13] = 2;
        storage[15] = 6;
        storage[16] = 6;
        storage[17] = 2;
        storage[18] = 4;
        storage[19] = 6;

        for (int i = 1; i < 7; i++) {
            int counter = 0;
            for (int k : storage) {
                if (k == i) {
                    counter = counter + 1;
                }
            }
            System.out.printf("%d: $D", score[i-1], counter);
        }
    }
}
