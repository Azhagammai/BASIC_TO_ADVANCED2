import java.util.Scanner;

public class NumberToRoman {
    public static String convertToRoman(int number) {
        return switch (number) {
            case 1 -> "I";
            case 2 -> "II";
            case 3 -> "III";
            case 4 -> "IV";
            case 5 -> "V";
            case 6 -> "VI";
            case 7 -> "VII";
            case 8 -> "VIII";
            case 9 -> "IX";
            case 10 -> "X";
            default -> "INVALID INPUT! Please enter a number between 1 and 10.";
        };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (1-10): ");
        if (scanner.hasNextInt()) {  // Validate input
            int number = scanner.nextInt();
            System.out.println("Roman numeral: " + convertToRoman(number));
        } else {
            System.out.println("Error: Please enter a valid integer.");
        }

        scanner.close();
    }
}
