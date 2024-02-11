package metodo;

public class Perro {
        String nombre;
        String raza;
        
        //metodo constructor
        
		public Perro(String nombre, String raza) {
			super();
			this.nombre = nombre;
			this.raza = raza;
		}
        // metodo to string
       @Override
        public String toString () {
    	   
    	   return "Perro [nombre= " + nombre + ",raza=" + raza + "]";
       }
       public void mostrar () {
    	   System.out.println(nombre+raza);
       }
       
       
}
