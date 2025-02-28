import java.util.Scanner;

public class DayOfTheWeek {
    public static String getDayOfWeek(int day) {
        return switch (day) {
            case 1 -> "SUNDAY";
            case 2 -> "MONDAY";
            case 3 -> "TUESDAY";
            case 4 -> "WEDNESDAY";
            case 5 -> "THURSDAY";
            case 6 -> "FRIDAY";
            case 7 -> "SATURDAY";
            default -> "INVALID INPUT! Please enter a number between 1 and 7.";
        };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the day number (1-7): ");
        if (scanner.hasNextInt()) {  // Check if input is a valid integer
            int day = scanner.nextInt();
            System.out.println("Day: " + getDayOfWeek(day));
        } else {
            System.out.println("Error: Please enter a valid integer.");
        }

        scanner.close();
    }
}
