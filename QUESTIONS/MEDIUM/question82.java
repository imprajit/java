import java.util.ArrayList;
import java.util.Scanner;
class Student
{
    String name;
    int age;
     Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
class question82{
    public static void main(String[]args)
    {
      Scanner scan = new Scanner(System.in);
       ArrayList<Student> students = new ArrayList<>();
      System.out.print("How many name/names are you storing?:");
      int nom = scan.nextInt();
      scan.nextLine();
      for(int i=0;i<nom;i++)
      {
        System.out.print("Enter the student name:");
        String name = scan.nextLine();
        System.out.print("Enter the Age:");
        int age = scan.nextInt();
           scan.nextLine();
        students.add(new Student(name,age));
      }
        System.out.println("Students");
           for (Student student : students) {
            System.out.println(student.name + ":" + student.age);
        }

    }
}