import java.util.Scanner;
import java.util.HashMap;
class main{
    public static void main(String[]args)
    {
       Scanner sc = new Scanner(System.in);
       HashMap< String , Integer > passcode = new HashMap<>();
       passcode.put( "Elon Musk" , 4352);
        passcode.put( "Larry Page" , 3535);
        passcode.put("Surya.R" , 5435);
         passcode.put( "Prajit.R" , 3224);

          int attemps = 0;
        boolean loginSucessful = false;
        String userLoggedIn = "";
        while(attemps < 3) {
        System.out.print("Enter the Username:");
        String name = sc.nextLine().trim();

         System.out.print("Enter the Password:");
         int Password = sc.nextInt();
         sc.nextLine();

          if(!passcode.containsKey(name))
          {
            System.out.println("Incorrect Username");
          }
          
          else if(passcode.get(name)!= Password)
          {
            System.out.println("Incorrect Password");
          }

           else 
           {
            System.out.println("Login Sucessfull!");
            loginSucessful = true;
            userLoggedIn = name;
            break;
           }

           attemps++;
        }

           if(!loginSucessful)
           {
              System.out.println("Account locked");
              sc.close();
              return;
           }
    }
}