package h2;

public class Figure {
    protected double area;
    protected double perimeter;

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void calcArea() {
        area = 0.0;
    }

    public void calcPerimeter() {
        perimeter = 0.0;
    }
}
