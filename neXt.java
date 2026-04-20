//package package_one;
   abstract class Vehicle
   {
	   final void  startEngine()
	   
	   {
		   System.out.println("Engine Starts ");
	   }
	   static String getVehicletype()
	   {
		   return "Generic Vehicle";
	   }
	   abstract void Drive() ;
   }
   class car extends Vehicle
   {
	   void Drive()
	   {
		   System.out.println("Drive a Car");
	   }
   }
   class bike extends Vehicle
   {
	   void Drive()
	   {
		   System.out.println("Drive a Bike");
	   }
   }
public class neXt {

	public static void main(String[] args) {
		System.out.println(Vehicle. getVehicletype());
		car c1 = new car();
		c1.Drive();
		c1.startEngine();
		System.out.println(Vehicle. getVehicletype());
		bike b1 = new bike();
		b1.Drive();
		b1.startEngine();
	}
	
	
}

