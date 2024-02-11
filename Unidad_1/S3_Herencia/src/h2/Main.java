package h2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double input;
        Scanner scanner = new Scanner(System.in);
        Circle circle = new Circle(0);
        Triangle triangle = new Triangle(0, 0, 0, 0, 0);
        triangle.calcArea();
        triangle.calcPerimeter();

        System.out.println();
        System.out.println("Circulo: ");
        System.out.print("Ingrese radio: ");
        input = scanner.nextDouble();
        circle.setRadius(input);
        circle.calcArea();
        circle.calcPerimeter();
        System.out.printf("Área: %.2f", circle.getArea());
        System.out.printf("Perímetro: %.2f", circle.getPerimeter());

        System.out.println();
        System.out.println("Triángulo: ");
        System.out.print("Ingrese base: ");
        input = scanner.nextDouble();
        triangle.setBase(input);
        System.out.print("Ingrese altura: ");
        input = scanner.nextDouble();
        triangle.setHeight(input);
        circle.calcArea();
        System.out.print("Ingrese lado 1: ");
        input = scanner.nextDouble();
        triangle.setSide1(input);
        System.out.print("Ingrese lado 2: ");
        input = scanner.nextDouble();
        triangle.setSide2(input);
        System.out.print("Ingrese lado 3: ");
        input = scanner.nextDouble();
        triangle.setSide3(input);
        circle.calcPerimeter();
        System.out.printf("Área: %.2f", triangle.getArea());
        System.out.printf("Perímetro: %.2f", triangle.getPerimeter());
    }
}
