import java.util.LinkedHashMap;
import java.util.Scanner;
class Main{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        LinkedHashMap<String, Double> prices = new LinkedHashMap<>();
        prices.put("Pen", 10.0);
        prices.put("Pencil", 5.0);
        prices.put("Eraser", 5.0);
        prices.put("Scale", 20.0);
        prices.put("40 pages Notebook", 40.0);
        prices.put("80 pages Notebook", 70.0);
        prices.put("120 pages Notebook", 90.0);
        prices.put("Atomic Habit", 1500.0);
        System.out.println("---------- ITEMS & PRICE ----------");
        System.out.printf("%-25s %s%n", "ITEMS", "PRICE");
        for (String item : prices.keySet()) {
            System.out.printf("%-25s %.2f%n", item, prices.get(item));
        }
        System.out.print("How many items do you want (in numbers):");
        int num = scan.nextInt();
        scan.nextLine();
        double total = 0;
        for(int i = 1;i<=num;i++)
        {
            System.out.print("Enter the item you want:");
           String  item = scan.nextLine();
            System.out.print("Enter the quantity (in numbers):");
            int quantity = scan.nextInt();
             scan.nextLine();
              total = total + (quantity * prices.get(item));
        }    
          System.out.print("Grant Total: "+total);
}
}