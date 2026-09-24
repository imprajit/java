
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("1. Calculate Distance");
        System.out.println("2. Calculate Speed");
        System.out.println("3. Calculate Time");
        System.out.print("Choose: ");
        if (!scan.hasNextInt()) {
            System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            scan.close();
            return;
        }
        int choice = scan.nextInt();
        scan.nextLine();
        if (choice < 1 || choice > 3) {
            System.out.println("Invalid choice. Please choose 1, 2, or 3.");
            scan.close();
            return;
        }
        switch (choice) {
            case 1:
                System.out.print("Enter the speed (km/h): ");
                if (!scan.hasNextDouble()) {
                    System.out.println("Invalid speed.");
                    break;
                }
                double speed = scan.nextDouble();
                scan.nextLine();
                if (speed <= 0) {
                    System.out.println("Speed must be greater than 0.");
                    break;
                }
                System.out.print("Enter the time (hours): ");
                if (!scan.hasNextDouble()) {
                    System.out.println("Invalid time.");
                    break;
                }
                double time = scan.nextDouble();
                scan.nextLine();
                if (time <= 0) {
                    System.out.println("Time must be greater than 0.");
                    break;
                }
                double distance = speed * time;
                distance = Math.floor(distance * 100) / 100;
                System.out.println("Your distance is: " + distance + " km");
                break;
            case 2:
                System.out.print("Enter the distance (km): ");
                if (!scan.hasNextDouble()) {
                    System.out.println("Invalid distance.");
                    break;
                }
                distance = scan.nextDouble();
                scan.nextLine();
                if (distance <= 0) {
                    System.out.println("Distance must be greater than 0.");
                    break;
                }
                System.out.print("Enter the time (hours): ");
                if (!scan.hasNextDouble()) {
                    System.out.println("Invalid time.");
                    break;
                }
                time = scan.nextDouble();
                scan.nextLine();
                if (time <= 0) {
                    System.out.println("Time must be greater than 0.");
                    break;
                }
                speed = distance / time;
                speed = Math.floor(speed * 100) / 100;
                System.out.println("Your speed is: " + speed + " km/h");
                break;
            case 3:
                System.out.print("Enter the distance (km): ");
                if (!scan.hasNextDouble()) {
                    System.out.println("Invalid distance.");
                    break;
                }
                distance = scan.nextDouble();
                scan.nextLine();
                if (distance <= 0) {
                    System.out.println("Distance must be greater than 0.");
                    break;
                }
                System.out.print("Enter the speed (km/h): ");
                if (!scan.hasNextDouble()) {
                    System.out.println("Invalid speed.");
                    break;
                }
                speed = scan.nextDouble();
                scan.nextLine();
                if (speed <= 0) {
                    System.out.println("Speed must be greater than 0.");
                    break;
                }
                time = distance / speed;
                time = Math.floor(time * 100) / 100;
                System.out.println("Your time is: " + time + " hours");
                break;
        }
        scan.close();
    }
}
