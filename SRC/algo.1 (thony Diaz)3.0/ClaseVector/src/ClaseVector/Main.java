package ClaseVector;
import java.util.Vector;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Vector v = new Vector();//por defecto su tmaño es 10
       v.addElement(2);//
       v.addElement("Hola");
       v.addElement('S');
       v.addElement(2.35);
       
       //ejercicio 1
       Vector <Integer> B = new Vector();//por defecto su tmaño es 10
       B.addElement(2);
       B.addElement(4);
       B.addElement(5);
       
       
       //mostrar elementos
       for (int i=0; i < v.size(); i++ ) {
    	   System.out.println("v["+i+"]: "+v.get(i));
       }
       System.out.println(" ");
       
     //mostrar elementos vector b
       for (int i=0; i < B.size(); i++ ) {
    	   System.out.println("v["+i+"]: "+B.get(i));
       }
       System.out.println(" ");
       
       //Adicionar un elemento al vector B
       B.insertElementAt(20, 2);
       
     //mostrar elementos vector b
       System.out.println("Elementos del vector B adicionando");
       for (int i=0; i < B.size(); i++ ) {
    	   System.out.println("v["+i+"]: "+B.get(i));
       }
       System.out.println(" ");
       
       //eliminamos un elemento del vector B con elelemnto eliminado del posisicon 1
       B.removeElementAt(1);
       //mostrar elementos vector b 
       System.out.println("Elementos del vector B adicionando");
       for (int i=0; i < B.size(); i++ ) {
    	   System.out.println("v["+i+"]: "+B.get(i));
       }
       System.out.println(" ");
       
       //eliminamos un elemento del vector B especificamente el 5
       B.removeElement(5);
       //mostrar elementos vector b con el elemento 5 eliminado y el elemento 20 no considerado (aliminamos el "At") para este caso
       System.out.println("Elementos del vector B adicionando");
       for (int i=0; i < B.size(); i++ ) {
    	   System.out.println("v["+i+"]: "+B.get(i));
       }
       System.out.println(" ");
       
	}

}
