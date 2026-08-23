import java.util.Scanner;
class Main{
    public static void main(String[]args)
    {
       Scanner scan = new Scanner(System.in);
       System.out.print("Enter the number:");
       int n = scan.nextInt();
      for(int i = 0;i<=n;i=i+2)
      {
        System.out.println(i);
      }
    }
}