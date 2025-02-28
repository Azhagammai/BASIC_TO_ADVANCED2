import java.util.Scanner;

public class NumberToWord {
    public static String convertNumberToWord(int i) {
        switch (i) {
            case 1: return "ONE";
            case 2: return "TWO";
            case 3: return "THREE";
            case 4: return "FOUR";
            case 5: return "FIVE";
            case 6: return "SIX";
            case 7: return "SEVEN";
            case 8: return "EIGHT";
            case 9: return "NINE";
            case 10: return "TEN";
            default: return "INVALID INPUT! Please enter a number between 1 and 10.";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (1-10): ");
        if (scanner.hasNextInt()) {  // Ensures valid integer input
            int number = scanner.nextInt();
            System.out.println("Word: " + convertNumberToWord(number));
        } else {
            System.out.println("Error: Please enter a valid integer.");
        }

        scanner.close();
    }
}
