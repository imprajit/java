import java.util.Scanner;
class Main
{
    public static void main(String[]args)
    {
       Scanner scan = new Scanner(System.in);
       System.out.print("Enter the Number");
       int n = scan.nextInt();
       int sum = 0;
        for(int i = 0; i<=n;i=i+1)
        {
            sum = sum+i;
        }
        System.out.print(sum);
    }
}