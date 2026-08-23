class Add{
    int addition(int a , int b)
    {
        int c = a + b;
        return c;
    }
}
class question29 
{
    public static void main(String[]args)
    {
        Add obj1 = new Add();
        int Result = obj1.addition(10,3);
        System.out.println("Result:"+Result);
    }
}