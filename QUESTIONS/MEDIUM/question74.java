import java.util.Scanner;
class Main{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a sentence:");
        String sentence = scan.nextLine();
        String[] word = sentence.trim().split("\\s+");
        System.out.println(" Word of the sentence: ");
        for(int i=0;i<word.length;i++)
        {
           System.out.println(word[i]);
        }       
    }
}