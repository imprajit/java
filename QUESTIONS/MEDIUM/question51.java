class Student
{
    String name;
    int roll ; 
    int mark;
}
class question51{
    public static void main(String[]args)
    {
        Student obj1 = new Student();
        obj1.name = "Prajit.R";
        obj1.roll = 82 ;
       obj1.mark = 98;
        System.out.println("Name:"+obj1.name);
         System.out.println("Roll Number:"+obj1.roll+"**");
          System.out.print("Mathematics:"+obj1.mark);
    }
}