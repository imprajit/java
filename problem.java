class Vechile
{
    String brand ;
    int year ;
    void startEngine()
    {
    }
}
class Car extends Vechile
{
     String fuelType;
      void startEngine()
    {
         System.out.println("Car engine starts ");
        
    }
     void drive()
         {
            System.out.println("Car is driving");
         }
}
class truck extends Vechile
{
    int loadCapacity;
    void startEngine()
    {
         System.out.println(" Truck engine starts ");
    }
    void haul()
    {
         System.out.println("Truck is haul");
    }
}
public class problem {
    public static void main(String [] args)
    {
        Vechile v1 = new Vechile();
        v1.brand = "Tata";
        v1.year = 2000;
        Car c1 = new Car();
        c1.fuelType = "Diesel";
        System.out.println(v1.brand);
        System.out.println(v1.year);
         System.out.println( c1.fuelType);
         c1.startEngine();
         c1.drive();
         truck t1 = new truck();
         t1.loadCapacity = 2000;
         t1.startEngine();
         t1.haul();
         System.out.println( t1.loadCapacity);
    }
}