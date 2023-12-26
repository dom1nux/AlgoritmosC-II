public class CUADRADO {
  private String  nombre = "";
     private double lado = 0;

   public CUADRADO (String nombre, double lado ) {
       this.nombre = nombre;
       this.lado=lado;

   }
      public void setNombre(String nombre){
       this.nombre = nombre;
}
    public void setLado(double lado){
        this.lado = lado;
    }
    public void mostrar() {

        System.out.println();
        System.out.print("el cudrado, " + nombre + " tiene ");
        System.out.print("de perimetro = " + lado*4);
        System.out.print(" y el área es = " +  Math.pow(lado, 2 ));

   }


}



