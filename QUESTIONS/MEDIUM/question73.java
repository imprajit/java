import java.util.Scanner;
class Main{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("1.Convert Number to String");
        System.out.println("2.Convert String to Number");
         System.out.print("Enter the choice number you pick:");
         int choice = scan.nextInt();
         scan.nextLine();
           switch(choice)
           {
            case 1 :
                System.out.print("Enter a number:");
                int num = scan.nextInt();
                scan.nextLine();
                String str = String.valueOf(num);
                System.out.print("Coverted String:"+str);
                break;
            case 2 :
                System.out.print("Enter a numeric string:");
                String text = scan.nextLine();
                int numb = Integer.parseInt(text);
                System.out.print("Converted Number:"+numb);
                break;
                default:
                    System.out.print("Invalid choices!");
           }
    }
}