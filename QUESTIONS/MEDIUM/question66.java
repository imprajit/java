import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
class filewriter{
    public static void main(String[]args)
    { 
        try{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name:");
        String name = sc.nextLine();
        FileWriter file = new FileWriter("user.txt");
        file.write("Name:"+name);
        file.close();
        System.out.print("Successful!");
        }
        catch(IOException e)
        {
            System.out.print("Something got wrong");
        }
    }
}
