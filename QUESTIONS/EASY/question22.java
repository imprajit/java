import java.util.Scanner;
class Main 
{
    public static void main(String[]args)
    {
       Scanner scan = new Scanner(System.in);
       int n = scan.nextInt();
        int fact = 1;
        for(int i=1;i<=n;i=i+1)
        {
            fact = fact*i;
        } 
        System.out.print(fact);
    }
}