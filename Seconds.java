import java.util.Scanner;
class Main{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner (System.in);
        System.out.println("----------CONVERT HOURS TO SECONDS----------");
        System.out.print("Hours:");
        int Hours = scan.nextInt();
         System.out.print("Minutes:");
          int Minutes = scan.nextInt();
          System.out.print("Seconds:");
         int Seconds = scan.nextInt(); 
         int totalseconds = (Hours * 3600) + (Minutes * 60) + Seconds; 
         System.out.print("Seconds: "+totalseconds);
    }
}