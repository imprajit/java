import java.util.Scanner;
class hi {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.print("Enter the number:");
       long  num = scan.nextLong();
     if(num %2==0)
     {
         System.out.print("This is a even number");
     }
     else
     {
         System.out.print("This a odd number ");
     }
    }
}