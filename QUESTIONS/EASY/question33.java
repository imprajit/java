import java.util.Scanner;
class Main{
    public static void main(String[]args)
    {
     Scanner scan = new Scanner(System.in);
     char ch = scan.next().charAt(0);
     if(ch >='A' && ch <='Z')
     {
        System.out.print("Uppercase Letter");
     }
     else {
        System.out.print("Lowercase Letter");
     }
      char lower = (char) (ch+32);
      System.out.println( "The Lowercase letter:"+lower);
    }
}
