public class Circle {
    final static double PI = 3.14159;

    private String name = "";
    private double radius = 0;

    public Circle(String name, int radius) {
        this.name = name;
        this.radius = radius;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double area() {
        return PI * Math.pow(radius, 2);
    }

    public double circumference() {
        return 2 * PI * radius;
    }
}
