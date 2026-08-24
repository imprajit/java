import java.util.Scanner;
class Person 
{
     private int age ;
     void setage(int age)
     {
        this.age = age;
     }
      int  getage()
     {
        return age;
     }
}
  class question58
  {
    @SuppressWarnings("resource")
   public static void main(String[]args)
    { Scanner scan = new Scanner(System.in);
    Person p1 = new Person();
    System.out.print("Enter your age:");
     int age = scan.nextInt();
     p1.setage(age);
     System.out.print(p1.getage());
        
    }
  } 