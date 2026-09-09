import java.util.Random;
import java.util.Scanner;
class Main 
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
         Random random = new Random();

        int secretNumber = random.nextInt(100) + 1;
        int guess;
        int attempts = 0;
        System.out.println(" Guess the number between 1 and 100!");
       while(true)
       {
        System.out.print("Enter the guess:");
        guess = scan.nextInt();
          attempts++;
          if(guess<secretNumber)
          {
            System.out.println("Too low");
          }
        else if(guess>secretNumber)
          {
            System.out.println("Too high");
       } 
       else{
            System.out.println("Correct! ");
                System.out.println("You got it in " + attempts + " attempts.");
                break;
       }
    }
     scan.close();
    }
}