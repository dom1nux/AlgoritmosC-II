package ejercicio3;

public class Empleado {
    private String nombresEmpleado;
    private String apellidosEmpleado;
    private String lugarNacimiento;
    private String fechaNacimiento;

    public String getNombresEmpleado() {
        return nombresEmpleado;
    }

    public void setNombresEmpleado(String nombresEmpleado) {
        this.nombresEmpleado = nombresEmpleado;
    }

    public String getApellidosEmpleado() {
        return apellidosEmpleado;
    }

    public void setApellidosEmpleado(String apellidosEmpleado) {
        this.apellidosEmpleado = apellidosEmpleado;
    }

    public String getLugarNacimiento() {
        return lugarNacimiento;
    }

    public void setLugarNacimiento(String lugarNacimiento) {
        this.lugarNacimiento = lugarNacimiento;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    // Constructor
    public Empleado(String nombre, String apellidos, String lugarNacimiento, String fechaNacimiento) {
        setNombresEmpleado(nombre);
        setApellidosEmpleado(apellidos);
        setFechaNacimiento(fechaNacimiento);
        setLugarNacimiento(lugarNacimiento);
    }

    // Sobrecarga de métodos para mostrar la información
    public void mostrarInformacion() {
        System.out.printf("Nombre y Apellidos: %s %s\n", getNombresEmpleado(), getApellidosEmpleado());
    }

    public void mostrarInformacionCompleta() {
        System.out.printf("Nombre y Apellidos: %s %s\n", getNombresEmpleado(), getApellidosEmpleado());
        System.out.printf("Lugar de Nacimiento: %s\n", getLugarNacimiento());
        System.out.printf("Fecha de Nacimiento: %s\n", getFechaNacimiento());
    }
}
