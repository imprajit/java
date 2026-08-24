import java.util.Scanner;
import java.util.HashMap;
class Main{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        HashMap<String , Double> items = new HashMap<>();
        items.put("Pen" , 50.44);
        items.put("Pencil" , 5.0);
        items.put("60 pages Notebook", 20.0);
        items.put("120 pages Notebook", 50.0);
        items.put("Cartrigde(3pieces)" , 10.0);
        items.put("Eraser", 5.0);
        System.out.println("------ AVAILABLE ITEMS ------");

        for (String item : items.keySet()) {
            System.out.println(item + "\u20B9" + items.get(item));
        }
        System.out.print("How many items are you buying:");
        int num = scan.nextInt();
        scan.nextLine();
          double grandTotal = 0;
           double total = 0 ;
           double price = 0;
        System.out.println("\n------ BILL ------");

        for (int i = 0; i < num; i++) {

            System.out.print("Enter the item: ");
            String item = scan.nextLine();

            if (items.containsKey(item)) {

                System.out.print("Enter quantity: ");
                int quantity = scan.nextInt();
                scan.nextLine();

                 price = items.get(item);
                total = price * quantity;

              
                grandTotal += total;

            } else {
                System.out.println("Item not found!");
                i--;
            }
        }

        System.out.println("-------------------");
        System.out.printf("Total: \u20B9"+  grandTotal);

        scan.close();
}
}