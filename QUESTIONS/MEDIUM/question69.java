import java.util.Scanner;
class main{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter some words:");
        String sentence = scan.nextLine();
        sentence = sentence.trim();
        if(sentence.isEmpty())
        {
            System.out.print("Nah bro it has no words!");
        }
        else{
            String[] words = sentence.split("\\s+");
            System.out.print("Number of words:"+words.length);
        }
    }
}