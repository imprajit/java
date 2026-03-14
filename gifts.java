
import java.util.Scanner;
class gifts {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int num= scan.nextInt();
      if(num >=90) 
    {
        System.out.print("I will buy you a Macbook pro");
    }
    else if(num >=60)
    {
        System.out.print("I will buy you a Iphone");
    }
    else if(num >=35)
    {
        System.out.print("I will buy a video game for you");
    }
    else
    {
        System.out.print("No gift if you absent ");
    }
    scan.close();
}
}