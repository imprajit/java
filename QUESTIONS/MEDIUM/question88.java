import java.util.Scanner;
class Main{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("----------STUDENT GRADE CALCULATOR----------");
        System.out.print("Enter the Maths mark:");
        int mark1 = scan.nextInt();
          System.out.print("Enter the Physics mark:");
        int mark5 = scan.nextInt();  
        System.out.print("Enter the Chemistry mark:");
        int mark4 = scan.nextInt(); 
         System.out.print("Enter the English mark:");
        int mark3 = scan.nextInt();
          System.out.print("Enter the Language2 mark:");
        int mark2 = scan.nextInt();
          System.out.print("Enter the Social mark:");
        int mark0 = scan.nextInt();
         int total = mark0 + mark1 + mark2 + mark3 + mark4 + mark5;
         if(total<210)
         {
            System.out.print("eww failure");
         }
         else if (total==210)
         {
            System.out.print("Just pass");
         }
          else if (total<=300)
         {
            System.out.print("D grade");
         } else if (total<=400)
         {
            System.out.print("C grade");
         }
        else if (total<=450)
         {
            System.out.print(" B grade");
         }else if (total<=500)
         {
            System.out.print("B+ grade");
         }else if (total<550)
         {
            System.out.print("A grade");
         } 
         else if (total<580)
         {
            System.out.print("A+ grade");
         }
         else if(total==600)
         {
            System.out.print("Bro you next level!");
         }
    }
}