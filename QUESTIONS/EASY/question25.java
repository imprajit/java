import java.util.Scanner;
class Main 
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int original =n;
        int rev=0;
        while(n>0)
        {
            int lastdigit = n%10;
            rev = rev*10+lastdigit;
             n = n/10;
        }
        if(original==rev)
        {
           System.out.print("Palindrome number");
        }
        else {
            System.out.print("Not Palindrome");
        }
        
    }
}