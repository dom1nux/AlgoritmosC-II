package DivisionConResta;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner (System.in);
    System.out.println("ingrese el dividendo: " );
    int dividendo = sc.nextInt();
    System.out.println("ingrese el divisor: " );
    int divisor = sc.nextInt();
    
    //_________________________________________________________
    
    DivisionConResta rec = new DivisionConResta();
    int dividir = rec.dividir(dividendo, divisor);
    if (dividir == 1 ) {
    	System.out.println("No se puede dividir");
    }
    else {
    	System.out.println(dividendo+"/"+divisor+"="+dividir);
    }
}
}