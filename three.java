import java.util.Scanner;
class three{
    public static void main(String args[]){
      Scanner name= new Scanner (System.in);
      System.out.print("Enter your name:");
      String user = name.nextLine();
      System.out.print("Enter your  age:");
      int num = name.nextInt();
      System.out.println("Hello! "+user+" " );
    }
}
