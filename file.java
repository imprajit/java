import java.util.Scanner;
import java.util.InputMismatchException;
class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int a=0;
       int b=0;
       int c=0;
       try
       {
       a = sc.nextInt();
        b = sc.nextInt();
        c =0;
       
       c = a/b;
       }
       catch( ArithmeticException e )
       {
           System.out.print("Please Do not enter Zero ");
       }
       catch(InputMismatchException e)
       {
          System.out.print(" Please Do not enter Alphabets");
       }
       if(c!=0){
       System.out.print( "The Final result of c is:"+c);
       }
    }
}