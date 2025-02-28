import java.util.Scanner;

public class TimeDuration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter time duration in minutes: ");
        int totalMinutes = scanner.nextInt();

        switch (Integer.signum(totalMinutes)) { // Returns 1 for positive, 0 for zero, -1 for negative
            case 1 -> {
                int hours = totalMinutes / 60;
                int minutes = totalMinutes % 60;
                System.out.println("Time Duration: " + hours + " hour(s) " + minutes + " minute(s)");
            }
            case 0, -1 -> System.out.println("Enter a valid positive number of minutes.");
        }

        scanner.close();
    }
}
