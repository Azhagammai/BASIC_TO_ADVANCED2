import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int number = scanner.nextInt();

        if (number > 0) {
            int reversed = 0;
            while (number > 0) {
                int digit = number % 10;  // Extract last digit
                reversed = reversed * 10 + digit; // Append digit to reversed number
                number /= 10; // Remove last digit
            }
            System.out.println("Reversed Number: " + reversed);
        } else {
            System.out.println("Invalid input! Please enter a positive number.");
        }

        scanner.close();
    }
}
