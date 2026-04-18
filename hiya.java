//package start_java;

 abstract class Vehicle  {
	 
  abstract  void speed();
   void Brand ()
   {
	   System.out.println("XO");
   }
 }
 class Bike extends Vehicle
 {
	 void speed()
	 {
		 System.out.println("Bike = 67KM/HR");
	 }
 }
 class Car extends Vehicle
 {

	@Override
	void speed() {
		// TODO Auto-generated method stub
		System.out.println("Car = 67KM/HR");
	}
	 
 }
public class hiya{    
 
	public static void main(String[] args) {
		Bike b1 =  new Bike();
	    b1.Brand();
	    b1.speed();
	    Car c1 = new Car();
	    c1.speed();
	}

}
