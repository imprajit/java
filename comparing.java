import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner (System.in);
        System.out.print("Enter a number:");
        int num1 = num.nextInt();
        System.out.print("Enter another number:");
        int num2 =num.nextInt();
         String result= num1>num2?"true":"false";
         System.out.print(result);
    }
}