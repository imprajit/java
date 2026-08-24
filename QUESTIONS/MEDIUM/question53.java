class Demo
{
    Demo()
    {
        System.out.print("Defult");
    }
    Demo(int a)
    {
       System.out.print("Value:"+a);
    }
}
class question53{
    public static void main(String[]args)
    {
        @SuppressWarnings("unused")
        Demo obj1 = new Demo(10);
        

    }
}