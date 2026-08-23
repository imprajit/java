import java.util.Scanner;
class Main 
{
    public static void main(String[]args)
    {
       Scanner scan = new Scanner(System.in);
          System.out.print("Enter the Principle:");
       double P = scan.nextDouble();
          System.out.print("Enter the Number of Year:");
        double N = scan.nextDouble();
           System.out.print("Enter the Rate of Interest:");
          double R = scan.nextInt();
        double SI = P*N*R /100;
        System.out.println("Simple Interest:"+SI);
    }
}