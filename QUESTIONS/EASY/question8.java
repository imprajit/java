import java.util.Scanner;
class Main 
{
    public static void main(String [] args)
    {
      Scanner scan = new Scanner(System.in);
       System.out.print("Enter a number:");
       int a = scan.nextInt();
       if(a %2==0)
       {
        System.out.println("Even number");
       }
       else
       {
        System.out.println("Odd number");
       }
    }
}