import java.util.Scanner;
class Main 
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter some words:");
        String s1 = sc.nextLine();
         System.out.print("Now enter some word again and I will prove that I am watching you!:");
         String s2 = sc.nextLine();
         if(s1.length() != s2.length())
         {
            System.out.print("Nah bro its not equal and I proved that I am watching you");
         }
         else 
         {
            boolean some = true;
            for(int i=0; i<s2.length();i++)
            {
                if(s1.charAt(i) != s2.charAt(i))
                {
                    some = false;
                    break;
                }
            }
            if(some)
         {
            System.out.print("Didn't I said I'm watching you its same, isn't it!");
         }
         else{
            System.out.print("Nah bro its not equal and I proved that I am watching you!");
         }
         }
         
    }
}