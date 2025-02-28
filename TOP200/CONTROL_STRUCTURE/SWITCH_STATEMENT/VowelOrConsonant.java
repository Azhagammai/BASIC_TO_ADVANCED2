import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a single character: ");
        char ch = scanner.next().charAt(0);

        // Check if it's an alphabet letter
        if (!Character.isLetter(ch)) {
            System.out.println("Invalid input! Please enter an alphabet letter.");
        } else {
            switch (Character.toLowerCase(ch)) {
                case 'a', 'e', 'i', 'o', 'u' -> System.out.println("Vowel");
                default -> System.out.println("Consonant");
            }
        }

        scanner.close();
    }
}
