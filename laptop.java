 public class laptop
{
 String name;
}
class Mobile
{
    String name1;
}
class Bike 
{
    int price;
}
 class Main
{
 public static void main(String [] args)
    {
        laptop lap1 = new laptop();
        lap1.name = "Acer";
         laptop lap2 = new laptop();
        lap2.name = "HP";
        System.out.println(lap1.name);
        System.out.println(lap2.name);
        Mobile mob1 = new Mobile();
        mob1.name1 = "Samsung";
        System.out.println(mob1.name1);
         Bike bi1 = new Bike();
        bi1.price = 10000;
        System.out.println(bi1.price);
    }
}