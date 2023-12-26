import java.util.Scanner;
public class MainT {
    public static void main(String[] args) {
        Scanner Ss= new Scanner(System.in);
        Triangle t1 = new Triangle(0,0,0,0);
        System.out.println("Ingresa el valor de la base:");
        t1.setB(Ss.nextInt());
        System.out.println("Ingresa el valor de la altura:");
        t1.setH(Ss.nextInt());
        System.out.println("Ingresa el valor del primer lado:");
        t1.setL1(Ss.nextInt());
        System.out.println("Ingresa el valor del segundo lado:");
        t1.setL2(Ss.nextInt());

        t1.Display();

    }
}
