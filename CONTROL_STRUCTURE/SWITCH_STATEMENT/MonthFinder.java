import java.util.Scanner;

public class MonthFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the month number (1-12): ");

        if (scanner.hasNextInt()) {  // Check if input is an integer
            int month = scanner.nextInt();

            switch (month) {
                case 1 -> System.out.println("January");
                case 2 -> System.out.println("February");
                case 3 -> System.out.println("March");
                case 4 -> System.out.println("April");
                case 5 -> System.out.println("May");
                case 6 -> System.out.println("June");
                case 7 -> System.out.println("July");
                case 8 -> System.out.println("August");
                case 9 -> System.out.println("September");
                case 10 -> System.out.println("October");
                case 11 -> System.out.println("November");
                case 12 -> System.out.println("December");
                default -> System.out.println("Invalid input! Please enter a number between 1 and 12.");
            }
        } else {
            System.out.println("Invalid input! Please enter a valid integer.");
        }

        scanner.close();
    }
}
