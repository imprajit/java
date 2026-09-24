import java.util.Scanner;
import java.awt.Toolkit;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("===== COUNTDOWN TIMER =====");
        System.out.print("Enter hours: ");
        int hours = scan.nextInt();
        System.out.print("Enter minutes: ");
        int minutes = scan.nextInt();
        System.out.print("Enter seconds: ");
        int seconds = scan.nextInt();
        if (hours < 0 || minutes < 0 || seconds < 0) {
            System.out.println("Time cannot be negative!");
            return;
        }
        if (minutes >= 60 || seconds >= 60) {
            System.out.println("Minutes and seconds must be between 0 and 59!");
            return;
        }
        while (hours > 0 || minutes > 0 || seconds > 0) {
            System.out.printf("\r%02d:%02d:%02d", hours, minutes, seconds);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("\nTimer interrupted!");
                return;
            }
            if (seconds > 0) {
                seconds--;
            } else {
                seconds = 59;
                if (minutes > 0) {
                    minutes--;
                } else {
                    minutes = 59;
                    hours--;
                }
            }
        }
        System.out.print("\r00:00:00");
        Toolkit.getDefaultToolkit().beep();
        System.out.println("\nTIME'S UP!");
        scan.close();
    }
}