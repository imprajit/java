class Name 
{
    String name;
    Name(String name)
    {
        this.name = name;
    }
    void display()
    {
       System.out.print("Name:"+ this.name);
    }
}
class question59
{
    public static void main(String[]args)
    {
        Name n1 = new Name("Prajit");
        n1.display();
    }
}