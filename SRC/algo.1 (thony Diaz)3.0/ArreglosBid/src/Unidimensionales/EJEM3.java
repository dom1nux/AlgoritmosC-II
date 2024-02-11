package Unidimensionales;

public class EJEM3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String nombre = "Rosa";
    String apellido = "Melano";
    // el "%s %s" sirve para dar un foramto ( espacio) / agregar "format" ene el codigo)
    String nombrecompleto = String.format("%s %s" , nombre, apellido);
    System.out.print(nombrecompleto);
	}

}
