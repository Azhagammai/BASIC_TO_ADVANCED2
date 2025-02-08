package DATE_TIME;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Scanner;

public class DateValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter day: ");
        int day = sc.nextInt();

        try {
            LocalDate date = LocalDate.of(year, month, day);
            System.out.println("Valid Date: " + date);
        } catch (DateTimeException e) {
            System.out.println("Invalid Date");
        }
        sc.close();
    }
}
