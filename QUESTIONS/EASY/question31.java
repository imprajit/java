import java.util.Scanner;
class Main
{
    public static  void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        switch(num){
        case 1: System.out.print("Its Monday");
        break;
        case 2: System.out.print("Its Monday"); 
        break;
        case 3: System.out.print("Its Tuesday"); 
        break;
        case 4: System.out.print("Its Wednesday");
        break;
        case 5: System.out.print("Its Thursday");
        break;
        case 6: System.out.print("Its Friday");
        break;
        case 7: System.out.print("Its Saturday");
        break;
        default: System.out.print("Enter a valid number");
        }
    }
}