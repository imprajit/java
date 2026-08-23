import java.util.Scanner;
class Main
{
  public static void main(String []args)
  {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a number:");
    int num = scan.nextInt();
    if(num>0)
    {
      System.out.println("Positive Number");
    }
    else if(num<0)
    {
      System.out.println("Negative number");
    }
    else
    {
      System.out.println("Zero");
    }
  }
}
