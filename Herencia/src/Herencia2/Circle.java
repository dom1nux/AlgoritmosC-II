package Herencia2;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void calcArea() {
        super.calcArea();
        area = Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void calcPerimeter() {
        super.calcPerimeter();
        perimeter = 2.0 * Math.PI * radius;
    }
}
