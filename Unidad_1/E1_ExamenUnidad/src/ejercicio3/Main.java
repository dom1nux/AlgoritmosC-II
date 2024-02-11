package ejercicio3;

public class Main {
    public static void main(String[] args) {
        // Ejemplo de uso
        Empleado empleado = new Empleado("Franco", "Diaz", "Chachapoyas", "16/02/2004");

        // Llamadas a los métodos de sobrecarga
        empleado.mostrarInformacion();
        System.out.println("---------");
        empleado.mostrarInformacionCompleta();
    }
}
