import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        try (Scanner num = new Scanner(System.in)) {
            System.out.print("Enter a number:");
            int num1 = num.nextInt();
            String s = "Enter another number:";
            System.out.print(s);
            int num2 = num.nextInt();
            String result = num1 > num2 ? "true" : "false";
            System.out.print(result);
        }
    }
}