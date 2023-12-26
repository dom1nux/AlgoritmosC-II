public class Triangle {
  private int B;
  private int H;
  private int L1;
  private int L2;

  public Triangle(int B, int H, int L1, int L2){
    this.B = B;
    this.H = H;
    this.L1 = L1;
    this.L2 = L2;

  }

  public void setB(int B){
    this.B = B;
  }
  public void setH(int H){
    this.H = H;
  }
  public void setL1(int L1){
    this.L1 = L1;
  }
  public void setL2(int L2){
    this.L2 = L2;
  }
  public void Display(){
    System.out.println();
    System.out.println();
    System.out.println("El área del triangulo es: " + (B*H)/2);
    System.out.println("--------------------------------");
    System.out.println("El perimetro del triangulo es: " + (B+L1+L2));

  }
}
