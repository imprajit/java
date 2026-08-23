import java.util.Scanner;
class Main{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        char[] arr = str.toCharArray();
        int count = 0;
        for(char c:arr){
            count++;
        }
        System.out.print(count);
    }
}