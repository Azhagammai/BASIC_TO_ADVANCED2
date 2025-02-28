import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the month number (1-12): ");
        int month = scanner.nextInt();

        int days = 0;  // Variable to store the number of days

        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> days = 31;
            case 4, 6, 9, 11 -> days = 30;
            case 2 -> {
                System.out.print("Enter the year: ");
                int year = scanner.nextInt();

                switch ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ? 1 : 0) {
                    case 1 -> days = 29; // Leap year
                    default -> days = 28; // Non-leap year
                }
            }
            default -> System.out.println("Invalid input! Please enter a number between 1 and 12.");
        }

        if (month >= 1 && month <= 12) {
            System.out.println("The month has " + days + " days.");
        }

        scanner.close();
    }
}
