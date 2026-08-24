import java.util.Scanner;
class SimpleInterest
{
      static double SimpleInterest(double p , double r , double t)
    {
        return(p*r*t)/100;
    }
}
class question89
{
    public static void main(String[]args)
    {
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter the priciple:");
      double p = scan.nextDouble();
      System.out.print("Enter the rate of interest:");
      double r = scan.nextDouble();
      System.out.print("Enter the time in years:");
       double t = scan.nextDouble();
      System.out.print(SimpleInterest.SimpleInterest(p , r , t));
    }
}