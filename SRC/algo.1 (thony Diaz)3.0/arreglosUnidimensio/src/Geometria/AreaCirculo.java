package Geometria;
import java.util.Scanner; // importamos
public class AreaCirculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      String nombre;
      Double radio;
      System.out.println ("ingrese su nombre:");
      nombre = sc.nextLine();
      System.out.println ("Bienvenid@!!!! " + nombre);
      System.out.println ("Introdsuca el radio: ");
      radio = sc.nextDouble();
      System.out.println ("la longitud de la circunferencia " + 2*Math.PI*radio);
      System.out.println ("Area de la circunferencia " + Math.pow(radio, 2 ));
	
	
	
	
	
	}


}
