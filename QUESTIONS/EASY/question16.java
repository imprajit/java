import java.util.Scanner;
class Main 
{
    public static void main(String[]args)
    {
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter the Length:");
      double L = scan.nextDouble();
      System.out.print("Enter the Width:");
      double W = scan.nextDouble();
      double Area = L*W;
      System.out.println("Area:"+Area);
    }
}