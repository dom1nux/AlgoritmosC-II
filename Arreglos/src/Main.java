import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Ss = new Scanner(System.in);

        System.out.println("Ingrese el número de datos: ");
        int N = Ss.nextInt();
        int [] Arr = new int[N];

        for (int a = 0; a < N; a++){
            System.out.println("Ingrese un digito: ");
            int F = Ss.nextInt();
            Arr[a]=F;
        }

        for (int b = 0; b < N; b++){
            int K= b;
            for(int c = b+1; c < N; c++){
                if (Arr[c]<Arr[K]){
                    K=c;
                }
            }
            int G = Arr[b];
            Arr[b] = Arr[K];
            Arr[K] = G;
        }
        for (int d = 0; d < N; d++){
            System.out.println(Arr[d]);
        }
    }



    }
