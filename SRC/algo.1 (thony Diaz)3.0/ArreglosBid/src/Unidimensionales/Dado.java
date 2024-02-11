package Unidimensionales;
import java.security.SecureRandom; 
public class Dado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       SecureRandom r = new SecureRandom();
       
       int v[] = new int [7];
       
       for(int i = 0; i <= 60000; i ++ );{
       
          v[1+r.nextInt(6)]++;
          
       }
	   System.out.printf("%s%10%n", "cara", "frecuencia");
	   
	   //mostrar cada elemento del vecto
	   for(int cara =1; cara< v.length; cara++){
		 
		System.out.printf("%4d%12d%n", cara , v[cara]);
	   }
	}
	}
	


