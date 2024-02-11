package Factorial;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner (System.in);
     System.out.println("Ingrese un número: ");
      int num = sc.nextInt();
      Factorial rec = new Factorial();
       int Facto = rec.Facto(num);
       System.out.println("factorial es: " + Facto);
	}
	

}
