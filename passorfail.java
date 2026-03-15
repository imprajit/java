// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner marks = new Scanner(System.in);
     System.out.print("Enter your English mark:");
     int s = marks.nextInt();
      System.out.print("Enter your Maths mark:");
     int s1 = marks.nextInt();
      System.out.print("Enter your Science mark:");
     int s2 = marks.nextInt();
      System.out.print("Enter your Social studies mark:");
     int s3 = marks.nextInt();
      System.out.print("Enter your Tamil mark:");
     int s4 = marks.nextInt();
     int totalmarks = s+s1+s2+s3+s4 ;
     System.out.println("total marks:" +totalmarks  );
    int avg = totalmarks/5 ;
    System.out.println("Average:" +avg);
    if(avg<35)
    {
        System.out.print("Remarks:You need some Additional classes");
    }
    else
    {
        System.out.print("Remarks:Good job buddy");
    }
    }
}