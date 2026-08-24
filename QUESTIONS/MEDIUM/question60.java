class Animal 
{
    String name = "Type of Animal:";
}
class Dog extends Animal
{
    void ani(){
         System.out.print(super.name);
          System.out.print(animal);
    }
    String animal = "Dog";
   
}
class question60
{
    public static void main(String[]args)
    {
        Dog d1 = new Dog();
        d1.ani();
    }
}