import java.util.Scanner;
class Main{
    public static void main(String[]args)
    {
         Scanner scan = new Scanner(System.in);
         System.out.print("Enter the password:");
         String passcode = scan.nextLine();
         if(passcode.length() >= 10)
         {
            System.out.print("Bro! I think your password is very tough to hack");
         }
         else{
            System.out.print("eww! your password is pathetic");
         }
    }
}