package NESTED_IF_ELSE_STATEMENT;
import java.util.Scanner;

public class OptimizedDayFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input Year, Month, and Day
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter day (1-31): ");
        int day = scanner.nextInt();

        // Adjust month and year for Zeller's Congruence (Jan & Feb are counted as months 13 & 14 of previous year)
        if (month < 3) {
            month += 12;
            year -= 1;
        }

        int k = year % 100;  // Last two digits of year
        int j = year / 100;  // First two digits of year (century)

        // Zeller's Congruence Formula
        int dayIndex = (day + (13 * (month + 1)) / 5 + k + (k / 4) + (j / 4) + (5 * j)) % 7;

        // Map result to actual day (Zeller’s formula: 0 = Saturday, 1 = Sunday, ..., 6 = Friday)
        String[] daysOfWeek = { "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" };

        // Output the day of the week
        System.out.println("The given date falls on a: " + daysOfWeek[dayIndex]);

        scanner.close();
    }
}
