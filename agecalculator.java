import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.DateTimeException;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Let's calculate your age and birthday!");
        System.out.print("Enter the exact date you were born: ");
        int day = scan.nextInt();
        System.out.println("Enter the month in number ");
        System.out.print("Enter the exact month you were born: ");
        int month = scan.nextInt();
        System.out.print("Enter the exact year you were born: ");
        int year = scan.nextInt();
        LocalDate today = LocalDate.now();
        try {
            LocalDate birthDate = LocalDate.of(year, month, day);
            if (birthDate.isAfter(today)) {
                System.out.println("You cannot enter a future birth date!");
                return;
            }
            Period age = Period.between(birthDate, today);
            System.out.println();
            System.out.println("Your age is: " + age.getYears() + " years");
            LocalDate nextBirthday = LocalDate.of(today.getYear(),month,day);
            if (!nextBirthday.isAfter(today)) {
                nextBirthday = nextBirthday.plusYears(1);
            }
            long daysUntil = ChronoUnit.DAYS.between(today,nextBirthday);
            System.out.println("Your next birthday: " + nextBirthday);
            System.out.println(  "Your next birthday is in " + daysUntil + " days!");
            if (birthDate.getMonthValue() == today.getMonthValue()
                    && birthDate.getDayOfMonth() == today.getDayOfMonth()) {
                System.out.println(" Happy Birthday! ");
            }
        } catch (DateTimeException e) {
            System.out.println("Invalid date! Please enter a real date.");
        }
        scan.close();
    }
}