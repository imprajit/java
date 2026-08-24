interface Animal
{
    void Sound();
}
class Dog implements Animal
{
      public void Sound()
    {
        System.out.print("Dog Barks");
    }
}
class question56 
{
    public static void main(String[]args)
    {
          Dog d1 = new Dog();
          d1.Sound();
    }
}