import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;
class Reader{
    public static void main(String[]args)
    {
         try
         {
            Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name:");
        String name = sc.nextLine();
      System.out.print("Enter you age:");
       int age= sc.nextInt();
        FileWriter file = new FileWriter("user.txt");
        file.write("Name:"+name+"\n");
        file.write("Age:"+age);
        file.close();
        System.out.println("Successful!");
            File files = new File("user.txt");
            Scanner scan = new Scanner(files);
            String readname = "";
            int readage = 0;
             while(scan.hasNextLine())
             {
                String data = scan.nextLine();
                if (data.startsWith("Name:")) {
                    readname = data.substring(5);
                }
                else if (data.startsWith("Age:")) {
                    readage = Integer.parseInt(data.substring(4));
                }
             }
             scan.close();
             System.out.println("Name:"+readname);
             System.out.println("Age:"+readage);
         }
         
         catch(FileNotFoundException e)
         {
            System.out.print("There is no such a file");
         }
          catch(IOException e)
        {
            System.out.print("Something got wrong");
        }
    }
}