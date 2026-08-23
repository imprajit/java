import java.util.Scanner;
class Main 
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        int count=0;
        int n = scan.nextInt();
        while(n!=0)
        {
            n=n/10;
            count=count+1;
        }
        System.out.print(count);
    }
}