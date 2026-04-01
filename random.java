import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count=0;
        do
        {
            System.out.println("Enter the  number > 10");
             count = scan.nextInt();
        }
         while(count<10);
    }
}