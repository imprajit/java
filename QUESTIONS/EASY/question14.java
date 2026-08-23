import java.util.Scanner;
class Main 
{
    public static void main(String []args)
    {
      Scanner scan = new Scanner(System.in);
      double Minutes = scan.nextDouble();
      double Hour = Minutes/60;
      System.out.print(Hour+" Hour "+Minutes+" Minutes");
    }
}