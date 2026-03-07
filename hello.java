
import java.util.Scanner ;
class hello {
    public static void main(String[] args) {
        Scanner scan= new Scanner (System.in);
        System.out.print("Enter a number:");
        int num1=scan.nextInt();
    if (num1 %3==0  )  
    {
        System.out.print("This number is Divisible by 3");
    }
    else if (num1 %5==0)
    {
        System.out.print("This number is Divisible by 5");
    }
    else 
    {
        System.out.print("This is not neither Divisible by 3 or 5");
    }
    }
}