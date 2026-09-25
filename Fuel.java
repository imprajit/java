import java.util.Scanner;
class main{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter distance travelled (km):");
        double distance = scan.nextDouble();
        System.out.print("Enter vehicle mileage (km/litre):");
        double mileage = scan.nextDouble();
        System.out.print("Enter petrol price per litre:");
        double fuelPrice = scan.nextDouble();
          double fuelNeeded = distance / mileage;
        double price = fuelNeeded * fuelPrice;
         System.out.println("Fuel needed: "+fuelNeeded +" litres");
         System.out.print("Fuel cost: "+price);
    }
}