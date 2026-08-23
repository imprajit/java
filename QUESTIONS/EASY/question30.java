import java.util.Scanner;
class Main 
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your age:");
        int age = scan.nextInt();
        if(age<0 || age>100)
        {
            System.out.print("Invalid Age");
        }
        else 
        {
            System.out.print("Valid Age");
        }
    }
}