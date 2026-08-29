import java.util.Scanner;
class Main{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Number to find the square");
        int num = scan.nextInt();
        double root = Math.sqrt(num);
        System.out.print("Square root:"+root);
    }
}