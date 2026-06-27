import java.io.FileWriter;
import java.io.File;
import java.io.BufferedWriter;
class Main{
    public static void main(String[]args)
    {
         System.out.println(new File("output.txt").getAbsolutePath());
        
       try
        {
           FileWriter Fw = new FileWriter("output.txt" );
           BufferedWriter bw = new BufferedWriter(Fw);
           bw.write("I will wait!");
            bw.close();
           
            System.out.print("Login SuccessFul");
        }
        catch(Exception e)
        {
            System.out.print("Sorry Please try later ");
        }
      
    }
}