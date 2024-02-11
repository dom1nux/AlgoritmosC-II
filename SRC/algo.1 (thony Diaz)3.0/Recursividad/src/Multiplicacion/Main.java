package Multiplicacion;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner (System.in);
       System.out.println ("ingrese el multiplicando: ");
       int multiplicando = sc.nextInt();
       System.out.println ("ingrese el multiplicador: ");
       int  multiplicador = sc.nextInt();
        
        //_____________________________
        
       Multiplicacion rec = new Multiplicacion ();
       int Multipli = rec.Multipli(multiplicando, multiplicador);
       if (multiplicador == 0) {
    	   System.out.println("La operación no se puede realizar");
       }
       //for (int j = 1; j <= multiplicador; j++) {
       else  {System.out.println( Multipli  );
       }
       
           
       
       
	}

}
