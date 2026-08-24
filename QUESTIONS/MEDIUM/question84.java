import java.util.Scanner;
class Main{
    public static void main(String[]args)
    {
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter the email address:");
      String email = scan.nextLine();
       if (email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            System.out.println("Valid email");
        } else {
            System.out.println("Invalid email");
        }
      scan.close();
    }
}