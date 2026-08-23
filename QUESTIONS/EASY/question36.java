import java.util.Scanner;
class Main{
    public static void main(String[]args)
    {
      Scanner scan = new Scanner(System.in);
      String str = scan.nextLine();
      int vowels = 0;
      int  consonants = 0;
      for(int i=0;i<str.length();i=i+1)
      {
        char ch = str.charAt(i);
        if(ch=='A'|| ch=='E'|| ch=='I'|| ch=='O'|| ch=='U'|| ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u')
        {
          vowels++;
        }
         else if(ch >= 'A'&& ch <= 'Z' || ch >= 'a' && ch <= 'z' )
         {
          consonants++;
         }
      }  
          System.out.println("This word as "+vowels+" Vowels");
          System.out.println("This word as "+consonants+" Consonants") ;
          char ch = str.charAt(0);
    }
}

