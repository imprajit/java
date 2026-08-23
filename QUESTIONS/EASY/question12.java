import java.util.Scanner;
class Main
{
    public static void main(String [] args)
    {
       Scanner scan = new Scanner(System.in);
       double  c = scan.nextInt();
       double f = c*9/5 +32;
       System.out.println(f+" Fahrenheit");
    }
}