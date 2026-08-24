import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        StringBuilder result = new StringBuilder();

        while (true) {

            System.out.print("Enter a word (type stop to finish): ");
            String word = scan.next();

            if (word.equalsIgnoreCase("stop")) {
                break;
            }

            result.append(word).append(" ");
        }

        System.out.println("Joined String: " + result.toString().trim());

        scan.close();
    }
}