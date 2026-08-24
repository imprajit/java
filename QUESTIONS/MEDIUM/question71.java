import java.util.Scanner;
class Main
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Sentence:");
        String sentence = sc.nextLine();
        System.out.print("The word you want to replace:");
        String oldword = sc.next();
        System.out.print("The new word:");
        String updatedword = sc.next();
        String result = sentence.replace(oldword,updatedword);
        System.out.print(result);
    }
}