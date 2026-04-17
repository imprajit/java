class Person
{
    String name ;
    Person(String name)
    {
       this.name = name ;
    }
}
class Employee extends Person
{
    Employee(String name)
    {
        super(name);
    }
}
 class Main {
public static void main(String [] args)
{
    Employee e1 = new Employee("Prajit");
    System.out.println(e1.name);
}
 }
