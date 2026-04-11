import java.util.Scanner;
public class school{
    String passorfail(int num1)
    {
        if (num1 <35)
        {
            System.out.println("Try more buddy");
            return "Fail";
        }
      
      else {
        System.out.println("Great work");
        return "Pass";
      }
    }
    public static  void main(String args[]){
        Scanner total_mark = new Scanner(System.in);
        System.out.print("Enter your mark:");
        int num1  = total_mark.nextInt();
       school obj1 = new school();
        String result = obj1.passorfail(num1);
        System.out.println(result);
        
    }
}