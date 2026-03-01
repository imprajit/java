import java.util.Scanner;
 class fifth{
    public static void main(String args []){
        Scanner name= new Scanner (System.in);
        String user = name.nextLine();
        int num = name.nextInt();
         name.nextLine();
         String department = name.nextLine();
          System.out.println("My name is "+user);
          System.out.println("My age is" + num);
          System.out.print("My department is " + department);
 }
 }
