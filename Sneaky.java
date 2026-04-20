


abstract class Animal {
	abstract void makesound();
	String name;
	Animal(String name)
	{
		this.name = name;
	}
}
  class Dog extends Animal
  {
	  Dog(String name)
	  {
		  super(name);
		  System.out.println(name);
	  }
	   void makesound()
	   {
		   System.out.println("BOW .. BOW.");
	   }
  }
  class Cat extends Animal
  {
	  Cat(String name)
	  {
		  super(name);
		  System.out.println(name);
	  }
	 
	  void makesound()
	  {
		  System.out.println("MEOW..MEOW");
	  }
  }

public class Sneaky {

	public static void main(String[] args) {
		Cat c1 = new Cat("Sneaky");
		c1.makesound();
		Dog d1 = new Dog("Lambo");
		d1.makesound();
	}
	
	
}

