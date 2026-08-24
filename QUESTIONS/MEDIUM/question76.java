import java.util.Scanner;
class Main{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the choice through number:");
        int choice = scan.nextInt();
        switch(choice)
        {
            case 1:
                System.out.print("OPTION 1");
                break;
            case 2:
                System.out.print("OPTION 2");
                break;
             case 3:
                System.out.print("OPTION 3");
                break;
            default:
                System.out.print("Wrong option");

        } 
    }
}