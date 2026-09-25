import java.util.Random;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowercase = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String special = "!@#$%^&*";

        String characters = uppercase + lowercase + numbers + special;

        System.out.print("Enter password length: ");
        int length = scan.nextInt();

        if (length <= 0) {
            System.out.println("Password length must be greater than 0.");
            scan.close();
            return;
        }

        String password = "";

        for (int i = 0; i < length; i++) {

            int index = random.nextInt(characters.length());

            password = password + characters.charAt(index);
        }

        System.out.println("Generated password: " + password);

        scan.close();
    }
}