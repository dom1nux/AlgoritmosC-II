public class Persona {
    private String nombre;
    private int edad;

    //CONSTRUCTOR
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public void mostrar() {
        System.out.println("El nombre es: "+nombre);
        System.out.println("La edad es:" +edad);
    }
}
