import java.util.Scanner;
class Main{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        int score = 0;
        System.out.println("-----ZEN QUIZ-----");
        System.out.println("Answer all the question with option like (1/2) not answer!");
        System.out.println(" 1.Which keyword is used to create a class in Java?:");
         System.out.println("1. class");
         System.out.println("2.Main"); 
         System.out.print("Option:");
         int q1 = scan.nextInt();
       switch(q1)
       {
        case 1:
            score += 2; 
            break;
        case 2:
            score = score - 1;
            break;
       default:
                System.out.print("I said 1 and 2 are the option!");
       }
       System.out.println("2.Which method is the starting point of a Java program?:");
       System.out.println("1. main()");
        System.out.println("2. Main()");
            System.out.print("Option:");
           int q2 = scan.nextInt();
        switch(q2)
       {
        case 1:
            score += 2; 
            break;
        case 2:  
           score = score - 1;
            break; 
        default:
                System.out.print("I said 1 and 2 are the option!");
       }
       System.out.println("3.Which data type is used to store whole numbers?");
        System.out.println("1. integer");
        System.out.println("2. int");
          System.out.print("Option:");
          int q3 = scan.nextInt();
        switch(q3)
       {
        case 1:
            score = score - 1;
            break;
        case 2: 
           score = score + 2 ;
            break;
         default:
                System.out.print("I said 1 and 2 are the option!");      
       }
       System.out.println("4.Which symbol is used to end a statement in Java?");
        System.out.println("1. :");
        System.out.println("2. ;");
          System.out.print("Option:");
           int q4 = scan.nextInt();
        switch(q4)
       {
        case 1:
            score = score - 1;
            break;
        case 2: 
         score += 2;  
            break;
        default:
                System.out.print("I said 1 and 2 are the option!");     
       }
       System.out.println("5.Which keyword is used to create an object in Java?");
        System.out.println("1. new");
        System.out.println("2. start"); 
          System.out.print("Option:");
           int q5 = scan.nextInt();
        switch(q5)
       {
        case 1:
            score += 2;
            break;
        case 2:
            score = score - 1;
            break; 
         default:
                System.out.print("I said 1 and 2 are the option!");      
       }
       if (score < 0) {
    score = 0;
}
       System.out.println("\n----- RESULT -----");
       System.out.println("Your score: " + score + "/10");
    }
}