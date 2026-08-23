import java.util.Scanner;
class Main{
    public static void main(String []args)
    {
       Scanner scan = new Scanner(System.in);
       System.out.print("Enter the Number:");
       int n = scan.nextInt();
       for(int i=1;i<=n;i=i+1)
       {
        System.out.println(i);
       }
    } 
}