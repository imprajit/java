// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
      Scanner num = new Scanner (System.in);
      System.out.print("Enter the loan amount you want:");
      int amount=num.nextInt();
      System.out.print("Enter your Salary:");
      int salary = num.nextInt();
      System.out.print("Enter your age:");
      int age = num.nextInt();
      if (age>=25 && salary>=20000 )
      {
          System.out.print("You are eligible for the loan");
      }
      else if (amount>=50000)
     {
         System.out.print("The maximum amount of loan is 50000");
     }
     else 
     {
         System.out.print("You are not eliglible for the loan");
     }
    }
}
