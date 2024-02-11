package metodo2;

public class aoutmovil {
	  int precio;
      String nombre;
      int  numeroPasajeros;
      String color;
      Double velocidad;
      Double peso;
	//constructor precio y nombre
      public aoutmovil(int precio, String nombre) {
		super();
		this.precio = precio;
		this.nombre = nombre;
		System.out.println("Precio : "+ precio );
		System.out.println("nombre : "+ nombre );
	}
      
      
     //constructor de precio, nombre y numero pasajeros
      public aoutmovil(int precio, String nombre, int numeroPasajeros) {
  		super();
  		this.precio = precio;
  		this.nombre = nombre;
  		this.numeroPasajeros = numeroPasajeros;
  		System.out.println("Precio : "+ precio );
  		System.out.println("nombre : "+ nombre );
  		System.out.println("Número de pasajeros : "+ numeroPasajeros);
  		
      }

  //constructor de precio, nombre , numero pasajeros y  color
	public aoutmovil(int precio, String nombre, int numeroPasajeros, String olor) {
		super();
		this.precio = precio;
		this.nombre = nombre;
		this.numeroPasajeros = numeroPasajeros;
		this.color = olor;
		System.out.println("Precio : "+ precio );
  		System.out.println("nombre : "+ nombre );
  		System.out.println("Número de pasajeros : "+ numeroPasajeros);
  		System.out.println("color : "+ color);
		
	}

//constructor de precio, nombre , numero pasajeros, color y velocidad
public aoutmovil(int precio, String nombre, int numeroPasajeros, String color, Double velocidad) {
	super();
	this.precio = precio;
	this.nombre = nombre;
	this.numeroPasajeros = numeroPasajeros;
	this.color = color;
	this.velocidad = velocidad;
	System.out.println("Precio : "+ precio );
		System.out.println("nombre : "+ nombre );
		System.out.println("Número de pasajeros : "+ numeroPasajeros);
		System.out.println("color : "+ color);
		System.out.println("velocidad : "+ velocidad);
}
//constructor de precio, nombre , numero pasajeros, color, velocidad y peso

public aoutmovil(int precio, String nombre, int numeroPasajeros, String color, Double velocidad, Double peso) {
	super();
	this.precio = precio;
	this.nombre = nombre;
	this.numeroPasajeros = numeroPasajeros;
	this.color = color;
	this.velocidad = velocidad;
	this.peso = peso;
}
      
	   
      
      

	
      
      
      
      
      
      
      
      }



	
	

	
	
	
	
	
	

