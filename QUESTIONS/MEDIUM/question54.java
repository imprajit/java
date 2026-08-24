class Demo1 
{
    void method()
    {
        System.out.print("Nothing");
    } 
}
class Demo2 extends Demo1
{
    void method()
    {
       System.out.print("Something");
    }
}
class question54
{
    public static void main(String []args)
    {
        Demo2 obj1 = new Demo2();
        obj1.method();
    }
}