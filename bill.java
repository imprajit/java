import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the electric units consumed in two months: ");
        double unit = scan.nextDouble();
        double bill = 0;
        if (unit <= 100) {
            bill = 0;
        }
        else if (unit <= 200) {
            bill = (unit - 100) * 4.95;
        }
        else if (unit <= 400) {
            bill = (100 * 4.95) + ((unit - 200) * 6.45);
        }
        else if (unit <= 500) {
            bill = (100 * 4.95)+ (200 * 6.45) + ((unit - 400) * 8.55);
        }
        else if (unit <= 600) {
            bill = (100 * 4.95)+ (200 * 6.45) + (100 * 8.55)+ ((unit - 500) * 9.65);
        }
        else if (unit <= 800) {
            bill = (100 * 4.95) + (200 * 6.45)  + (100 * 8.55)  + (100 * 9.65) + ((unit - 600) * 10.70);
        }
        else if (unit <= 1000) {
            bill = (100 * 4.95)+ (200 * 6.45) + (100 * 8.55)  + (100 * 9.65)  + (200 * 10.70)  + ((unit - 800) * 11.80);
        }
        else {
            bill = (100 * 4.95)  + (200 * 6.45)   + (100 * 8.55) + (100 * 9.65) + (200 * 10.70)   + (200 * 11.80) + ((unit - 1000) * 12.15);
        }
        System.out.printf("Electricity bill: Sum of rupees only %.2f%n ", bill);
        scan.close();
    }
}