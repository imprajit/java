import java.util.Scanner;
class eight {
    public static void main(String[] args) {
        Scanner scan= new Scanner (System.in);
       System.out.print("Enter your English mark:");
       String mark=scan.nextLine();
       System.out.print("Enter your Maths mark:");
       String markone=scan.nextLine();
       System.out.print("Enter your Science mark:");
       String marktwo=scan.nextLine();
       System.out.print("Enter your Social mark:");
       String markthree=scan.nextLine();
       System.out.print("Enter your Tamil mark:");
       String markfour=scan.nextLine();
        int english = Integer.parseInt(mark);
        int maths = Integer.parseInt(markone);
        int science = Integer.parseInt(marktwo);
        int social = Integer.parseInt(markthree);
        int tamil = Integer.parseInt(markfour);
        if (english >= 35 && maths >= 35 && science >= 35 && social >= 35 && tamil >= 35) 
        {
        {
            System.out.print("Superb! you have passed the exam");
        }
        else
        {
            System.out.print("Oops you have Failed the exam try next time  ");
        }
    }
}