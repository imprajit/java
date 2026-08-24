import java.util.Scanner;
class Invalidmark extends Exception
{
    Invalidmark(String message)
    {
        super(message);
    }
}
class checkmark
{
    public static void check(int mark) throws Invalidmark
    {
        if(mark < 0 || mark >= 100)
        {
            throw new Invalidmark("It should under 100 or above 0");
        }
        System.out.print("Valid mark:"+mark);
    }
}
class question65
{
    public static void main(String[]args)
    {
        try{
             Scanner scan = new Scanner(System.in);
        System.out.print("Enter the marks");
        int mark = scan.nextInt();
        checkmark.check(mark);
    } 
      catch (Invalidmark e) {

            System.out.println(e.getMessage());

        } catch (Exception e) {

            System.out.println("Please enter a valid number.");

        }
  
}
}

