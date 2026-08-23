import java.util.Scanner;
class Main 
{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first number:");
        int a = scan.nextInt();
        System.out.print("Enter the second number:");
        int b = scan.nextInt();
        if(a>b)
        {
            System.out.println(a+" is the greatest number");
        }
        else if(a<b)
        {
            System.out.println(b+" is the greatest number");
        }
        else
        {
            System.out.println("Both are equal");
        }
    }
}