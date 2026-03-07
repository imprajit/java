import java.util.Scanner;
class Main {
    public static void main(String args[]){
        Scanner scan= new Scanner (System.in);
         int income= scan.nextInt();
      if (income > 7000)
      {
        System.out.print("Eligible for Scholarship");
      }     
      else
      {
        System.out.print("You are not eligible for Scholarship");
      }
    }  
}