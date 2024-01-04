package Herencia2;

public class Triangle extends Figure {
    protected double base;
    protected double height;
    protected double side1;
    protected double side2;

    protected double side3;


    public Triangle(double base, double height, double side1, double side2, double side3) {
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }
    public void setSide3(double side2) {
        this.side2 = side2;
    }


    @Override
    public void calcArea() {
        super.calcArea();
        area = (base * height) / 2;
    }

    @Override
    public void calcPerimeter() {
        super.calcPerimeter();
        perimeter = base + side1 + side2 ;
    }
}
