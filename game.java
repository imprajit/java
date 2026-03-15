import java.util.Scanner;
class Main {
    public static void main(String[] args) {
     Scanner scan = new Scanner (System.in);
     System.out.print("Enter the score:");
     int num = scan.nextInt();
    if(num<=50)
    {
        System.out.print("You need to improve");
    }
    else if(num>51 && num<69)
    {
        System.out.print("Good job");
    }
    else if(num>=70) 
    {
       System.out.print("Superb Performance"); 
    }
    
    }
    }
