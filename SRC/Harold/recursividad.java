package Recursividad;

public class Recursividad {
    public void Mostrar (int x){
        if(x<=10){

            System.out.println(x);

            Mostrar(x+1);

        }
    }
}
