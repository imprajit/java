import java.util.HashMap;
import java.util.Scanner;
class BankAccount
{
    double balance = 0;
    void Despoist(double amount)
    {
        balance = balance + amount;
        System.out.println("In the Wallet:" + amount +" Rupees");
    }
    void Withdraw(double amount)
    {
        if(balance>=amount)
        {
            balance = balance - amount;
            System.out.println("Withdraw:"+amount +" Rupees");
        }
        else {
            System.out.println("Insufficient Balance");
        }
    }
}
class question52{
    public static void main(String[]args)
    {
        HashMap< String , Integer > passcode = new HashMap<>();
         passcode.put( "Elon Musk" , 4352);
         passcode.put( "Larry Page" , 3535);
        passcode.put("Surya.R" , 7765);
         passcode.put( "Prajit.R" , 3224);

         HashMap<String , Integer> balanceMap = new HashMap<>();
           balanceMap.put("Elon Musk" , 8000);
           balanceMap.put("Larry Page" , 25000);
           balanceMap.put("Surya.R" , 37562);
           balanceMap.put("Prajit.R" , 78543);      

        Scanner sc = new Scanner(System.in);
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
            System.out.println("Incorrect Username for the Password");
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
        BankAccount obj1 = new BankAccount();
        obj1.balance = balanceMap.get(userLoggedIn);
        System.out.println("In the Wallet " + obj1.balance + " Rupees");
        System.out.print("How much do you want to withdraw:");
        double amount = sc.nextDouble();
        obj1.Withdraw(amount );
        System.out.println("Balance:"+obj1.balance + " Rupees");
        sc.close();
         }

    }
