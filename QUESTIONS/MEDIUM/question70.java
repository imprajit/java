import java.util.Scanner;
class Main{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a word:");
        String words = scan.nextLine();
        words = words.replaceAll("\\s+", "");
        System.out.print(words);
    }
}