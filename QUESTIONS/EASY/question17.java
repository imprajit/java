import java.util.Scanner;
class Main 
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
      double pi = 3.14;
      System.out.print("Enter the first Radius:");
      double r = scan.nextDouble();
       System.out.print("Enter the second Radius:");
      double r2 = scan.nextDouble();
      System.out.println("Area:"+pi*r*r2);
    }
}