class Animal
{
    String name;
    int age ;
    void Makesound()
    {
     System.out.println("Animal makes sound");
    }
}
 class Dog extends Animal
    {
       String breed;
        void Makesound()
    {
     System.out.println("boww.bow..");
    }
     void fetch()
     {
        System.out.println("Dog is fetching");
     }
    }
    class Cat extends Animal
    {
    String breed ;
      void Makesound()
    {
     System.out.println("meow mewow...");
    }
    void climbs()
    {
        System.out.println("Cat is climbing");
    }
    }
public class Zoo
{
    public static void main(String [] args)
    {
      Dog d1 = new Dog();
      d1.name = "tutu";
      d1.age = 12;
      d1.Makesound();
      d1.fetch();
      d1.breed = "Husky";
        System.out.println(d1.name);
        System.out.println(d1.breed);
        Cat c1 = new Cat();
        c1.name = "Sneaky";
        c1.age = 5;
        c1.Makesound();
        c1.climbs();
        c1.breed = "Persian";
         System.out.println(c1.name);
        System.out.println(c1.breed);
    }
}