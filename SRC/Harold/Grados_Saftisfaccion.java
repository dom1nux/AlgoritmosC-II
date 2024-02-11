package Tarea_2;

public class Grados_Saftisfaccion {
    public static void main(String[] args) {
        int[] v = new int[20];
        String[] G = new String[6];
        G[0]= "Pésimo";
        G[1]= "Muy Malo";
        G[2]= "Malo";
        G[3]= "Bueno";
        G[4]= "Muy Bueno";
        G[5]= "Excelente";

        v[0] = 1;
        v[1] = 1;
        v[2] = 2;
        v[3] = 4;
        v[4] = 1;
        v[5] = 3;
        v[6] = 5;
        v[7] = 3;
        v[8] = 2;
        v[9] = 3;
        v[10] =1;
        v[11] = 5;
        v[12] = 3;
        v[13] = 2;
        v[15] = 6;
        v[16] = 6;
        v[17] = 2;
        v[18] = 4;
        v[19] = 6;


        //contador
        for (int i = 1; i < 7; i++) {
            int S = 0;
            for (int k : v) {

                if (k == i) {
                    S = S + 1;
                }

            }
            System.out.println(G[i-1]+": "+S);
        }
    }
}
