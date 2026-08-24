import java.util.Scanner;
import java.util.ArrayList;
class Main{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
          ArrayList<String> names = new ArrayList<>();
        System.out.print("How many names you want to store?");
        int number = scan.nextInt();
        scan.nextLine();
        for(int i=0;i<number;i++)
        {
            System.out.print("Enter the name:");
            String name = scan.nextLine();
            names.add(name);
        }
          // Display the names got from user  
        System.out.println("\nNames: " + names);
        System.out.print("Do you want to remove a name(yes/no)");
        String choice = scan.nextLine();
       switch(choice)
       {
        case "yes":
            System.out.print("How many names do you want to remove?:");
            int noms = scan.nextInt();
            scan.nextLine();
            for(int i=0;i<noms;i++)
            {
                  System.out.print("Enter the name you want to remove:");
                  String nomes = scan.nextLine();
                  names.remove(nomes);
            }
              break;
         case "no":
             System.out.println("Updated names: " + names);  
             default:
                System.out.print("Invalid choice");   
       }
           System.out.print("Do you want add name?(yes/no)");
            String more = scan.nextLine();
            switch(choice)
            {
                case "yes":
                 System.out.print("How many names do you want to add?:");
                 int ads = scan.nextInt();
                  scan.nextLine();

                 for(int i=0;i<ads;i++)
                 {
                    System.out.print("Enter the name you want to add:");
                    String പേര് = scan.nextLine();
                    names.add(പേര്);
                 }  
                 case "no":
                    System.out.print("finalised names:" + names);
            }

    }
}