package square;
public class Square {
    private String name = "";
    private double sideLength = 0;

    Square(String name, double sideLength) {
        this.name = name;
        this.sideLength = sideLength;
    }

    public void setName(String nombre) {
        this.name = nombre;
    }

    public void setSideLength(double lado) {
        this.sideLength = lado;
    }

    public void show() {

        System.out.println();
        System.out.printf("El perimetro del cuadrado %s es ", name);
        System.out.printf("%.2f", sideLength * 4);
        System.out.printf(" y el área es %.2f ", Math.pow(sideLength, 2));

    }

}
