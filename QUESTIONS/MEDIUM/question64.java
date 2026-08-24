import java.util.Scanner;
import java.util.InputMismatchException;
class Main{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        try{
        System.out.print("Enter the size:");
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i =0;i<size;i++)
        {
            nums[i]=scan.nextInt();
        }
          System.out.println("You entered elements:");
            for (int i = 0; i < size; i++) {
            System.out.println(nums[i]); 
    }
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array access error: " + e);
        } catch (InputMismatchException e) {
            System.out.println("Enter a Number");
        } catch (Exception e) {
            System.out.println("Other error: " + e);
        } finally {
            scan.close();
        }

}

}