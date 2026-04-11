public class schoolstudent 
{
    int mark;
    String name;
     schoolstudent(int a , String b)
      {
          mark = a ;
          name = b;
      }
    public static void main(String [] args)
    {
      schoolstudent obj1 = new  schoolstudent(97,"Prajit");
      System.out.println(obj1.mark);
      System.out.println(obj1.name);
    }
}