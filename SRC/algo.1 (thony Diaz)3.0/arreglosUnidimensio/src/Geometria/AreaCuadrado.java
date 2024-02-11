package Geometria;
import java.util.Scanner;
public class AreaCuadrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner teclado = new Scanner(System.in);
         System.out.println("ingrese el la base:");
         double base = teclado.nextDouble();
         System.out.println("ingrese la altura:");
	     double altura = teclado.nextDouble();
	     
	     //procedimiento
	     double area = base * altura;
	      System.out.println("el área del rectángulo es: " + area);
	    
	
	}
	
	
	
}
