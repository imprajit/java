import java.util.Scanner;
class Main 
{
    public static void main(String [] args)

    {
        // Here I'm going get Input for the Integer and String
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter your Name: ");
       String name = scan.nextLine();
       System.out.print("Enter your age: ");
       int age = scan.nextInt();
       System.out.println("Hi,"+name);
       System.out.print("Your age is "+age);
    }
}