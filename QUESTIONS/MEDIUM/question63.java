import java.util.Scanner;
class Main 
{
    public static void main(String[]args)
    {
        try(Scanner scan = new Scanner(System.in)){
            System.out.print("Enter a Number:");
            double a = scan.nextInt();
            System.out.print("Enter an another number:");
            double b = scan.nextInt();
            double c = a/b;
            System.out.print("Answer:"+c);
        }
        catch( Exception e)
        {
            System.out.print("Please put a Integer ");
        }
    }
}