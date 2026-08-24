import java.util.Arrays;
import java.util.Scanner;
class Main{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many names do you want?:");
          int num = scan.nextInt();
        String[] names = new String[num];
        for(int i=0;i<num;i++)
        {
            System.out.print("Enter the name " + (i+1) + ":");
            names[i] = scan.next();
        }
        Arrays.sort(names);
         System.out.println("Sorted names:");
        for(String name : names)
        {
          System.out.println(name);
        }
        
    }
}