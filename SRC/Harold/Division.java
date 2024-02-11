package Recursividad;

public class Division {
    public int Oper (int x){
    if (x > 10){
        int Res = x % 10;
        System.out.println(Res);
        x = Res;

    }

        return x;
    }
}
